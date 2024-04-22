USE team19_projectdb;
DROP TABLE IF EXISTS q1_results;

CREATE EXTERNAL TABLE q1_results(
    Moon_Phase STRING,
    Avg_Temperature_Celsius FLOAT,
    Avg_Moon_Phase FLOAT
)

ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q1';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO TABLE q1_results
SELECT
    moon_phase,
    AVG(temperature_celsius) AS avg_temp,
    AVG(humidity) AS avg_humidity
FROM astronomical_data_part ast
JOIN weather_conditions w ON ast.location_id = w.id
GROUP BY moon_phase;


SELECT *
FROM q1_results;
