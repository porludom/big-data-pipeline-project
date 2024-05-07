USE team19_projectdb;


CREATE EXTERNAL TABLE IF NOT EXISTS evaluation(model STRING, f1 DOUBLE) 
ROW FORMAT SERDE 'org.apache.hadoop.hive.serde2.OpenCSVSerde'
WITH SERDEPROPERTIES (
    "separatorChar" = ",",
    "quoteChar" = "\""
)
STORED AS TEXTFILE
LOCATION 'project/output/evaluation.csv';
