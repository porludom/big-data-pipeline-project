import psycopg2 as psql
from pprint import pprint
import os

# Read password from secrets file
file = os.path.join("secrets", ".psql.pass")
with open(file, "r") as file:
    password = file.read().rstrip()

# build connection string
conn_string = "host=hadoop-04.uni.innopolis.ru port=5432 user=team19 dbname=team19_projectdb password={}".format()

# Connect to the remote dbms
with psql.connect(conn_string) as conn:
    # Create a cursor for executing psql commands
    cur = conn.cursor()
    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "create_db.sql")) as file:
        content = file.read()
        cur.execute(content)
    conn.commit()

    # Read the commands from the file and execute them.
    with open(os.path.join("sql", "import_data.sql")) as file:
        commands = file.readlines()
        with open(os.path.join("data", "locations.csv"), "r") as locations:
            cur.copy_expert(commands[0], locations)
        with open(os.path.join("data", "weather_conditions.csv"), "r") as weather_conditions:
            cur.copy_expert(commands[1], weather_conditions)
        with open(os.path.join("data", "astronomical_data.csv"), "r") as astronomical_data:
            cur.copy_expert(commands[2], astronomical_data)
        with open(os.path.join("data", "air_quality.csv"), "r") as air_quality:
            cur.copy_expert(commands[3], air_quality)

    conn.commit()

    pprint(conn)
    cur = conn.cursor()
    # Read the sql commands from the file
    with open(os.path.join("sql", "test_database.sql")) as file:
        commands = file.readlines()
        for command in commands:
            cur.execute(command)
            pprint(cur.fetchall())
