"""
Code for stage 3 in the project
"""
import os
from pyspark.sql import SparkSession
from pyspark.ml import Transformer
from pyspark.ml.util import DefaultParamsReadable, DefaultParamsWritable
from pyspark.sql.functions import col, sin, cos, radians
from pyspark.sql import DataFrame
from pyspark.ml.classification import DecisionTreeClassifier, RandomForestClassifier
from pyspark.ml.feature import StringIndexer, VectorAssembler
from pyspark.ml import Pipeline
from pyspark.ml.evaluation import MulticlassClassificationEvaluator
from pyspark.ml.tuning import ParamGridBuilder, CrossValidator
import pandas as pd


def run(command):
    """ function to run command in linux terminal"""
    return os.popen(command).read()


TEAM = 19
WAREHOUSE = "project/warehouse"

spark = SparkSession.builder\
        .appName(f"{TEAM} - spark ML")\
        .master("yarn")\
        .config("hive.metastore.uris",
                "thrift://hadoop-02.uni.innopolis.ru:9883")\
        .config("spark.sql.warehouse.dir", WAREHOUSE)\
        .config("spark.sql.avro.compression.codec", "snappy")\
        .enableHiveSupport()\
        .getOrCreate()

air_quality = spark.read.format("avro").table('team19_projectdb.air_quality')
locations = spark.read.format("avro").table('team19_projectdb.locations')
weather_conditions = spark.read.format("avro")\
                        .table('team19_projectdb.weather_conditions')

table_for_ML = air_quality.join(locations.withColumnRenamed("id", "location_id"), \
                                on=["location_id"], how="inner")\
                          .join(weather_conditions, on=["location_id"], how="inner")


class LatLongToECEF(Transformer, DefaultParamsReadable, DefaultParamsWritable):
    """
    Class of pyspark transformer from latitude and altitude
    to x, y, z in ECEF
    """

    def _transform(self, dataset: DataFrame) -> DataFrame:
        # WGS84 constants
        axis = 6378137.0  # semi-major axis
        e_2 = 6.6943799901377997e-3

        # Convert degrees to radians
        lat_rad = radians(col("latitude"))
        lon_rad = radians(col("longitude"))

        # Calculate ECEF coordinates
        n_value = axis / (1 - e_2 * sin(lat_rad) ** 2) ** 0.5

        x_value = n_value * cos(lat_rad) * cos(lon_rad)
        y_value = n_value * cos(lat_rad) * sin(lon_rad)
        z_value = (1-e_2) * n_value * sin(lat_rad)

        return dataset.withColumn("x", x_value)\
                      .withColumn("y", y_value)\
                      .withColumn("z", z_value)


ecof_transformer = LatLongToECEF()

indexer = StringIndexer(inputCol="condition_text", outputCol="label")

features = ["air_quality_carbon_monoxide", "air_quality_ozone",
            "air_quality_nitrogen_dioxide", "air_quality_pm2_5",
            "air_quality_pm10", "air_quality_us_epa_index",
            "air_quality_gb_defra_index", "temperature_celsius",
            "wind_kph", "wind_degree", "pressure_mb", "precip_mm",
            "humidity", "cloud", "feels_like_celsius",
            "visibility_km", "gust_mph", "x", "y", "z"]

assembler = VectorAssembler(inputCols=features, outputCol="features")
pipeline = Pipeline(stages=[indexer, ecof_transformer, assembler])
model = pipeline.fit(table_for_ML)
data = model.transform(table_for_ML)

(train_data, test_data) = data.randomSplit([0.75, 0.25], seed=10)

train_data.write\
    .mode("overwrite")\
    .format("json")\
    .save("project/data/train")

test_data.write\
    .mode("overwrite")\
    .format("json")\
    .save("project/data/test")

run("hdfs dfs -cat project/data/train/*.json > \
            ~/project/big-data-pipeline-project/data/train.json")
run("hdfs dfs -cat project/data/test/*.json > \
~/project/big-data-pipeline-project/data/test.json")

