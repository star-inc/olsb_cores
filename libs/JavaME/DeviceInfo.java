/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class DeviceInfo implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("DeviceInfo");

  private static final TField DEVICE_NAME_FIELD_DESC = new TField("deviceName", TType.STRING, (short)1);
  private static final TField SYSTEM_NAME_FIELD_DESC = new TField("systemName", TType.STRING, (short)2);
  private static final TField SYSTEM_VERSION_FIELD_DESC = new TField("systemVersion", TType.STRING, (short)3);
  private static final TField MODEL_FIELD_DESC = new TField("model", TType.STRING, (short)4);
  private static final TField CARRIER_CODE_FIELD_DESC = new TField("carrierCode", TType.I32, (short)10);
  private static final TField CARRIER_NAME_FIELD_DESC = new TField("carrierName", TType.STRING, (short)11);
  private static final TField APPLICATION_TYPE_FIELD_DESC = new TField("applicationType", TType.I32, (short)20);

  private String deviceName;
  private String systemName;
  private String systemVersion;
  private String model;
  private CarrierCode carrierCode;
  private String carrierName;
  private ApplicationType applicationType;

  // isset id assignments

  public DeviceInfo() {
  }

  public DeviceInfo(
    String deviceName,
    String systemName,
    String systemVersion,
    String model,
    CarrierCode carrierCode,
    String carrierName,
    ApplicationType applicationType)
  {
    this();
    this.deviceName = deviceName;
    this.systemName = systemName;
    this.systemVersion = systemVersion;
    this.model = model;
    this.carrierCode = carrierCode;
    this.carrierName = carrierName;
    this.applicationType = applicationType;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DeviceInfo(DeviceInfo other) {
    if (other.isSetDeviceName()) {
      this.deviceName = other.deviceName;
    }
    if (other.isSetSystemName()) {
      this.systemName = other.systemName;
    }
    if (other.isSetSystemVersion()) {
      this.systemVersion = other.systemVersion;
    }
    if (other.isSetModel()) {
      this.model = other.model;
    }
    if (other.isSetCarrierCode()) {
      this.carrierCode = other.carrierCode;
    }
    if (other.isSetCarrierName()) {
      this.carrierName = other.carrierName;
    }
    if (other.isSetApplicationType()) {
      this.applicationType = other.applicationType;
    }
  }

  public DeviceInfo deepCopy() {
    return new DeviceInfo(this);
  }

  public void clear() {
    this.deviceName = null;
    this.systemName = null;
    this.systemVersion = null;
    this.model = null;
    this.carrierCode = null;
    this.carrierName = null;
    this.applicationType = null;
  }

  public String getDeviceName() {
    return this.deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public void unsetDeviceName() {
    this.deviceName = null;
  }

  /** Returns true if field deviceName is set (has been assigned a value) and false otherwise */
  public boolean isSetDeviceName() {
    return this.deviceName != null;
  }

  public void setDeviceNameIsSet(boolean value) {
    if (!value) {
      this.deviceName = null;
    }
  }

  public String getSystemName() {
    return this.systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public void unsetSystemName() {
    this.systemName = null;
  }

  /** Returns true if field systemName is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemName() {
    return this.systemName != null;
  }

  public void setSystemNameIsSet(boolean value) {
    if (!value) {
      this.systemName = null;
    }
  }

  public String getSystemVersion() {
    return this.systemVersion;
  }

  public void setSystemVersion(String systemVersion) {
    this.systemVersion = systemVersion;
  }

  public void unsetSystemVersion() {
    this.systemVersion = null;
  }

  /** Returns true if field systemVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetSystemVersion() {
    return this.systemVersion != null;
  }

  public void setSystemVersionIsSet(boolean value) {
    if (!value) {
      this.systemVersion = null;
    }
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void unsetModel() {
    this.model = null;
  }

  /** Returns true if field model is set (has been assigned a value) and false otherwise */
  public boolean isSetModel() {
    return this.model != null;
  }

  public void setModelIsSet(boolean value) {
    if (!value) {
      this.model = null;
    }
  }

  /**
   * 
   * @see CarrierCode
   */
  public CarrierCode getCarrierCode() {
    return this.carrierCode;
  }

  /**
   * 
   * @see CarrierCode
   */
  public void setCarrierCode(CarrierCode carrierCode) {
    this.carrierCode = carrierCode;
  }

  public void unsetCarrierCode() {
    this.carrierCode = null;
  }

  /** Returns true if field carrierCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCarrierCode() {
    return this.carrierCode != null;
  }

  public void setCarrierCodeIsSet(boolean value) {
    if (!value) {
      this.carrierCode = null;
    }
  }

  public String getCarrierName() {
    return this.carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public void unsetCarrierName() {
    this.carrierName = null;
  }

  /** Returns true if field carrierName is set (has been assigned a value) and false otherwise */
  public boolean isSetCarrierName() {
    return this.carrierName != null;
  }

  public void setCarrierNameIsSet(boolean value) {
    if (!value) {
      this.carrierName = null;
    }
  }

  /**
   * 
   * @see ApplicationType
   */
  public ApplicationType getApplicationType() {
    return this.applicationType;
  }

  /**
   * 
   * @see ApplicationType
   */
  public void setApplicationType(ApplicationType applicationType) {
    this.applicationType = applicationType;
  }

  public void unsetApplicationType() {
    this.applicationType = null;
  }

  /** Returns true if field applicationType is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationType() {
    return this.applicationType != null;
  }

  public void setApplicationTypeIsSet(boolean value) {
    if (!value) {
      this.applicationType = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DeviceInfo)
      return this.equals((DeviceInfo)that);
    return false;
  }

  public boolean equals(DeviceInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_deviceName = true && this.isSetDeviceName();
    boolean that_present_deviceName = true && that.isSetDeviceName();
    if (this_present_deviceName || that_present_deviceName) {
      if (!(this_present_deviceName && that_present_deviceName))
        return false;
      if (!this.deviceName.equals(that.deviceName))
        return false;
    }

    boolean this_present_systemName = true && this.isSetSystemName();
    boolean that_present_systemName = true && that.isSetSystemName();
    if (this_present_systemName || that_present_systemName) {
      if (!(this_present_systemName && that_present_systemName))
        return false;
      if (!this.systemName.equals(that.systemName))
        return false;
    }

    boolean this_present_systemVersion = true && this.isSetSystemVersion();
    boolean that_present_systemVersion = true && that.isSetSystemVersion();
    if (this_present_systemVersion || that_present_systemVersion) {
      if (!(this_present_systemVersion && that_present_systemVersion))
        return false;
      if (!this.systemVersion.equals(that.systemVersion))
        return false;
    }

    boolean this_present_model = true && this.isSetModel();
    boolean that_present_model = true && that.isSetModel();
    if (this_present_model || that_present_model) {
      if (!(this_present_model && that_present_model))
        return false;
      if (!this.model.equals(that.model))
        return false;
    }

    boolean this_present_carrierCode = true && this.isSetCarrierCode();
    boolean that_present_carrierCode = true && that.isSetCarrierCode();
    if (this_present_carrierCode || that_present_carrierCode) {
      if (!(this_present_carrierCode && that_present_carrierCode))
        return false;
      if (!this.carrierCode.equals(that.carrierCode))
        return false;
    }

    boolean this_present_carrierName = true && this.isSetCarrierName();
    boolean that_present_carrierName = true && that.isSetCarrierName();
    if (this_present_carrierName || that_present_carrierName) {
      if (!(this_present_carrierName && that_present_carrierName))
        return false;
      if (!this.carrierName.equals(that.carrierName))
        return false;
    }

    boolean this_present_applicationType = true && this.isSetApplicationType();
    boolean that_present_applicationType = true && that.isSetApplicationType();
    if (this_present_applicationType || that_present_applicationType) {
      if (!(this_present_applicationType && that_present_applicationType))
        return false;
      if (!this.applicationType.equals(that.applicationType))
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    DeviceInfo other = (DeviceInfo)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetDeviceName(), other.isSetDeviceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeviceName()) {
      lastComparison = TBaseHelper.compareTo(this.deviceName, other.deviceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSystemName(), other.isSetSystemName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemName()) {
      lastComparison = TBaseHelper.compareTo(this.systemName, other.systemName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSystemVersion(), other.isSetSystemVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSystemVersion()) {
      lastComparison = TBaseHelper.compareTo(this.systemVersion, other.systemVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetModel(), other.isSetModel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModel()) {
      lastComparison = TBaseHelper.compareTo(this.model, other.model);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCarrierCode(), other.isSetCarrierCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCarrierCode()) {
      lastComparison = TBaseHelper.compareTo(this.carrierCode, other.carrierCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCarrierName(), other.isSetCarrierName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCarrierName()) {
      lastComparison = TBaseHelper.compareTo(this.carrierName, other.carrierName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetApplicationType(), other.isSetApplicationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationType()) {
      lastComparison = TBaseHelper.compareTo(this.applicationType, other.applicationType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
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
        case 1: // DEVICE_NAME
          if (field.type == TType.STRING) {
            this.deviceName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SYSTEM_NAME
          if (field.type == TType.STRING) {
            this.systemName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SYSTEM_VERSION
          if (field.type == TType.STRING) {
            this.systemVersion = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // MODEL
          if (field.type == TType.STRING) {
            this.model = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // CARRIER_CODE
          if (field.type == TType.I32) {
            this.carrierCode = CarrierCode.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // CARRIER_NAME
          if (field.type == TType.STRING) {
            this.carrierName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 20: // APPLICATION_TYPE
          if (field.type == TType.I32) {
            this.applicationType = ApplicationType.findByValue(iprot.readI32());
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
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.deviceName != null) {
      oprot.writeFieldBegin(DEVICE_NAME_FIELD_DESC);
      oprot.writeString(this.deviceName);
      oprot.writeFieldEnd();
    }
    if (this.systemName != null) {
      oprot.writeFieldBegin(SYSTEM_NAME_FIELD_DESC);
      oprot.writeString(this.systemName);
      oprot.writeFieldEnd();
    }
    if (this.systemVersion != null) {
      oprot.writeFieldBegin(SYSTEM_VERSION_FIELD_DESC);
      oprot.writeString(this.systemVersion);
      oprot.writeFieldEnd();
    }
    if (this.model != null) {
      oprot.writeFieldBegin(MODEL_FIELD_DESC);
      oprot.writeString(this.model);
      oprot.writeFieldEnd();
    }
    if (this.carrierCode != null) {
      oprot.writeFieldBegin(CARRIER_CODE_FIELD_DESC);
      oprot.writeI32(this.carrierCode.getValue());
      oprot.writeFieldEnd();
    }
    if (this.carrierName != null) {
      oprot.writeFieldBegin(CARRIER_NAME_FIELD_DESC);
      oprot.writeString(this.carrierName);
      oprot.writeFieldEnd();
    }
    if (this.applicationType != null) {
      oprot.writeFieldBegin(APPLICATION_TYPE_FIELD_DESC);
      oprot.writeI32(this.applicationType.getValue());
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("DeviceInfo(");
    boolean first = true;

    sb.append("deviceName:");
    if (this.deviceName == null) {
      sb.append("null");
    } else {
      sb.append(this.deviceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("systemName:");
    if (this.systemName == null) {
      sb.append("null");
    } else {
      sb.append(this.systemName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("systemVersion:");
    if (this.systemVersion == null) {
      sb.append("null");
    } else {
      sb.append(this.systemVersion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("model:");
    if (this.model == null) {
      sb.append("null");
    } else {
      sb.append(this.model);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("carrierCode:");
    if (this.carrierCode == null) {
      sb.append("null");
    } else {
      sb.append(this.carrierCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("carrierName:");
    if (this.carrierName == null) {
      sb.append("null");
    } else {
      sb.append(this.carrierName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("applicationType:");
    if (this.applicationType == null) {
      sb.append("null");
    } else {
      sb.append(this.applicationType);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

