CREATE EXTERNAL TABLE employees_part(empno int, ename varchar(50), 
job varchar(50),
mgr int, 
hiredate date, 
sal decimal(10,2), 
comm decimal(10,2)) 
PARTITIONED BY (deptno int) STORED AS AVRO LOCATION 'project/hive/warehouse/employees_part' TBLPROPERTIES ('AVRO.COMPRESS'='SNAPPY');
