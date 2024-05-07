DROP DATABASE IF EXISTS team19_projectdb CASCADE;
CREATE DATABASE team19_projectdb LOCATION "project/hive/warehouse";
USE team19_projectdb;


CREATE EXTERNAL TABLE IF NOT EXIST evaluation STORED AS AVRO LOCATION 'project/output/evaluation';
--CREATE EXTERNAL TABLE locations STORED AS AVRO LOCATION 'project/warehouse/locations' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/locations.avsc');
--CREATE EXTERNAL TABLE weather_conditions STORED AS AVRO LOCATION 'project/warehouse/weather_conditions' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/weather_conditions.avsc');
