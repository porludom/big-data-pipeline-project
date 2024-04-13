DROP TABLE IF EXISTS weather_conditions CASCADE;
DROP TABLE IF EXISTS astronomical_data CASCADE;
DROP TABLE IF EXISTS air_quality CASCADE;
DROP TABLE IF EXISTS locations CASCADE;

CREATE TABLE IF NOT EXISTS locations (
    id SERIAL PRIMARY KEY,
    country VARCHAR(255) NOT NULL,
    location_name VARCHAR(255) NOT NULL,
    latitude DOUBLE PRECISION NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    timezone VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS weather_conditions (
--     id SERIAL PRIMARY KEY,
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
    FOREIGN KEY (location_id) REFERENCES locations(id)
);

CREATE TABLE IF NOT EXISTS astronomical_data (
--     id SERIAL PRIMARY KEY,
    location_id INTEGER NOT NULL,
    sunrise VARCHAR(255) NOT NULL,
    sunset VARCHAR(255) NOT NULL,
    moonrise VARCHAR(255) NOT NULL,
    moonset VARCHAR(255) NOT NULL,
    moon_phase VARCHAR(255) NOT NULL,
    moon_illumination INTEGER NOT NULL,
    FOREIGN KEY (location_id) REFERENCES locations(id)
);

CREATE TABLE IF NOT EXISTS air_quality (
--     id SERIAL PRIMARY KEY,
    location_id INTEGER NOT NULL,
    air_quality_Carbon_Monoxide DOUBLE PRECISION NOT NULL,
    air_quality_Ozone DOUBLE PRECISION NOT NULL,
    air_quality_Nitrogen_dioxide DOUBLE PRECISION NOT NULL,
    air_quality_Sulphur_dioxide DOUBLE PRECISION NOT NULL,
    air_quality_PM2_5 DOUBLE PRECISION NOT NULL,
    air_quality_PM10 DOUBLE PRECISION NOT NULL,
    air_quality_us_epa_index INTEGER NOT NULL,
    air_quality_gb_defra_index INTEGER NOT NULL,
    FOREIGN KEY (location_id) REFERENCES locations(id)
);