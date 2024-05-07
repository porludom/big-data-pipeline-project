-- the most common weather condition for each country
USE team19_projectdb;
DROP TABLE IF EXISTS q3_results;

CREATE EXTERNAL TABLE q3_results(
    Country VARCHAR(255),
    Most_Common_Condition VARCHAR(255),
    Frequency INT
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q3';

SET hive.resultset.use.unique.column.names = false;

WITH ConditionCounts AS (
    SELECT
        loc.country,
        wc.condition_text,
        COUNT(*) AS condition_count
    FROM
        locations loc
    JOIN
        weather_conditions wc ON loc.id = wc.id
    GROUP BY
        loc.country, wc.condition_text
),
MaxConditions AS (
    SELECT
        country,
        MAX(condition_count) AS max_count
    FROM
        ConditionCounts
    GROUP BY
        country
)

INSERT INTO TABLE q3_results
SELECT
    cc.country AS Country,
    cc.condition_text AS Most_Common_Condition,
    cc.condition_count AS Frequency
FROM
    ConditionCounts cc
JOIN
    MaxConditions mc ON cc.country = mc.country AND cc.condition_count = mc.max_count
ORDER BY
    cc.country, cc.condition_count DESC;

SELECT *
FROM q3_results;
