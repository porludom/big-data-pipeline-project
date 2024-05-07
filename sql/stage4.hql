USE team19_projectdb;
SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS evaluation;


CREATE EXTERNAL TABLE evaluation (model STRING, f1 DOUBLE) 
--ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ',';
--WITH SERDEPROPERTIES (
--   "separatorChar" = ",",
--   "quoteChar"     = "\"")

--LOCATION 'project/big-data-pipeline-project/output/evaluation.csv'
--tblproperties ("skip.header.line.count"="1");

LOAD DATA INPATH 'project/big-data-pipeline-project/output/evaluation.csv' INTO TABLE evaluation;

SELECT model, f1 FROM evaluation;
