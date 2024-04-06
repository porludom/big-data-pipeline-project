PG_USER="team19"
PG_DB="team19_projectdb"
PG_HOST="hadoop-04.uni.innopolis.ru"
PG_PORT="5432"

execute_sql() {
    psql -U "$PG_USER" -d "$PG_DB" -h "$PG_HOST" -p "$PG_PORT" -c "$1"
}

execute_sql "CREATE TABLE IF NOT EXISTS public.locations (
    id INTEGER PRIMARY KEY,
    country VARCHAR(255) NOT NULL,
    location_name VARCHAR(255) NOT NULL,
    latitude DOUBLE PRECISION NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    timezone VARCHAR(255) NOT NULL
);"

execute_sql "CREATE TABLE IF NOT EXISTS public.weather_conditions (
    id SERIAL PRIMARY KEY,
    location_id INTEGER NOT NULL,
    last_updated_epoch INTEGER NOT NULL,
    last_updated TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    temperature_celsius DOUBLE PRECISION NOT NULL,
    temperature_fahrenheit DOUBLE PRECISION NOT NULL,
    condition_text VARCHAR(255) NOT NULL,
    wind_mph DOUBLE PRECISION NOT NULL,
    wind_kph DOUBLE PRECISION NOT NULL,
    wind_degree INTEGER NOT NULL,
    wind_direction VARCHAR(255) NOT NULL,
    pressure_mb DOUBLE PRECISION NOT NULL,
    pressure_in DOUBLE PRECISION NOT NULL,
    precip_mm DOUBLE PRECISION NOT NULL,
    precip_in DOUBLE PRECISION NOT NULL,
    humidity INTEGER NOT NULL,
    cloud INTEGER NOT NULL,
    feels_like_celsius DOUBLE PRECISION NOT NULL,
    feels_like_fahrenheit DOUBLE PRECISION NOT NULL,
    visibility_km DOUBLE PRECISION NOT NULL,
    visibility_miles DOUBLE PRECISION NOT NULL,
    uv_index DOUBLE PRECISION NOT NULL,
    gust_mph DOUBLE PRECISION NOT NULL,
    gust_kph DOUBLE PRECISION NOT NULL,
    FOREIGN KEY (location_id) REFERENCES public.locations(id)
);"

execute_sql "CREATE TABLE IF NOT EXISTS public.astronomical_data (
    id SERIAL PRIMARY KEY,
    location_id INTEGER NOT NULL,
    sunrise VARCHAR(255) NOT NULL,
    sunset VARCHAR(255) NOT NULL,
    moonrise VARCHAR(255) NOT NULL,
    moonset VARCHAR(255) NOT NULL,
    moon_phase VARCHAR(255) NOT NULL,
    moon_illumination INTEGER NOT NULL,
    FOREIGN KEY (location_id) REFERENCES public.locations(id)
);"

execute_sql "CREATE TABLE IF NOT EXISTS public.air_quality (
    id SERIAL PRIMARY KEY,
    location_id INTEGER NOT NULL,
    air_quality_Carbon_Monoxide DOUBLE PRECISION NOT NULL,
    air_quality_Ozone DOUBLE PRECISION NOT NULL,
    air_quality_Nitrogen_dioxide DOUBLE PRECISION NOT NULL,
    air_quality_Sulphur_dioxide DOUBLE PRECISION NOT NULL,
    air_quality_PM2_5 DOUBLE PRECISION NOT NULL,
    air_quality_PM10 DOUBLE PRECISION NOT NULL,
    air_quality_us_epa_index INTEGER NOT NULL,
    air_quality_gb_defra_index INTEGER NOT NULL,
    FOREIGN KEY (location_id) REFERENCES public.locations(id)
);"

execute_sql "ALTER TABLE IF EXISTS public.locations OWNER TO team19;"
execute_sql "ALTER TABLE IF EXISTS public.weather_conditions OWNER TO team19;"
execute_sql "ALTER TABLE IF EXISTS public.astronomical_data OWNER TO team19;"
execute_sql "ALTER TABLE IF EXISTS public.air_quality OWNER TO team19;"

execute_sql "\\copy public.astronomical_data (location_id, sunrise, sunset, moonrise, moonset, moon_phase, moon_illumination) FROM '/path/to/astronomical_data.csv' DELIMITER ',' CSV HEADER;"
execute_sql "\\copy public.weather_conditions (location_id, last_updated_epoch, last_updated, temperature_celsius, temperature_fahrenheit, condition_text, wind_mph, wind_kph, wind_degree, wind_direction, pressure_mb, pressure_in, precip_mm, precip_in, humidity, cloud, feels_like_celsius, feels_like_fahrenheit, visibility_km, visibility_miles, uv_index, gust_mph, gust_kph) FROM '/path/to/weather_conditions.csv' DELIMITER ',' CSV HEADER;"
execute_sql "\\copy public.locations (id, country, location_name, latitude, longitude, timezone) FROM '/path/to/locations.csv' DELIMITER ',' CSV HEADER;"
execute_sql "\\copy public.air_quality (location_id, air_quality_Carbon_Monoxide, air_quality_Ozone, air_quality_Nitrogen_dioxide, air_quality_Sulphur_dioxide, air_quality_PM2_5, air_quality_PM10, air_quality_us_epa_index, air_quality_gb_defra_index) FROM '/path/to/air_quality.csv' DELIMITER ',' CSV HEADER;"
