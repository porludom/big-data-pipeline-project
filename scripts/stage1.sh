cd ~/project/big-data-pipeline-project
python3 ~/project/big-data-pipeline-project/scripts/build_projectdb.py
hdfs dfs -rm -r /user/team19/project/warehouse/*
cd ~/project/big-data-pipeline-project/output
rm *.java
rm *.avsc
sqoop import-all-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team19_projectdb --username team19 --password $(<~/password) --compression-codec=snappy --compress --as-avrodatafile --warehouse-dir=project/warehouse --m 1
cd ..
