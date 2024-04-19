-- Average Air Quality Metrics by Country
USE teamx_project19;
DROP TABLE IF EXISTS q4_results;

CREATE EXTERNAL TABLE q4_results(
    Country STRING,
    Avg_Carbon_Monoxide FLOAT,
    Avg_Ozone FLOAT,
    Avg_Nitrogen_Dioxide FLOAT,
    Avg_Sulphur_Dioxide FLOAT,
    Avg_PM2_5 FLOAT,
    Avg_PM10 FLOAT,
    Avg_US_EPA_Index INT,
    Avg_GB_DEFRA_Index INT
)

ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q4';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO TABLE q4_results
SELECT
    l.country,
    AVG(aq.air_quality_carbon_monoxide) AS avg_carbon_monoxide,
    AVG(aq.air_quality_ozone) AS avg_ozone,
    AVG(aq.air_quality_nitrogen_dioxide) AS avg_nitrogen_dioxide,
    AVG(aq.air_quality_sulphur_dioxide) AS avg_sulphur_dioxide,
    AVG(aq.air_quality_pm2_5) AS avg_pm2_5,
    AVG(aq.air_quality_pm10) AS avg_pm10,
    AVG(aq.air_quality_us_epa_index) AS avg_us_epa_index,
    AVG(aq.air_quality_gb_defra_index) AS avg_gb_defra_index
FROM
    locations l
JOIN
    air_quality aq ON l.id = aq.id
GROUP BY
    l.country
ORDER BY
    l.country;


SELECT *
FROM q4_results;
