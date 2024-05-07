--DROP DATABASE IF EXISTS team19_projectdb CASCADE;
--CREATE DATABASE team19_projectdb LOCATION "project/hive/warehouse";
USE team19_projectdb;


CREATE EXTERNAL TABLE IF NOT EXIST evaluation (model STRING, f1 DOUBLE,) 
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/output/evaluation.csv';



