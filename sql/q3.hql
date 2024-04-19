-- Impact of Moon Phases on Weather
USE teamx_project19;
DROP TABLE IF EXISTS q3_results;

CREATE EXTERNAL TABLE q3_results(
    Moon_Phase STRING,
    Avg_Temperature_Celsius FLOAT,
    Avg_Moon_Phase FLOAT
)

ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q3';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO TABLE q3_results
SELECT
    moon_phase,
    AVG(temperature_celsius) AS avg_temp,
    AVG(humidity) AS avg_humidity
FROM astronomical_data_part ast
JOIN weather_conditions w ON ast.location_id = w.id
GROUP BY moon_phase;


SELECT *
FROM q3_results;
