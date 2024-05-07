USE team19_projectdb;
SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS evaluation;


CREATE EXTERNAL TABLE evaluation (model STRING, f1 DOUBLE) 
--ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
ROW FORMAT DELIMITED
LOCATION '/project/output/evaluation.csv'
FIELDS TERMINATED BY ',';
--WITH SERDEPROPERTIES (
--   "separatorChar" = ",",
--   "quoteChar"     = "\"")


--tblproperties ("skip.header.line.count"="1");

--LOAD DATA INPATH '/project/output/evaluation.csv' OVERWRITE INTO TABLE evaluation;

SELECT model, f1 FROM evaluation;
