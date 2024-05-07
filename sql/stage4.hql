USE team19_projectdb;
SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS evaluation;


CREATE EXTERNAL TABLE evaluation (model STRING, f1 DOUBLE) 
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\"")

LOCATION 'project/big-data-pipeline-project/output/evaluation.csv'
tblproperties ("skip.header.line.count"="1");
SELECT model, f1 FROM evaluation;

DROP TABLE IF EXISTS model1_predictions;


CREATE EXTERNAL TABLE model1_predictions (label DOUBLE, prediction DOUBLE) 
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\"")

LOCATION 'project/big-data-pipeline-project/output/model1_predictions.csv'
tblproperties ("skip.header.line.count"="1");
SELECT * FROM model1_predictions;
