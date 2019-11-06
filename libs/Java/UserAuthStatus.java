/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2019-11-06")
public class UserAuthStatus implements org.apache.thrift.TBase<UserAuthStatus, UserAuthStatus._Fields>, java.io.Serializable, Cloneable, Comparable<UserAuthStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserAuthStatus");

  private static final org.apache.thrift.protocol.TField PHONE_NUMBER_REGISTERED_FIELD_DESC = new org.apache.thrift.protocol.TField("phoneNumberRegistered", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField REGISTERED_SNS_ID_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("registeredSnsIdTypes", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserAuthStatusStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserAuthStatusTupleSchemeFactory();

  public boolean phoneNumberRegistered; // required
  public @org.apache.thrift.annotation.Nullable java.util.List<SnsIdType> registeredSnsIdTypes; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PHONE_NUMBER_REGISTERED((short)1, "phoneNumberRegistered"),
    REGISTERED_SNS_ID_TYPES((short)2, "registeredSnsIdTypes");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PHONE_NUMBER_REGISTERED
          return PHONE_NUMBER_REGISTERED;
        case 2: // REGISTERED_SNS_ID_TYPES
          return REGISTERED_SNS_ID_TYPES;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PHONENUMBERREGISTERED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PHONE_NUMBER_REGISTERED, new org.apache.thrift.meta_data.FieldMetaData("phoneNumberRegistered", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.REGISTERED_SNS_ID_TYPES, new org.apache.thrift.meta_data.FieldMetaData("registeredSnsIdTypes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SnsIdType.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserAuthStatus.class, metaDataMap);
  }

  public UserAuthStatus() {
  }

  public UserAuthStatus(
    boolean phoneNumberRegistered,
    java.util.List<SnsIdType> registeredSnsIdTypes)
  {
    this();
    this.phoneNumberRegistered = phoneNumberRegistered;
    setPhoneNumberRegisteredIsSet(true);
    this.registeredSnsIdTypes = registeredSnsIdTypes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserAuthStatus(UserAuthStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    this.phoneNumberRegistered = other.phoneNumberRegistered;
    if (other.isSetRegisteredSnsIdTypes()) {
      java.util.List<SnsIdType> __this__registeredSnsIdTypes = new java.util.ArrayList<SnsIdType>(other.registeredSnsIdTypes.size());
      for (SnsIdType other_element : other.registeredSnsIdTypes) {
        __this__registeredSnsIdTypes.add(other_element);
      }
      this.registeredSnsIdTypes = __this__registeredSnsIdTypes;
    }
  }

  public UserAuthStatus deepCopy() {
    return new UserAuthStatus(this);
  }

  @Override
  public void clear() {
    setPhoneNumberRegisteredIsSet(false);
    this.phoneNumberRegistered = false;
    this.registeredSnsIdTypes = null;
  }

  public boolean isPhoneNumberRegistered() {
    return this.phoneNumberRegistered;
  }

  public UserAuthStatus setPhoneNumberRegistered(boolean phoneNumberRegistered) {
    this.phoneNumberRegistered = phoneNumberRegistered;
    setPhoneNumberRegisteredIsSet(true);
    return this;
  }

  public void unsetPhoneNumberRegistered() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PHONENUMBERREGISTERED_ISSET_ID);
  }

  /** Returns true if field phoneNumberRegistered is set (has been assigned a value) and false otherwise */
  public boolean isSetPhoneNumberRegistered() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PHONENUMBERREGISTERED_ISSET_ID);
  }

  public void setPhoneNumberRegisteredIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PHONENUMBERREGISTERED_ISSET_ID, value);
  }

  public int getRegisteredSnsIdTypesSize() {
    return (this.registeredSnsIdTypes == null) ? 0 : this.registeredSnsIdTypes.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SnsIdType> getRegisteredSnsIdTypesIterator() {
    return (this.registeredSnsIdTypes == null) ? null : this.registeredSnsIdTypes.iterator();
  }

  public void addToRegisteredSnsIdTypes(SnsIdType elem) {
    if (this.registeredSnsIdTypes == null) {
      this.registeredSnsIdTypes = new java.util.ArrayList<SnsIdType>();
    }
    this.registeredSnsIdTypes.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<SnsIdType> getRegisteredSnsIdTypes() {
    return this.registeredSnsIdTypes;
  }

  public UserAuthStatus setRegisteredSnsIdTypes(@org.apache.thrift.annotation.Nullable java.util.List<SnsIdType> registeredSnsIdTypes) {
    this.registeredSnsIdTypes = registeredSnsIdTypes;
    return this;
  }

  public void unsetRegisteredSnsIdTypes() {
    this.registeredSnsIdTypes = null;
  }

  /** Returns true if field registeredSnsIdTypes is set (has been assigned a value) and false otherwise */
  public boolean isSetRegisteredSnsIdTypes() {
    return this.registeredSnsIdTypes != null;
  }

  public void setRegisteredSnsIdTypesIsSet(boolean value) {
    if (!value) {
      this.registeredSnsIdTypes = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case PHONE_NUMBER_REGISTERED:
      if (value == null) {
        unsetPhoneNumberRegistered();
      } else {
        setPhoneNumberRegistered((java.lang.Boolean)value);
      }
      break;

    case REGISTERED_SNS_ID_TYPES:
      if (value == null) {
        unsetRegisteredSnsIdTypes();
      } else {
        setRegisteredSnsIdTypes((java.util.List<SnsIdType>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PHONE_NUMBER_REGISTERED:
      return isPhoneNumberRegistered();

    case REGISTERED_SNS_ID_TYPES:
      return getRegisteredSnsIdTypes();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PHONE_NUMBER_REGISTERED:
      return isSetPhoneNumberRegistered();
    case REGISTERED_SNS_ID_TYPES:
      return isSetRegisteredSnsIdTypes();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserAuthStatus)
      return this.equals((UserAuthStatus)that);
    return false;
  }

  public boolean equals(UserAuthStatus that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_phoneNumberRegistered = true;
    boolean that_present_phoneNumberRegistered = true;
    if (this_present_phoneNumberRegistered || that_present_phoneNumberRegistered) {
      if (!(this_present_phoneNumberRegistered && that_present_phoneNumberRegistered))
        return false;
      if (this.phoneNumberRegistered != that.phoneNumberRegistered)
        return false;
    }

    boolean this_present_registeredSnsIdTypes = true && this.isSetRegisteredSnsIdTypes();
    boolean that_present_registeredSnsIdTypes = true && that.isSetRegisteredSnsIdTypes();
    if (this_present_registeredSnsIdTypes || that_present_registeredSnsIdTypes) {
      if (!(this_present_registeredSnsIdTypes && that_present_registeredSnsIdTypes))
        return false;
      if (!this.registeredSnsIdTypes.equals(that.registeredSnsIdTypes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((phoneNumberRegistered) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetRegisteredSnsIdTypes()) ? 131071 : 524287);
    if (isSetRegisteredSnsIdTypes())
      hashCode = hashCode * 8191 + registeredSnsIdTypes.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserAuthStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPhoneNumberRegistered()).compareTo(other.isSetPhoneNumberRegistered());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhoneNumberRegistered()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phoneNumberRegistered, other.phoneNumberRegistered);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRegisteredSnsIdTypes()).compareTo(other.isSetRegisteredSnsIdTypes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegisteredSnsIdTypes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.registeredSnsIdTypes, other.registeredSnsIdTypes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAuthStatus(");
    boolean first = true;

    sb.append("phoneNumberRegistered:");
    sb.append(this.phoneNumberRegistered);
    first = false;
    if (!first) sb.append(", ");
    sb.append("registeredSnsIdTypes:");
    if (this.registeredSnsIdTypes == null) {
      sb.append("null");
    } else {
      sb.append(this.registeredSnsIdTypes);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserAuthStatusStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserAuthStatusStandardScheme getScheme() {
      return new UserAuthStatusStandardScheme();
    }
  }

  private static class UserAuthStatusStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserAuthStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserAuthStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PHONE_NUMBER_REGISTERED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.phoneNumberRegistered = iprot.readBool();
              struct.setPhoneNumberRegisteredIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REGISTERED_SNS_ID_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list360 = iprot.readListBegin();
                struct.registeredSnsIdTypes = new java.util.ArrayList<SnsIdType>(_list360.size);
                @org.apache.thrift.annotation.Nullable SnsIdType _elem361;
                for (int _i362 = 0; _i362 < _list360.size; ++_i362)
                {
                  _elem361 = SnsIdType.findByValue(iprot.readI32());
                  if (_elem361 != null)
                  {
                    struct.registeredSnsIdTypes.add(_elem361);
                  }
                }
                iprot.readListEnd();
              }
              struct.setRegisteredSnsIdTypesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserAuthStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PHONE_NUMBER_REGISTERED_FIELD_DESC);
      oprot.writeBool(struct.phoneNumberRegistered);
      oprot.writeFieldEnd();
      if (struct.registeredSnsIdTypes != null) {
        oprot.writeFieldBegin(REGISTERED_SNS_ID_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.registeredSnsIdTypes.size()));
          for (SnsIdType _iter363 : struct.registeredSnsIdTypes)
          {
            oprot.writeI32(_iter363.getValue());
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserAuthStatusTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserAuthStatusTupleScheme getScheme() {
      return new UserAuthStatusTupleScheme();
    }
  }

  private static class UserAuthStatusTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserAuthStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserAuthStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPhoneNumberRegistered()) {
        optionals.set(0);
      }
      if (struct.isSetRegisteredSnsIdTypes()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetPhoneNumberRegistered()) {
        oprot.writeBool(struct.phoneNumberRegistered);
      }
      if (struct.isSetRegisteredSnsIdTypes()) {
        {
          oprot.writeI32(struct.registeredSnsIdTypes.size());
          for (SnsIdType _iter364 : struct.registeredSnsIdTypes)
          {
            oprot.writeI32(_iter364.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserAuthStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.phoneNumberRegistered = iprot.readBool();
        struct.setPhoneNumberRegisteredIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list365 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.registeredSnsIdTypes = new java.util.ArrayList<SnsIdType>(_list365.size);
          @org.apache.thrift.annotation.Nullable SnsIdType _elem366;
          for (int _i367 = 0; _i367 < _list365.size; ++_i367)
          {
            _elem366 = SnsIdType.findByValue(iprot.readI32());
            if (_elem366 != null)
            {
              struct.registeredSnsIdTypes.add(_elem366);
            }
          }
        }
        struct.setRegisteredSnsIdTypesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
