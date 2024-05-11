USE team19_projectdb;
--SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS evaluation;

CREATE EXTERNAL TABLE evaluation (model STRING, f1 DOUBLE, accuracy DOUBLE) 
row format SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
tblproperties ("skip.header.line.count"="1");

load data inpath '../team19/project/output/evaluation.csv' overwrite into table evaluation;
SELECT model, f1 FROM evaluation;



DROP TABLE IF EXISTS model1_predictions;
CREATE EXTERNAL TABLE model1_predictions(
    label DOUBLE,
    prediction DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
TBLPROPERTIES ("skip.header.line.count"="1");

load data inpath '../team19/project/output/model1_predictions/model1_predictions.csv' overwrite into table model1_predictions;

DROP TABLE IF EXISTS model2_predictions;
CREATE EXTERNAL TABLE model2_predictions(
    label DOUBLE,
    prediction DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
TBLPROPERTIES ("skip.header.line.count"="1");

load data inpath '../team19/project/output/model2_predictions/model2_predictions.csv' overwrite into table model2_predictions;

