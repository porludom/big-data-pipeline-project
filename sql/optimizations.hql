USE team19_projectdb;

CREATE EXTERNAL TABLE astronomical_data_part
(
    location_id int,
    sunrise varchar(255),
    sunset varchar(255),
    moonrise varchar(255),
    moonset varchar(255),
    moon_illumination int
)
PARTITIONED BY (moon_phase varchar(255))
CLUSTERED BY (moonrise) into 5 buckets
STORED AS AVRO LOCATION 'project/hive/warehouse/astronomical_data_part' 
TBLPROPERTIES ('AVRO.COMPRESS'='SNAPPY');

SHOW PARTITIONS astronomical_data_part;

SET hive.exec.dynamic.partition.mode=nonstrict;
INSERT INTO astronomical_data_part partition (moon_phase)
    (SELECT id,
        sunrise,
        sunset,
        moonrise,
        moonset,
        moon_phase,
        moon_illumination
FROM astronomical_data);

DROP TABLE astronomical_data;
