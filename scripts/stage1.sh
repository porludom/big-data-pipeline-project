python scripts/build_projectdb.py
hdfs dfs -rm -r /user/team19/project/warehouse/*
sqoop import-all-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team19_projectdb --username team19 --password PxDhQyxhalNM21mA --compression-codec=snappy --compress --as-avrodatafile --warehouse-dir=project/warehouse --m 1
