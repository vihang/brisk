/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.thriftfs.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

/**
 * Information about the compilation version of this server
 */
public class VersionInfo implements TBase<VersionInfo, VersionInfo._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("VersionInfo");

  private static final TField VERSION_FIELD_DESC = new TField("version", TType.STRING, (short)1);
  private static final TField REVISION_FIELD_DESC = new TField("revision", TType.STRING, (short)2);
  private static final TField COMPILE_DATE_FIELD_DESC = new TField("compileDate", TType.STRING, (short)4);
  private static final TField COMPILING_USER_FIELD_DESC = new TField("compilingUser", TType.STRING, (short)5);
  private static final TField URL_FIELD_DESC = new TField("url", TType.STRING, (short)6);
  private static final TField BUILD_VERSION_FIELD_DESC = new TField("buildVersion", TType.STRING, (short)7);

  public String version;
  public String revision;
  public String compileDate;
  public String compilingUser;
  public String url;
  public String buildVersion;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    VERSION((short)1, "version"),
    REVISION((short)2, "revision"),
    COMPILE_DATE((short)4, "compileDate"),
    COMPILING_USER((short)5, "compilingUser"),
    URL((short)6, "url"),
    BUILD_VERSION((short)7, "buildVersion");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VERSION
          return VERSION;
        case 2: // REVISION
          return REVISION;
        case 4: // COMPILE_DATE
          return COMPILE_DATE;
        case 5: // COMPILING_USER
          return COMPILING_USER;
        case 6: // URL
          return URL;
        case 7: // BUILD_VERSION
          return BUILD_VERSION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new FieldMetaData("version", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.REVISION, new FieldMetaData("revision", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.COMPILE_DATE, new FieldMetaData("compileDate", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.COMPILING_USER, new FieldMetaData("compilingUser", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.URL, new FieldMetaData("url", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.BUILD_VERSION, new FieldMetaData("buildVersion", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(VersionInfo.class, metaDataMap);
  }

  public VersionInfo() {
  }

  public VersionInfo(
    String version,
    String revision,
    String compileDate,
    String compilingUser,
    String url,
    String buildVersion)
  {
    this();
    this.version = version;
    this.revision = revision;
    this.compileDate = compileDate;
    this.compilingUser = compilingUser;
    this.url = url;
    this.buildVersion = buildVersion;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VersionInfo(VersionInfo other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetRevision()) {
      this.revision = other.revision;
    }
    if (other.isSetCompileDate()) {
      this.compileDate = other.compileDate;
    }
    if (other.isSetCompilingUser()) {
      this.compilingUser = other.compilingUser;
    }
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    if (other.isSetBuildVersion()) {
      this.buildVersion = other.buildVersion;
    }
  }

  public VersionInfo deepCopy() {
    return new VersionInfo(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.revision = null;
    this.compileDate = null;
    this.compilingUser = null;
    this.url = null;
    this.buildVersion = null;
  }

  public String getVersion() {
    return this.version;
  }

  public VersionInfo setVersion(String version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been asigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public String getRevision() {
    return this.revision;
  }

  public VersionInfo setRevision(String revision) {
    this.revision = revision;
    return this;
  }

  public void unsetRevision() {
    this.revision = null;
  }

  /** Returns true if field revision is set (has been asigned a value) and false otherwise */
  public boolean isSetRevision() {
    return this.revision != null;
  }

  public void setRevisionIsSet(boolean value) {
    if (!value) {
      this.revision = null;
    }
  }

  public String getCompileDate() {
    return this.compileDate;
  }

  public VersionInfo setCompileDate(String compileDate) {
    this.compileDate = compileDate;
    return this;
  }

  public void unsetCompileDate() {
    this.compileDate = null;
  }

  /** Returns true if field compileDate is set (has been asigned a value) and false otherwise */
  public boolean isSetCompileDate() {
    return this.compileDate != null;
  }

  public void setCompileDateIsSet(boolean value) {
    if (!value) {
      this.compileDate = null;
    }
  }

  public String getCompilingUser() {
    return this.compilingUser;
  }

  public VersionInfo setCompilingUser(String compilingUser) {
    this.compilingUser = compilingUser;
    return this;
  }

  public void unsetCompilingUser() {
    this.compilingUser = null;
  }

  /** Returns true if field compilingUser is set (has been asigned a value) and false otherwise */
  public boolean isSetCompilingUser() {
    return this.compilingUser != null;
  }

  public void setCompilingUserIsSet(boolean value) {
    if (!value) {
      this.compilingUser = null;
    }
  }

  public String getUrl() {
    return this.url;
  }

  public VersionInfo setUrl(String url) {
    this.url = url;
    return this;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been asigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public String getBuildVersion() {
    return this.buildVersion;
  }

  public VersionInfo setBuildVersion(String buildVersion) {
    this.buildVersion = buildVersion;
    return this;
  }

  public void unsetBuildVersion() {
    this.buildVersion = null;
  }

  /** Returns true if field buildVersion is set (has been asigned a value) and false otherwise */
  public boolean isSetBuildVersion() {
    return this.buildVersion != null;
  }

  public void setBuildVersionIsSet(boolean value) {
    if (!value) {
      this.buildVersion = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((String)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((String)value);
      }
      break;

    case COMPILE_DATE:
      if (value == null) {
        unsetCompileDate();
      } else {
        setCompileDate((String)value);
      }
      break;

    case COMPILING_USER:
      if (value == null) {
        unsetCompilingUser();
      } else {
        setCompilingUser((String)value);
      }
      break;

    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((String)value);
      }
      break;

    case BUILD_VERSION:
      if (value == null) {
        unsetBuildVersion();
      } else {
        setBuildVersion((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case REVISION:
      return getRevision();

    case COMPILE_DATE:
      return getCompileDate();

    case COMPILING_USER:
      return getCompilingUser();

    case URL:
      return getUrl();

    case BUILD_VERSION:
      return getBuildVersion();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case REVISION:
      return isSetRevision();
    case COMPILE_DATE:
      return isSetCompileDate();
    case COMPILING_USER:
      return isSetCompilingUser();
    case URL:
      return isSetUrl();
    case BUILD_VERSION:
      return isSetBuildVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof VersionInfo)
      return this.equals((VersionInfo)that);
    return false;
  }

  public boolean equals(VersionInfo that) {
    if (that == null)
      return false;

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_revision = true && this.isSetRevision();
    boolean that_present_revision = true && that.isSetRevision();
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (!this.revision.equals(that.revision))
        return false;
    }

    boolean this_present_compileDate = true && this.isSetCompileDate();
    boolean that_present_compileDate = true && that.isSetCompileDate();
    if (this_present_compileDate || that_present_compileDate) {
      if (!(this_present_compileDate && that_present_compileDate))
        return false;
      if (!this.compileDate.equals(that.compileDate))
        return false;
    }

    boolean this_present_compilingUser = true && this.isSetCompilingUser();
    boolean that_present_compilingUser = true && that.isSetCompilingUser();
    if (this_present_compilingUser || that_present_compilingUser) {
      if (!(this_present_compilingUser && that_present_compilingUser))
        return false;
      if (!this.compilingUser.equals(that.compilingUser))
        return false;
    }

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_buildVersion = true && this.isSetBuildVersion();
    boolean that_present_buildVersion = true && that.isSetBuildVersion();
    if (this_present_buildVersion || that_present_buildVersion) {
      if (!(this_present_buildVersion && that_present_buildVersion))
        return false;
      if (!this.buildVersion.equals(that.buildVersion))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_version = true && (isSetVersion());
    builder.append(present_version);
    if (present_version)
      builder.append(version);

    boolean present_revision = true && (isSetRevision());
    builder.append(present_revision);
    if (present_revision)
      builder.append(revision);

    boolean present_compileDate = true && (isSetCompileDate());
    builder.append(present_compileDate);
    if (present_compileDate)
      builder.append(compileDate);

    boolean present_compilingUser = true && (isSetCompilingUser());
    builder.append(present_compilingUser);
    if (present_compilingUser)
      builder.append(compilingUser);

    boolean present_url = true && (isSetUrl());
    builder.append(present_url);
    if (present_url)
      builder.append(url);

    boolean present_buildVersion = true && (isSetBuildVersion());
    builder.append(present_buildVersion);
    if (present_buildVersion)
      builder.append(buildVersion);

    return builder.toHashCode();
  }

  public int compareTo(VersionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    VersionInfo typedOther = (VersionInfo)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRevision()).compareTo(typedOther.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = TBaseHelper.compareTo(this.revision, typedOther.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompileDate()).compareTo(typedOther.isSetCompileDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompileDate()) {
      lastComparison = TBaseHelper.compareTo(this.compileDate, typedOther.compileDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompilingUser()).compareTo(typedOther.isSetCompilingUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompilingUser()) {
      lastComparison = TBaseHelper.compareTo(this.compilingUser, typedOther.compilingUser);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUrl()).compareTo(typedOther.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = TBaseHelper.compareTo(this.url, typedOther.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuildVersion()).compareTo(typedOther.isSetBuildVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildVersion()) {
      lastComparison = TBaseHelper.compareTo(this.buildVersion, typedOther.buildVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // VERSION
          if (field.type == TType.STRING) {
            this.version = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REVISION
          if (field.type == TType.STRING) {
            this.revision = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // COMPILE_DATE
          if (field.type == TType.STRING) {
            this.compileDate = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // COMPILING_USER
          if (field.type == TType.STRING) {
            this.compilingUser = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // URL
          if (field.type == TType.STRING) {
            this.url = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // BUILD_VERSION
          if (field.type == TType.STRING) {
            this.buildVersion = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.version != null) {
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeString(this.version);
      oprot.writeFieldEnd();
    }
    if (this.revision != null) {
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeString(this.revision);
      oprot.writeFieldEnd();
    }
    if (this.compileDate != null) {
      oprot.writeFieldBegin(COMPILE_DATE_FIELD_DESC);
      oprot.writeString(this.compileDate);
      oprot.writeFieldEnd();
    }
    if (this.compilingUser != null) {
      oprot.writeFieldBegin(COMPILING_USER_FIELD_DESC);
      oprot.writeString(this.compilingUser);
      oprot.writeFieldEnd();
    }
    if (this.url != null) {
      oprot.writeFieldBegin(URL_FIELD_DESC);
      oprot.writeString(this.url);
      oprot.writeFieldEnd();
    }
    if (this.buildVersion != null) {
      oprot.writeFieldBegin(BUILD_VERSION_FIELD_DESC);
      oprot.writeString(this.buildVersion);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("VersionInfo(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    if (this.revision == null) {
      sb.append("null");
    } else {
      sb.append(this.revision);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("compileDate:");
    if (this.compileDate == null) {
      sb.append("null");
    } else {
      sb.append(this.compileDate);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("compilingUser:");
    if (this.compilingUser == null) {
      sb.append("null");
    } else {
      sb.append(this.compilingUser);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("url:");
    if (this.url == null) {
      sb.append("null");
    } else {
      sb.append(this.url);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("buildVersion:");
    if (this.buildVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.buildVersion);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
