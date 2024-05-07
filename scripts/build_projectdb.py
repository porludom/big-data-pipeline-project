"""This module creates a project database and imports data from files."""

from pprint import pprint
import os
import psycopg2 as psql

# Read password from secrets file
with open("../password", "r", encoding="utf-8") as file:
    password = file.read().rstrip()

# Build connection string
connString = (
    f"host=hadoop-04.uni.innopolis.ru port=5432 user=team19 "
    f"dbname=team19_projectdb password={password}")

# Connect to the remote dbms
with psql.connect(connString) as conn:
    # Create a cursor for executing psql commands
    cur = conn.cursor()
    # Read the commands from the file and execute them.
    with open(os.path.join("../project/big-data-pipeline-project/sql",
                           "create_db.sql"), encoding="utf-8") as file:
        content = file.read()
        cur.execute(content)
    conn.commit()

    # Read the commands from the file and execute them.
    with open(os.path.join("../project/big-data-pipeline-project/sql",
                           "import_data.sql"),
              encoding="utf-8") as file:
        commands = file.readlines()
        with open(os.path.join("../project/big-data-pipeline-project/data",
                               "locations.csv"), "r",
                  encoding="utf-8") as locations:
            cur.copy_expert(commands[0], locations)
        with open(os.path.join("../project/big-data-pipeline-project/data",
                               "weather_conditions.csv"), "r",
                  encoding="utf-8") as weather_conditions:
            cur.copy_expert(commands[1], weather_conditions)
        with open(os.path.join("../project/big-data-pipeline-project/data",
                               "astronomical_data.csv"), "r",
                  encoding="utf-8") as astronomical_data:
            cur.copy_expert(commands[2], astronomical_data)
        with open(os.path.join("../project/big-data-pipeline-project/data",
                               "air_quality.csv"), "r",
                  encoding="utf-8") as air_quality:
            cur.copy_expert(commands[3], air_quality)

    conn.commit()

    pprint(conn)
    cur = conn.cursor()
    # Read the sql commands from the file
    with open(os.path.join("../project/big-data-pipeline-project/sql", "test_database.sql"),
              encoding="utf-8") as file:
        commands = file.readlines()
        for command in commands:
            cur.execute(command)
            pprint(cur.fetchall())
