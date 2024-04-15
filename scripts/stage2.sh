hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc
password=$(head -n 1 secrets/.hive.pass)
beeline -u jdbc:hive2://hadoop-01.uni.innopolis.ru:10001 -n team19 -p $password -f sql/db.hql
beeline -u jdbc:hive2://hadoop-01.uni.innopolis.ru:10001 -n team19 -p $password -f sql/db.hql > output/hive_results.txt 2> /dev/null