# FIRST MODEL TUNING
print("Training first model")
classifier_1 = DecisionTreeClassifier()

grid = ParamGridBuilder()
grid = grid.addGrid(classifier_1.maxDepth, [5, 7, 10])\
           .addGrid(classifier_1.maxBins, [16, 32, 64]).build()

evaluator = MulticlassClassificationEvaluator()\
  .setLabelCol("label")\
  .setPredictionCol("prediction")\
  .setMetricName("f1")

cv = CrossValidator(estimator=classifier_1,
                    estimatorParamMaps=grid,
                    evaluator=evaluator,
                    parallelism=5,
                    numFolds=3)

cvModel = cv.fit(train_data)
bestModel_1 = cvModel.bestModel
predictions = bestModel_1.transform(test_data)

evaluator_acc = MulticlassClassificationEvaluator()\
  .setLabelCol("label")\
  .setPredictionCol("prediction")\
  .setMetricName("accuracy")

f1_1 = evaluator.evaluate(predictions)
accuracy_1 = evaluator_acc.evaluate(predictions)

bestModel_1.write().overwrite().save("project/models/model1")

predictions.select(predictions['label'], predictions["prediction"])\
            .coalesce(1).write.csv('project/output/model1_predictions',
                                   header=True,
                                   mode="overwrite")

run("hdfs dfs -mv project/output/model1_predictions/*.csv \
project/output/model1_predictions/model1_predictions.csv")

run("hdfs dfs -cat project/output/model1_predictions/model1_predictions.csv > \
~/project/big-data-pipeline-project/output/model1_predictions.csv")

# SECOND MODEL TUNING
print("Training second model")
classifier_2 = RandomForestClassifier()

grid = ParamGridBuilder()
grid = grid.addGrid(classifier_2.maxDepth, [3, 5, 7])\
            .addGrid(classifier_2.maxBins, [8, 16, 32])\
            .addGrid(classifier_2.minInstancesPerNode, [1, 2, 4]).build()

evaluator = MulticlassClassificationEvaluator()\
  .setLabelCol("label")\
  .setPredictionCol("prediction")\
  .setMetricName("f1")

cv = CrossValidator(estimator=classifier_2,
                    estimatorParamMaps=grid,
                    evaluator=evaluator,
                    parallelism=5,
                    numFolds=3)

cvModel = cv.fit(train_data)
bestModel_2 = cvModel.bestModel

predictions = bestModel_2.transform(test_data)

evaluator_acc = MulticlassClassificationEvaluator()\
  .setLabelCol("label")\
  .setPredictionCol("prediction")\
  .setMetricName("accuracy")

accuracy_2 = evaluator_acc.evaluate(predictions)

f1_2 = evaluator.evaluate(predictions)

print("Saving everything from ML part")

bestModel_2.write().overwrite().save("project/models/model2")
predictions.select(predictions['label'], predictions["prediction"])\
            .coalesce(1).write.csv('project/output/model2_predictions',
                                   header=True,
                                   mode="overwrite")

run("hdfs dfs -mv project/output/model2_predictions/*.csv \
project/output/model2_predictions/model2_predictions.csv")
run("hdfs dfs -cat project/output/model2_predictions/model2_predictions.csv > \
~/project/big-data-pipeline-project/output/model2_predictions.csv")


run("hdfs dfs -get project/models/model1 \
~/project/big-data-pipeline-project/models/")
run("hdfs dfs -get project/models/model2 \
~/project/big-data-pipeline-project/models/")

comparison_data = {
    'model': [bestModel_1, bestModel_2],
    'f1': [f1_1, f1_2],
    'accuracy': [accuracy_1, accuracy_2]
}

# Create a Pandas DataFrame from the dictionary
comparison_df = pd.DataFrame(comparison_data)

comparison_df\
        .to_csv("~/project/big-data-pipeline-project/output/evaluation.csv",
                index=False,
                header=True)

run("hdfs dfs -put ~/project/big-data-pipeline-project/output/evaluation.csv \
project/output/evaluation.csv")
