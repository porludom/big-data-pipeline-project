-- analyze average temperature, humidity, and air quality data for each location
USE teamx_project19;
DROP TABLE IF EXISTS q1_results;

CREATE EXTERNAL TABLE q1_results(
  Country STRING, 
  Location_Name STRING, 
  Average_Temperature_Celsius FLOAT, 
  Average_Humidity INTEGER, 
  Average_PM2_5 FLOAT
)

ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q1';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO TABLE q1_results
SELECT l.country,
       l.location_name,
       AVG(w.temperature_celsius) AS avg_temp_c,
       AVG(w.humidity) AS avg_humidity,
       AVG(a.air_quality_pm2_5) AS avg_pm2_5
FROM locations l
JOIN weather_conditions w ON l.id = w.id
JOIN air_quality a ON l.id = a.id
GROUP BY l.country,
         l.location_name
ORDER BY l.country,
         l.location_name;


SELECT *
FROM q1_results;
