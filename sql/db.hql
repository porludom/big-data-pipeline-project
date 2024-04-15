-- Drop database if exists and create a new database
DROP DATABASE IF EXISTS team19_projectdb CASCADE;
CREATE DATABASE team19_projectdb LOCATION "project/hive/warehouse";
USE team19_projectdb;

-- Create table for car prices
CREATE EXTERNAL TABLE air_quality STORED AS AVRO LOCATION 'project/warehouse/air_quality' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/air_quality.avsc');
CREATE EXTERNAL TABLE astronomical_data STORED AS AVRO LOCATION 'project/warehouse/astronomical_data' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/astronomical_data.avsc');
CREATE EXTERNAL TABLE locations STORED AS AVRO LOCATION 'project/warehouse/locations' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/locations.avsc');
CREATE EXTERNAL TABLE weather_conditions STORED AS AVRO LOCATION 'project/warehouse/weather_conditions' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/weather_conditions.avsc');

-- For checking the content of tables
SELECT * FROM weather_conditions LIMIT 10;
