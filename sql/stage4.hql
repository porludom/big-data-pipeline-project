CREATE EXTERNAL TABLE evaluation STORED AS AVRO LOCATION 'project/output/evaluation' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/evaluation.avsc');
--CREATE EXTERNAL TABLE locations STORED AS AVRO LOCATION 'project/warehouse/locations' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/locations.avsc');
--CREATE EXTERNAL TABLE weather_conditions STORED AS AVRO LOCATION 'project/warehouse/weather_conditions' TBLPROPERTIES ('avro.schema.url' = 'project/warehouse/avsc/weather_conditions.avsc');
