hdfs dfs -test -d project/warehouse/avsc && hdfs dfs -rm -r project/warehouse/avsc

hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team19 -p $(head -n 1 secrets/.hive.pass) -f sql/db.hql > output/hive_results.txt 2> /dev/null
