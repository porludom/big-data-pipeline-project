USE team19_projectdb;

DROP TABLE IF EXISTS evaluation;
CREATE EXTERNAL TABLE evaluation (
    model STRING,
    f1 DOUBLE) 

CREATE EXTERNAL TABLE IF NOT EXISTS evaluation(model STRING, f1 DOUBLE) 
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
   "separatorChar" = ",",
   "quoteChar"     = "\"")
LOCATION 'project/output/evaluation.csv'
tblproperties ("skip.header.line.count"="1");
