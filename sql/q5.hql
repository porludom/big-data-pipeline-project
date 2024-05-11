-- Relationship Between Temperature and Air Quality Indexes
USE team19_projectdb;
DROP TABLE IF EXISTS q5_results;

CREATE EXTERNAL TABLE q5_results(
    Temperature_Celsius FLOAT,
    Avg_US_EPA_Index FLOAT,
    Avg_GB_DEFRA_Index FLOAT
)

ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q5';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO TABLE q5_results
SELECT
    temperature_celsius,
    AVG(air_quality_us_epa_index) AS avg_us_epa_index,
    AVG(air_quality_gb_defra_index) AS avg_gb_defra_index
FROM
    weather_conditions
JOIN
    air_quality ON weather_conditions.location_id = air_quality.location_id  
GROUP BY
    temperature_celsius
ORDER BY
    temperature_celsius DESC;


SELECT *
FROM q5_results;
