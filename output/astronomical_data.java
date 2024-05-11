// ORM class for table 'astronomical_data'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat May 11 20:38:10 MSK 2024
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

public class astronomical_data extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("location_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        astronomical_data.this.location_id = (Integer)value;
      }
    });
    setters.put("sunrise", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        astronomical_data.this.sunrise = (String)value;
      }
    });
    setters.put("sunset", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        astronomical_data.this.sunset = (String)value;
      }
    });
    setters.put("moonrise", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        astronomical_data.this.moonrise = (String)value;
      }
    });
    setters.put("moonset", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        astronomical_data.this.moonset = (String)value;
      }
    });
    setters.put("moon_phase", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        astronomical_data.this.moon_phase = (String)value;
      }
    });
    setters.put("moon_illumination", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        astronomical_data.this.moon_illumination = (Integer)value;
      }
    });
  }
  public astronomical_data() {
    init0();
  }
  private Integer location_id;
  public Integer get_location_id() {
    return location_id;
  }
  public void set_location_id(Integer location_id) {
    this.location_id = location_id;
  }
  public astronomical_data with_location_id(Integer location_id) {
    this.location_id = location_id;
    return this;
  }
  private String sunrise;
  public String get_sunrise() {
    return sunrise;
  }
  public void set_sunrise(String sunrise) {
    this.sunrise = sunrise;
  }
  public astronomical_data with_sunrise(String sunrise) {
    this.sunrise = sunrise;
    return this;
  }
  private String sunset;
  public String get_sunset() {
    return sunset;
  }
  public void set_sunset(String sunset) {
    this.sunset = sunset;
  }
  public astronomical_data with_sunset(String sunset) {
    this.sunset = sunset;
    return this;
  }
  private String moonrise;
  public String get_moonrise() {
    return moonrise;
  }
  public void set_moonrise(String moonrise) {
    this.moonrise = moonrise;
  }
  public astronomical_data with_moonrise(String moonrise) {
    this.moonrise = moonrise;
    return this;
  }
  private String moonset;
  public String get_moonset() {
    return moonset;
  }
  public void set_moonset(String moonset) {
    this.moonset = moonset;
  }
  public astronomical_data with_moonset(String moonset) {
    this.moonset = moonset;
    return this;
  }
  private String moon_phase;
  public String get_moon_phase() {
    return moon_phase;
  }
  public void set_moon_phase(String moon_phase) {
    this.moon_phase = moon_phase;
  }
  public astronomical_data with_moon_phase(String moon_phase) {
    this.moon_phase = moon_phase;
    return this;
  }
  private Integer moon_illumination;
  public Integer get_moon_illumination() {
    return moon_illumination;
  }
  public void set_moon_illumination(Integer moon_illumination) {
    this.moon_illumination = moon_illumination;
  }
  public astronomical_data with_moon_illumination(Integer moon_illumination) {
    this.moon_illumination = moon_illumination;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof astronomical_data)) {
      return false;
    }
    astronomical_data that = (astronomical_data) o;
    boolean equal = true;
    equal = equal && (this.location_id == null ? that.location_id == null : this.location_id.equals(that.location_id));
    equal = equal && (this.sunrise == null ? that.sunrise == null : this.sunrise.equals(that.sunrise));
    equal = equal && (this.sunset == null ? that.sunset == null : this.sunset.equals(that.sunset));
    equal = equal && (this.moonrise == null ? that.moonrise == null : this.moonrise.equals(that.moonrise));
    equal = equal && (this.moonset == null ? that.moonset == null : this.moonset.equals(that.moonset));
    equal = equal && (this.moon_phase == null ? that.moon_phase == null : this.moon_phase.equals(that.moon_phase));
    equal = equal && (this.moon_illumination == null ? that.moon_illumination == null : this.moon_illumination.equals(that.moon_illumination));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof astronomical_data)) {
      return false;
    }
    astronomical_data that = (astronomical_data) o;
    boolean equal = true;
    equal = equal && (this.location_id == null ? that.location_id == null : this.location_id.equals(that.location_id));
    equal = equal && (this.sunrise == null ? that.sunrise == null : this.sunrise.equals(that.sunrise));
    equal = equal && (this.sunset == null ? that.sunset == null : this.sunset.equals(that.sunset));
    equal = equal && (this.moonrise == null ? that.moonrise == null : this.moonrise.equals(that.moonrise));
    equal = equal && (this.moonset == null ? that.moonset == null : this.moonset.equals(that.moonset));
    equal = equal && (this.moon_phase == null ? that.moon_phase == null : this.moon_phase.equals(that.moon_phase));
    equal = equal && (this.moon_illumination == null ? that.moon_illumination == null : this.moon_illumination.equals(that.moon_illumination));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.location_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.sunrise = JdbcWritableBridge.readString(2, __dbResults);
    this.sunset = JdbcWritableBridge.readString(3, __dbResults);
    this.moonrise = JdbcWritableBridge.readString(4, __dbResults);
    this.moonset = JdbcWritableBridge.readString(5, __dbResults);
    this.moon_phase = JdbcWritableBridge.readString(6, __dbResults);
    this.moon_illumination = JdbcWritableBridge.readInteger(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.location_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.sunrise = JdbcWritableBridge.readString(2, __dbResults);
    this.sunset = JdbcWritableBridge.readString(3, __dbResults);
    this.moonrise = JdbcWritableBridge.readString(4, __dbResults);
    this.moonset = JdbcWritableBridge.readString(5, __dbResults);
    this.moon_phase = JdbcWritableBridge.readString(6, __dbResults);
    this.moon_illumination = JdbcWritableBridge.readInteger(7, __dbResults);
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
    JdbcWritableBridge.writeString(sunrise, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sunset, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(moonrise, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(moonset, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(moon_phase, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(moon_illumination, 7 + __off, 4, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(location_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(sunrise, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(sunset, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(moonrise, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(moonset, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(moon_phase, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(moon_illumination, 7 + __off, 4, __dbStmt);
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
        this.sunrise = null;
    } else {
    this.sunrise = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sunset = null;
    } else {
    this.sunset = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.moonrise = null;
    } else {
    this.moonrise = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.moonset = null;
    } else {
    this.moonset = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.moon_phase = null;
    } else {
    this.moon_phase = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.moon_illumination = null;
    } else {
    this.moon_illumination = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.location_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.location_id);
    }
    if (null == this.sunrise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sunrise);
    }
    if (null == this.sunset) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sunset);
    }
    if (null == this.moonrise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, moonrise);
    }
    if (null == this.moonset) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, moonset);
    }
    if (null == this.moon_phase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, moon_phase);
    }
    if (null == this.moon_illumination) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.moon_illumination);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.location_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.location_id);
    }
    if (null == this.sunrise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sunrise);
    }
    if (null == this.sunset) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, sunset);
    }
    if (null == this.moonrise) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, moonrise);
    }
    if (null == this.moonset) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, moonset);
    }
    if (null == this.moon_phase) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, moon_phase);
    }
    if (null == this.moon_illumination) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.moon_illumination);
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
    __sb.append(FieldFormatter.escapeAndEnclose(sunrise==null?"null":sunrise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sunset==null?"null":sunset, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(moonrise==null?"null":moonrise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(moonset==null?"null":moonset, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(moon_phase==null?"null":moon_phase, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(moon_illumination==null?"null":"" + moon_illumination, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(location_id==null?"null":"" + location_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sunrise==null?"null":sunrise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sunset==null?"null":sunset, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(moonrise==null?"null":moonrise, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(moonset==null?"null":moonset, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(moon_phase==null?"null":moon_phase, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(moon_illumination==null?"null":"" + moon_illumination, delimiters));
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
    if (__cur_str.equals("null")) { this.sunrise = null; } else {
      this.sunrise = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sunset = null; } else {
      this.sunset = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.moonrise = null; } else {
      this.moonrise = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.moonset = null; } else {
      this.moonset = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.moon_phase = null; } else {
      this.moon_phase = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.moon_illumination = null; } else {
      this.moon_illumination = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.sunrise = null; } else {
      this.sunrise = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.sunset = null; } else {
      this.sunset = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.moonrise = null; } else {
      this.moonrise = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.moonset = null; } else {
      this.moonset = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.moon_phase = null; } else {
      this.moon_phase = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.moon_illumination = null; } else {
      this.moon_illumination = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    astronomical_data o = (astronomical_data) super.clone();
    return o;
  }

  public void clone0(astronomical_data o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("location_id", this.location_id);
    __sqoop$field_map.put("sunrise", this.sunrise);
    __sqoop$field_map.put("sunset", this.sunset);
    __sqoop$field_map.put("moonrise", this.moonrise);
    __sqoop$field_map.put("moonset", this.moonset);
    __sqoop$field_map.put("moon_phase", this.moon_phase);
    __sqoop$field_map.put("moon_illumination", this.moon_illumination);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("location_id", this.location_id);
    __sqoop$field_map.put("sunrise", this.sunrise);
    __sqoop$field_map.put("sunset", this.sunset);
    __sqoop$field_map.put("moonrise", this.moonrise);
    __sqoop$field_map.put("moonset", this.moonset);
    __sqoop$field_map.put("moon_phase", this.moon_phase);
    __sqoop$field_map.put("moon_illumination", this.moon_illumination);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
