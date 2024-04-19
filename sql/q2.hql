-- Count of Locations and Total Observations per Country
SELECT
    country,
    COUNT(DISTINCT location_name) AS location_count,
    COUNT(*) AS total_observations
FROM
    locations
GROUP BY
    country
ORDER BY
    location_count DESC;


USE teamx_project19;


DROP TABLE IF EXISTS q2_results;


CREATE EXTERNAL TABLE q2_results(
    Country STRING,
    Location_Count INT,
    Total_Observations BIGINT
)

ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q2';


INSERT INTO TABLE q2_results
SELECT
    country,
    COUNT(DISTINCT location_name) AS location_count,
    COUNT(*) AS total_observations
FROM
    locations
GROUP BY
    country
ORDER BY
    location_count DESC;


SELECT *
FROM q2_results;
