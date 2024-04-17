hdfs dfs -mkdir -p project/warehouse/avsc
hdfs dfs -put output/*.avsc project/warehouse/avsc
Password=$(<~/password) 
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team19 -p $Password -f sql/db.hql
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team19 -p $Password -f sql/db.hql > output/hive_results.txt 2> /dev/null
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team19 -p $Password -f sql/optimizations.hql 
