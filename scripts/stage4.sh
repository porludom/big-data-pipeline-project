Password=$(<~/password) 
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team19 -p $Password -f sql/stage4.hql > output/evaluation.txt 2> /dev/null
