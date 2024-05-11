// ORM class for table 'weather_conditions2'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat May 11 20:38:33 MSK 2024
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class weather_conditions2 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("location_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.location_id = (Integer)value;
      }
    });
    setters.put("last_updated_epoch", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.last_updated_epoch = (Integer)value;
      }
    });
    setters.put("last_updated", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.last_updated = (java.sql.Timestamp)value;
      }
    });
    setters.put("temperature_celsius", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.temperature_celsius = (Double)value;
      }
    });
    setters.put("temperature_fahrenheit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.temperature_fahrenheit = (Double)value;
      }
    });
    setters.put("condition_text", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.condition_text = (String)value;
      }
    });
    setters.put("wind_mph", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.wind_mph = (Double)value;
      }
    });
    setters.put("wind_kph", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.wind_kph = (Double)value;
      }
    });
    setters.put("wind_degree", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.wind_degree = (Integer)value;
      }
    });
    setters.put("wind_direction", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.wind_direction = (String)value;
      }
    });
    setters.put("pressure_mb", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.pressure_mb = (Double)value;
      }
    });
    setters.put("pressure_in", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.pressure_in = (Double)value;
      }
    });
    setters.put("precip_mm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.precip_mm = (Double)value;
      }
    });
    setters.put("precip_in", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.precip_in = (Double)value;
      }
    });
    setters.put("humidity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.humidity = (Integer)value;
      }
    });
    setters.put("cloud", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.cloud = (Integer)value;
      }
    });
    setters.put("feels_like_celsius", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.feels_like_celsius = (Double)value;
      }
    });
    setters.put("feels_like_fahrenheit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.feels_like_fahrenheit = (Double)value;
      }
    });
    setters.put("visibility_km", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.visibility_km = (Double)value;
      }
    });
    setters.put("visibility_miles", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.visibility_miles = (Double)value;
      }
    });
    setters.put("uv_index", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.uv_index = (Double)value;
      }
    });
    setters.put("gust_mph", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.gust_mph = (Double)value;
      }
    });
    setters.put("gust_kph", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        weather_conditions2.this.gust_kph = (Double)value;
      }
    });
  }
  public weather_conditions2() {
    init0();
  }
  private Integer location_id;
  public Integer get_location_id() {
    return location_id;
  }
  public void set_location_id(Integer location_id) {
    this.location_id = location_id;
  }
  public weather_conditions2 with_location_id(Integer location_id) {
    this.location_id = location_id;
    return this;
  }
  private Integer last_updated_epoch;
  public Integer get_last_updated_epoch() {
    return last_updated_epoch;
  }
  public void set_last_updated_epoch(Integer last_updated_epoch) {
    this.last_updated_epoch = last_updated_epoch;
  }
  public weather_conditions2 with_last_updated_epoch(Integer last_updated_epoch) {
    this.last_updated_epoch = last_updated_epoch;
    return this;
  }
  private java.sql.Timestamp last_updated;
  public java.sql.Timestamp get_last_updated() {
    return last_updated;
  }
  public void set_last_updated(java.sql.Timestamp last_updated) {
    this.last_updated = last_updated;
  }
  public weather_conditions2 with_last_updated(java.sql.Timestamp last_updated) {
    this.last_updated = last_updated;
    return this;
  }
  private Double temperature_celsius;
  public Double get_temperature_celsius() {
    return temperature_celsius;
  }
  public void set_temperature_celsius(Double temperature_celsius) {
    this.temperature_celsius = temperature_celsius;
  }
  public weather_conditions2 with_temperature_celsius(Double temperature_celsius) {
    this.temperature_celsius = temperature_celsius;
    return this;
  }
  private Double temperature_fahrenheit;
  public Double get_temperature_fahrenheit() {
    return temperature_fahrenheit;
  }
  public void set_temperature_fahrenheit(Double temperature_fahrenheit) {
    this.temperature_fahrenheit = temperature_fahrenheit;
  }
  public weather_conditions2 with_temperature_fahrenheit(Double temperature_fahrenheit) {
    this.temperature_fahrenheit = temperature_fahrenheit;
    return this;
  }
  private String condition_text;
  public String get_condition_text() {
    return condition_text;
  }
  public void set_condition_text(String condition_text) {
    this.condition_text = condition_text;
  }
  public weather_conditions2 with_condition_text(String condition_text) {
    this.condition_text = condition_text;
    return this;
  }
  private Double wind_mph;
  public Double get_wind_mph() {
    return wind_mph;
  }
  public void set_wind_mph(Double wind_mph) {
    this.wind_mph = wind_mph;
  }
  public weather_conditions2 with_wind_mph(Double wind_mph) {
    this.wind_mph = wind_mph;
    return this;
  }
  private Double wind_kph;
  public Double get_wind_kph() {
    return wind_kph;
  }
  public void set_wind_kph(Double wind_kph) {
    this.wind_kph = wind_kph;
  }
  public weather_conditions2 with_wind_kph(Double wind_kph) {
    this.wind_kph = wind_kph;
    return this;
  }
  private Integer wind_degree;
  public Integer get_wind_degree() {
    return wind_degree;
  }
  public void set_wind_degree(Integer wind_degree) {
    this.wind_degree = wind_degree;
  }
  public weather_conditions2 with_wind_degree(Integer wind_degree) {
    this.wind_degree = wind_degree;
    return this;
  }
  private String wind_direction;
  public String get_wind_direction() {
    return wind_direction;
  }
  public void set_wind_direction(String wind_direction) {
    this.wind_direction = wind_direction;
  }
  public weather_conditions2 with_wind_direction(String wind_direction) {
    this.wind_direction = wind_direction;
    return this;
  }
  private Double pressure_mb;
  public Double get_pressure_mb() {
    return pressure_mb;
  }
  public void set_pressure_mb(Double pressure_mb) {
    this.pressure_mb = pressure_mb;
  }
  public weather_conditions2 with_pressure_mb(Double pressure_mb) {
    this.pressure_mb = pressure_mb;
    return this;
  }
  private Double pressure_in;
  public Double get_pressure_in() {
    return pressure_in;
  }
  public void set_pressure_in(Double pressure_in) {
    this.pressure_in = pressure_in;
  }
  public weather_conditions2 with_pressure_in(Double pressure_in) {
    this.pressure_in = pressure_in;
    return this;
  }
  private Double precip_mm;
  public Double get_precip_mm() {
    return precip_mm;
  }
  public void set_precip_mm(Double precip_mm) {
    this.precip_mm = precip_mm;
  }
  public weather_conditions2 with_precip_mm(Double precip_mm) {
    this.precip_mm = precip_mm;
    return this;
  }
  private Double precip_in;
  public Double get_precip_in() {
    return precip_in;
  }
  public void set_precip_in(Double precip_in) {
    this.precip_in = precip_in;
  }
  public weather_conditions2 with_precip_in(Double precip_in) {
    this.precip_in = precip_in;
    return this;
  }
  private Integer humidity;
  public Integer get_humidity() {
    return humidity;
  }
  public void set_humidity(Integer humidity) {
    this.humidity = humidity;
  }
  public weather_conditions2 with_humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }
  private Integer cloud;
  public Integer get_cloud() {
    return cloud;
  }
  public void set_cloud(Integer cloud) {
    this.cloud = cloud;
  }
  public weather_conditions2 with_cloud(Integer cloud) {
    this.cloud = cloud;
    return this;
  }
  private Double feels_like_celsius;
  public Double get_feels_like_celsius() {
    return feels_like_celsius;
  }
  public void set_feels_like_celsius(Double feels_like_celsius) {
    this.feels_like_celsius = feels_like_celsius;
  }
  public weather_conditions2 with_feels_like_celsius(Double feels_like_celsius) {
    this.feels_like_celsius = feels_like_celsius;
    return this;
  }
  private Double feels_like_fahrenheit;
  public Double get_feels_like_fahrenheit() {
    return feels_like_fahrenheit;
  }
  public void set_feels_like_fahrenheit(Double feels_like_fahrenheit) {
    this.feels_like_fahrenheit = feels_like_fahrenheit;
  }
  public weather_conditions2 with_feels_like_fahrenheit(Double feels_like_fahrenheit) {
    this.feels_like_fahrenheit = feels_like_fahrenheit;
    return this;
  }
  private Double visibility_km;
  public Double get_visibility_km() {
    return visibility_km;
  }
  public void set_visibility_km(Double visibility_km) {
    this.visibility_km = visibility_km;
  }
  public weather_conditions2 with_visibility_km(Double visibility_km) {
    this.visibility_km = visibility_km;
    return this;
  }
  private Double visibility_miles;
  public Double get_visibility_miles() {
    return visibility_miles;
  }
  public void set_visibility_miles(Double visibility_miles) {
    this.visibility_miles = visibility_miles;
  }
  public weather_conditions2 with_visibility_miles(Double visibility_miles) {
    this.visibility_miles = visibility_miles;
    return this;
  }
  private Double uv_index;
  public Double get_uv_index() {
    return uv_index;
  }
  public void set_uv_index(Double uv_index) {
    this.uv_index = uv_index;
  }
  public weather_conditions2 with_uv_index(Double uv_index) {
    this.uv_index = uv_index;
    return this;
  }
  private Double gust_mph;
  public Double get_gust_mph() {
    return gust_mph;
  }
  public void set_gust_mph(Double gust_mph) {
    this.gust_mph = gust_mph;
  }
  public weather_conditions2 with_gust_mph(Double gust_mph) {
    this.gust_mph = gust_mph;
    return this;
  }
  private Double gust_kph;
  public Double get_gust_kph() {
    return gust_kph;
  }
  public void set_gust_kph(Double gust_kph) {
    this.gust_kph = gust_kph;
  }
  public weather_conditions2 with_gust_kph(Double gust_kph) {
    this.gust_kph = gust_kph;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof weather_conditions2)) {
      return false;
    }
    weather_conditions2 that = (weather_conditions2) o;
    boolean equal = true;
    equal = equal && (this.location_id == null ? that.location_id == null : this.location_id.equals(that.location_id));
    equal = equal && (this.last_updated_epoch == null ? that.last_updated_epoch == null : this.last_updated_epoch.equals(that.last_updated_epoch));
    equal = equal && (this.last_updated == null ? that.last_updated == null : this.last_updated.equals(that.last_updated));
    equal = equal && (this.temperature_celsius == null ? that.temperature_celsius == null : this.temperature_celsius.equals(that.temperature_celsius));
    equal = equal && (this.temperature_fahrenheit == null ? that.temperature_fahrenheit == null : this.temperature_fahrenheit.equals(that.temperature_fahrenheit));
    equal = equal && (this.condition_text == null ? that.condition_text == null : this.condition_text.equals(that.condition_text));
    equal = equal && (this.wind_mph == null ? that.wind_mph == null : this.wind_mph.equals(that.wind_mph));
    equal = equal && (this.wind_kph == null ? that.wind_kph == null : this.wind_kph.equals(that.wind_kph));
    equal = equal && (this.wind_degree == null ? that.wind_degree == null : this.wind_degree.equals(that.wind_degree));
    equal = equal && (this.wind_direction == null ? that.wind_direction == null : this.wind_direction.equals(that.wind_direction));
    equal = equal && (this.pressure_mb == null ? that.pressure_mb == null : this.pressure_mb.equals(that.pressure_mb));
    equal = equal && (this.pressure_in == null ? that.pressure_in == null : this.pressure_in.equals(that.pressure_in));
    equal = equal && (this.precip_mm == null ? that.precip_mm == null : this.precip_mm.equals(that.precip_mm));
    equal = equal && (this.precip_in == null ? that.precip_in == null : this.precip_in.equals(that.precip_in));
    equal = equal && (this.humidity == null ? that.humidity == null : this.humidity.equals(that.humidity));
    equal = equal && (this.cloud == null ? that.cloud == null : this.cloud.equals(that.cloud));
    equal = equal && (this.feels_like_celsius == null ? that.feels_like_celsius == null : this.feels_like_celsius.equals(that.feels_like_celsius));
    equal = equal && (this.feels_like_fahrenheit == null ? that.feels_like_fahrenheit == null : this.feels_like_fahrenheit.equals(that.feels_like_fahrenheit));
    equal = equal && (this.visibility_km == null ? that.visibility_km == null : this.visibility_km.equals(that.visibility_km));
    equal = equal && (this.visibility_miles == null ? that.visibility_miles == null : this.visibility_miles.equals(that.visibility_miles));
    equal = equal && (this.uv_index == null ? that.uv_index == null : this.uv_index.equals(that.uv_index));
    equal = equal && (this.gust_mph == null ? that.gust_mph == null : this.gust_mph.equals(that.gust_mph));
    equal = equal && (this.gust_kph == null ? that.gust_kph == null : this.gust_kph.equals(that.gust_kph));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof weather_conditions2)) {
      return false;
    }
    weather_conditions2 that = (weather_conditions2) o;
    boolean equal = true;
    equal = equal && (this.location_id == null ? that.location_id == null : this.location_id.equals(that.location_id));
    equal = equal && (this.last_updated_epoch == null ? that.last_updated_epoch == null : this.last_updated_epoch.equals(that.last_updated_epoch));
    equal = equal && (this.last_updated == null ? that.last_updated == null : this.last_updated.equals(that.last_updated));
    equal = equal && (this.temperature_celsius == null ? that.temperature_celsius == null : this.temperature_celsius.equals(that.temperature_celsius));
    equal = equal && (this.temperature_fahrenheit == null ? that.temperature_fahrenheit == null : this.temperature_fahrenheit.equals(that.temperature_fahrenheit));
    equal = equal && (this.condition_text == null ? that.condition_text == null : this.condition_text.equals(that.condition_text));
    equal = equal && (this.wind_mph == null ? that.wind_mph == null : this.wind_mph.equals(that.wind_mph));
    equal = equal && (this.wind_kph == null ? that.wind_kph == null : this.wind_kph.equals(that.wind_kph));
    equal = equal && (this.wind_degree == null ? that.wind_degree == null : this.wind_degree.equals(that.wind_degree));
    equal = equal && (this.wind_direction == null ? that.wind_direction == null : this.wind_direction.equals(that.wind_direction));
    equal = equal && (this.pressure_mb == null ? that.pressure_mb == null : this.pressure_mb.equals(that.pressure_mb));
    equal = equal && (this.pressure_in == null ? that.pressure_in == null : this.pressure_in.equals(that.pressure_in));
    equal = equal && (this.precip_mm == null ? that.precip_mm == null : this.precip_mm.equals(that.precip_mm));
    equal = equal && (this.precip_in == null ? that.precip_in == null : this.precip_in.equals(that.precip_in));
    equal = equal && (this.humidity == null ? that.humidity == null : this.humidity.equals(that.humidity));
    equal = equal && (this.cloud == null ? that.cloud == null : this.cloud.equals(that.cloud));
    equal = equal && (this.feels_like_celsius == null ? that.feels_like_celsius == null : this.feels_like_celsius.equals(that.feels_like_celsius));
    equal = equal && (this.feels_like_fahrenheit == null ? that.feels_like_fahrenheit == null : this.feels_like_fahrenheit.equals(that.feels_like_fahrenheit));
    equal = equal && (this.visibility_km == null ? that.visibility_km == null : this.visibility_km.equals(that.visibility_km));
    equal = equal && (this.visibility_miles == null ? that.visibility_miles == null : this.visibility_miles.equals(that.visibility_miles));
    equal = equal && (this.uv_index == null ? that.uv_index == null : this.uv_index.equals(that.uv_index));
    equal = equal && (this.gust_mph == null ? that.gust_mph == null : this.gust_mph.equals(that.gust_mph));
    equal = equal && (this.gust_kph == null ? that.gust_kph == null : this.gust_kph.equals(that.gust_kph));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.location_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.last_updated_epoch = JdbcWritableBridge.readInteger(2, __dbResults);
    this.last_updated = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.temperature_celsius = JdbcWritableBridge.readDouble(4, __dbResults);
    this.temperature_fahrenheit = JdbcWritableBridge.readDouble(5, __dbResults);
    this.condition_text = JdbcWritableBridge.readString(6, __dbResults);
    this.wind_mph = JdbcWritableBridge.readDouble(7, __dbResults);
    this.wind_kph = JdbcWritableBridge.readDouble(8, __dbResults);
    this.wind_degree = JdbcWritableBridge.readInteger(9, __dbResults);
    this.wind_direction = JdbcWritableBridge.readString(10, __dbResults);
    this.pressure_mb = JdbcWritableBridge.readDouble(11, __dbResults);
    this.pressure_in = JdbcWritableBridge.readDouble(12, __dbResults);
    this.precip_mm = JdbcWritableBridge.readDouble(13, __dbResults);
    this.precip_in = JdbcWritableBridge.readDouble(14, __dbResults);
    this.humidity = JdbcWritableBridge.readInteger(15, __dbResults);
    this.cloud = JdbcWritableBridge.readInteger(16, __dbResults);
    this.feels_like_celsius = JdbcWritableBridge.readDouble(17, __dbResults);
    this.feels_like_fahrenheit = JdbcWritableBridge.readDouble(18, __dbResults);
    this.visibility_km = JdbcWritableBridge.readDouble(19, __dbResults);
    this.visibility_miles = JdbcWritableBridge.readDouble(20, __dbResults);
    this.uv_index = JdbcWritableBridge.readDouble(21, __dbResults);
    this.gust_mph = JdbcWritableBridge.readDouble(22, __dbResults);
    this.gust_kph = JdbcWritableBridge.readDouble(23, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.location_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.last_updated_epoch = JdbcWritableBridge.readInteger(2, __dbResults);
    this.last_updated = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.temperature_celsius = JdbcWritableBridge.readDouble(4, __dbResults);
    this.temperature_fahrenheit = JdbcWritableBridge.readDouble(5, __dbResults);
    this.condition_text = JdbcWritableBridge.readString(6, __dbResults);
    this.wind_mph = JdbcWritableBridge.readDouble(7, __dbResults);
    this.wind_kph = JdbcWritableBridge.readDouble(8, __dbResults);
    this.wind_degree = JdbcWritableBridge.readInteger(9, __dbResults);
    this.wind_direction = JdbcWritableBridge.readString(10, __dbResults);
    this.pressure_mb = JdbcWritableBridge.readDouble(11, __dbResults);
    this.pressure_in = JdbcWritableBridge.readDouble(12, __dbResults);
    this.precip_mm = JdbcWritableBridge.readDouble(13, __dbResults);
    this.precip_in = JdbcWritableBridge.readDouble(14, __dbResults);
    this.humidity = JdbcWritableBridge.readInteger(15, __dbResults);
    this.cloud = JdbcWritableBridge.readInteger(16, __dbResults);
    this.feels_like_celsius = JdbcWritableBridge.readDouble(17, __dbResults);
    this.feels_like_fahrenheit = JdbcWritableBridge.readDouble(18, __dbResults);
    this.visibility_km = JdbcWritableBridge.readDouble(19, __dbResults);
    this.visibility_miles = JdbcWritableBridge.readDouble(20, __dbResults);
    this.uv_index = JdbcWritableBridge.readDouble(21, __dbResults);
    this.gust_mph = JdbcWritableBridge.readDouble(22, __dbResults);
    this.gust_kph = JdbcWritableBridge.readDouble(23, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(location_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(last_updated_epoch, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_updated, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(temperature_celsius, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(temperature_fahrenheit, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(condition_text, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(wind_mph, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(wind_kph, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(wind_degree, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(wind_direction, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(pressure_mb, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(pressure_in, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(precip_mm, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(precip_in, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(humidity, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cloud, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(feels_like_celsius, 17 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(feels_like_fahrenheit, 18 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(visibility_km, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(visibility_miles, 20 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(uv_index, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(gust_mph, 22 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(gust_kph, 23 + __off, 8, __dbStmt);
    return 23;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(location_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(last_updated_epoch, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(last_updated, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeDouble(temperature_celsius, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(temperature_fahrenheit, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(condition_text, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(wind_mph, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(wind_kph, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(wind_degree, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(wind_direction, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(pressure_mb, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(pressure_in, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(precip_mm, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(precip_in, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(humidity, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(cloud, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(feels_like_celsius, 17 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(feels_like_fahrenheit, 18 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(visibility_km, 19 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(visibility_miles, 20 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(uv_index, 21 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(gust_mph, 22 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(gust_kph, 23 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.location_id = null;
    } else {
    this.location_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_updated_epoch = null;
    } else {
    this.last_updated_epoch = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.last_updated = null;
    } else {
    this.last_updated = new Timestamp(__dataIn.readLong());
    this.last_updated.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.temperature_celsius = null;
    } else {
    this.temperature_celsius = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.temperature_fahrenheit = null;
    } else {
    this.temperature_fahrenheit = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.condition_text = null;
    } else {
    this.condition_text = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.wind_mph = null;
    } else {
    this.wind_mph = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.wind_kph = null;
    } else {
    this.wind_kph = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.wind_degree = null;
    } else {
    this.wind_degree = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.wind_direction = null;
    } else {
    this.wind_direction = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.pressure_mb = null;
    } else {
    this.pressure_mb = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.pressure_in = null;
    } else {
    this.pressure_in = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.precip_mm = null;
    } else {
    this.precip_mm = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.precip_in = null;
    } else {
    this.precip_in = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.humidity = null;
    } else {
    this.humidity = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.cloud = null;
    } else {
    this.cloud = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.feels_like_celsius = null;
    } else {
    this.feels_like_celsius = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.feels_like_fahrenheit = null;
    } else {
    this.feels_like_fahrenheit = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.visibility_km = null;
    } else {
    this.visibility_km = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.visibility_miles = null;
    } else {
    this.visibility_miles = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.uv_index = null;
    } else {
    this.uv_index = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.gust_mph = null;
    } else {
    this.gust_mph = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.gust_kph = null;
    } else {
    this.gust_kph = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.location_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.location_id);
    }
    if (null == this.last_updated_epoch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.last_updated_epoch);
    }
    if (null == this.last_updated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_updated.getTime());
    __dataOut.writeInt(this.last_updated.getNanos());
    }
    if (null == this.temperature_celsius) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.temperature_celsius);
    }
    if (null == this.temperature_fahrenheit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.temperature_fahrenheit);
    }
    if (null == this.condition_text) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, condition_text);
    }
    if (null == this.wind_mph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.wind_mph);
    }
    if (null == this.wind_kph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.wind_kph);
    }
    if (null == this.wind_degree) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.wind_degree);
    }
    if (null == this.wind_direction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wind_direction);
    }
    if (null == this.pressure_mb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.pressure_mb);
    }
    if (null == this.pressure_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.pressure_in);
    }
    if (null == this.precip_mm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precip_mm);
    }
    if (null == this.precip_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precip_in);
    }
    if (null == this.humidity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.humidity);
    }
    if (null == this.cloud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cloud);
    }
    if (null == this.feels_like_celsius) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.feels_like_celsius);
    }
    if (null == this.feels_like_fahrenheit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.feels_like_fahrenheit);
    }
    if (null == this.visibility_km) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.visibility_km);
    }
    if (null == this.visibility_miles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.visibility_miles);
    }
    if (null == this.uv_index) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.uv_index);
    }
    if (null == this.gust_mph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.gust_mph);
    }
    if (null == this.gust_kph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.gust_kph);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.location_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.location_id);
    }
    if (null == this.last_updated_epoch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.last_updated_epoch);
    }
    if (null == this.last_updated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.last_updated.getTime());
    __dataOut.writeInt(this.last_updated.getNanos());
    }
    if (null == this.temperature_celsius) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.temperature_celsius);
    }
    if (null == this.temperature_fahrenheit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.temperature_fahrenheit);
    }
    if (null == this.condition_text) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, condition_text);
    }
    if (null == this.wind_mph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.wind_mph);
    }
    if (null == this.wind_kph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.wind_kph);
    }
    if (null == this.wind_degree) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.wind_degree);
    }
    if (null == this.wind_direction) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wind_direction);
    }
    if (null == this.pressure_mb) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.pressure_mb);
    }
    if (null == this.pressure_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.pressure_in);
    }
    if (null == this.precip_mm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precip_mm);
    }
    if (null == this.precip_in) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.precip_in);
    }
    if (null == this.humidity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.humidity);
    }
    if (null == this.cloud) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.cloud);
    }
    if (null == this.feels_like_celsius) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.feels_like_celsius);
    }
    if (null == this.feels_like_fahrenheit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.feels_like_fahrenheit);
    }
    if (null == this.visibility_km) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.visibility_km);
    }
    if (null == this.visibility_miles) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.visibility_miles);
    }
    if (null == this.uv_index) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.uv_index);
    }
    if (null == this.gust_mph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.gust_mph);
    }
    if (null == this.gust_kph) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.gust_kph);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(location_id==null?"null":"" + location_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_updated_epoch==null?"null":"" + last_updated_epoch, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_updated==null?"null":"" + last_updated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temperature_celsius==null?"null":"" + temperature_celsius, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temperature_fahrenheit==null?"null":"" + temperature_fahrenheit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(condition_text==null?"null":condition_text, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wind_mph==null?"null":"" + wind_mph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wind_kph==null?"null":"" + wind_kph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wind_degree==null?"null":"" + wind_degree, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wind_direction==null?"null":wind_direction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pressure_mb==null?"null":"" + pressure_mb, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pressure_in==null?"null":"" + pressure_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precip_mm==null?"null":"" + precip_mm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precip_in==null?"null":"" + precip_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(humidity==null?"null":"" + humidity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cloud==null?"null":"" + cloud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(feels_like_celsius==null?"null":"" + feels_like_celsius, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(feels_like_fahrenheit==null?"null":"" + feels_like_fahrenheit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(visibility_km==null?"null":"" + visibility_km, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(visibility_miles==null?"null":"" + visibility_miles, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(uv_index==null?"null":"" + uv_index, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gust_mph==null?"null":"" + gust_mph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gust_kph==null?"null":"" + gust_kph, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(location_id==null?"null":"" + location_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_updated_epoch==null?"null":"" + last_updated_epoch, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(last_updated==null?"null":"" + last_updated, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temperature_celsius==null?"null":"" + temperature_celsius, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temperature_fahrenheit==null?"null":"" + temperature_fahrenheit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(condition_text==null?"null":condition_text, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wind_mph==null?"null":"" + wind_mph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wind_kph==null?"null":"" + wind_kph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wind_degree==null?"null":"" + wind_degree, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wind_direction==null?"null":wind_direction, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pressure_mb==null?"null":"" + pressure_mb, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pressure_in==null?"null":"" + pressure_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precip_mm==null?"null":"" + precip_mm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(precip_in==null?"null":"" + precip_in, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(humidity==null?"null":"" + humidity, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cloud==null?"null":"" + cloud, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(feels_like_celsius==null?"null":"" + feels_like_celsius, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(feels_like_fahrenheit==null?"null":"" + feels_like_fahrenheit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(visibility_km==null?"null":"" + visibility_km, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(visibility_miles==null?"null":"" + visibility_miles, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(uv_index==null?"null":"" + uv_index, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gust_mph==null?"null":"" + gust_mph, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gust_kph==null?"null":"" + gust_kph, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.location_id = null; } else {
      this.location_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_updated_epoch = null; } else {
      this.last_updated_epoch = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_updated = null; } else {
      this.last_updated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.temperature_celsius = null; } else {
      this.temperature_celsius = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.temperature_fahrenheit = null; } else {
      this.temperature_fahrenheit = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.condition_text = null; } else {
      this.condition_text = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wind_mph = null; } else {
      this.wind_mph = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wind_kph = null; } else {
      this.wind_kph = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wind_degree = null; } else {
      this.wind_degree = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.wind_direction = null; } else {
      this.wind_direction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pressure_mb = null; } else {
      this.pressure_mb = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pressure_in = null; } else {
      this.pressure_in = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precip_mm = null; } else {
      this.precip_mm = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precip_in = null; } else {
      this.precip_in = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.humidity = null; } else {
      this.humidity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cloud = null; } else {
      this.cloud = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.feels_like_celsius = null; } else {
      this.feels_like_celsius = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.feels_like_fahrenheit = null; } else {
      this.feels_like_fahrenheit = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.visibility_km = null; } else {
      this.visibility_km = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.visibility_miles = null; } else {
      this.visibility_miles = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.uv_index = null; } else {
      this.uv_index = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gust_mph = null; } else {
      this.gust_mph = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gust_kph = null; } else {
      this.gust_kph = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.location_id = null; } else {
      this.location_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_updated_epoch = null; } else {
      this.last_updated_epoch = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.last_updated = null; } else {
      this.last_updated = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.temperature_celsius = null; } else {
      this.temperature_celsius = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.temperature_fahrenheit = null; } else {
      this.temperature_fahrenheit = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.condition_text = null; } else {
      this.condition_text = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wind_mph = null; } else {
      this.wind_mph = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wind_kph = null; } else {
      this.wind_kph = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wind_degree = null; } else {
      this.wind_degree = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.wind_direction = null; } else {
      this.wind_direction = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pressure_mb = null; } else {
      this.pressure_mb = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pressure_in = null; } else {
      this.pressure_in = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precip_mm = null; } else {
      this.precip_mm = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.precip_in = null; } else {
      this.precip_in = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.humidity = null; } else {
      this.humidity = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cloud = null; } else {
      this.cloud = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.feels_like_celsius = null; } else {
      this.feels_like_celsius = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.feels_like_fahrenheit = null; } else {
      this.feels_like_fahrenheit = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.visibility_km = null; } else {
      this.visibility_km = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.visibility_miles = null; } else {
      this.visibility_miles = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.uv_index = null; } else {
      this.uv_index = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gust_mph = null; } else {
      this.gust_mph = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gust_kph = null; } else {
      this.gust_kph = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    weather_conditions2 o = (weather_conditions2) super.clone();
    o.last_updated = (o.last_updated != null) ? (java.sql.Timestamp) o.last_updated.clone() : null;
    return o;
  }

  public void clone0(weather_conditions2 o) throws CloneNotSupportedException {
    o.last_updated = (o.last_updated != null) ? (java.sql.Timestamp) o.last_updated.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("location_id", this.location_id);
    __sqoop$field_map.put("last_updated_epoch", this.last_updated_epoch);
    __sqoop$field_map.put("last_updated", this.last_updated);
    __sqoop$field_map.put("temperature_celsius", this.temperature_celsius);
    __sqoop$field_map.put("temperature_fahrenheit", this.temperature_fahrenheit);
    __sqoop$field_map.put("condition_text", this.condition_text);
    __sqoop$field_map.put("wind_mph", this.wind_mph);
    __sqoop$field_map.put("wind_kph", this.wind_kph);
    __sqoop$field_map.put("wind_degree", this.wind_degree);
    __sqoop$field_map.put("wind_direction", this.wind_direction);
    __sqoop$field_map.put("pressure_mb", this.pressure_mb);
    __sqoop$field_map.put("pressure_in", this.pressure_in);
    __sqoop$field_map.put("precip_mm", this.precip_mm);
    __sqoop$field_map.put("precip_in", this.precip_in);
    __sqoop$field_map.put("humidity", this.humidity);
    __sqoop$field_map.put("cloud", this.cloud);
    __sqoop$field_map.put("feels_like_celsius", this.feels_like_celsius);
    __sqoop$field_map.put("feels_like_fahrenheit", this.feels_like_fahrenheit);
    __sqoop$field_map.put("visibility_km", this.visibility_km);
    __sqoop$field_map.put("visibility_miles", this.visibility_miles);
    __sqoop$field_map.put("uv_index", this.uv_index);
    __sqoop$field_map.put("gust_mph", this.gust_mph);
    __sqoop$field_map.put("gust_kph", this.gust_kph);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("location_id", this.location_id);
    __sqoop$field_map.put("last_updated_epoch", this.last_updated_epoch);
    __sqoop$field_map.put("last_updated", this.last_updated);
    __sqoop$field_map.put("temperature_celsius", this.temperature_celsius);
    __sqoop$field_map.put("temperature_fahrenheit", this.temperature_fahrenheit);
    __sqoop$field_map.put("condition_text", this.condition_text);
    __sqoop$field_map.put("wind_mph", this.wind_mph);
    __sqoop$field_map.put("wind_kph", this.wind_kph);
    __sqoop$field_map.put("wind_degree", this.wind_degree);
    __sqoop$field_map.put("wind_direction", this.wind_direction);
    __sqoop$field_map.put("pressure_mb", this.pressure_mb);
    __sqoop$field_map.put("pressure_in", this.pressure_in);
    __sqoop$field_map.put("precip_mm", this.precip_mm);
    __sqoop$field_map.put("precip_in", this.precip_in);
    __sqoop$field_map.put("humidity", this.humidity);
    __sqoop$field_map.put("cloud", this.cloud);
    __sqoop$field_map.put("feels_like_celsius", this.feels_like_celsius);
    __sqoop$field_map.put("feels_like_fahrenheit", this.feels_like_fahrenheit);
    __sqoop$field_map.put("visibility_km", this.visibility_km);
    __sqoop$field_map.put("visibility_miles", this.visibility_miles);
    __sqoop$field_map.put("uv_index", this.uv_index);
    __sqoop$field_map.put("gust_mph", this.gust_mph);
    __sqoop$field_map.put("gust_kph", this.gust_kph);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
