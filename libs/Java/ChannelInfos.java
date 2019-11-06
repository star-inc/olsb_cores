/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2019-11-06")
public class ChannelInfos implements org.apache.thrift.TBase<ChannelInfos, ChannelInfos._Fields>, java.io.Serializable, Cloneable, Comparable<ChannelInfos> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChannelInfos");

  private static final org.apache.thrift.protocol.TField CHANNEL_INFOS_FIELD_DESC = new org.apache.thrift.protocol.TField("channelInfos", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ChannelInfosStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ChannelInfosTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<ChannelInfo> channelInfos; // required
  public long revision; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHANNEL_INFOS((short)1, "channelInfos"),
    REVISION((short)2, "revision");

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
        case 1: // CHANNEL_INFOS
          return CHANNEL_INFOS;
        case 2: // REVISION
          return REVISION;
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
  private static final int __REVISION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHANNEL_INFOS, new org.apache.thrift.meta_data.FieldMetaData("channelInfos", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ChannelInfo.class))));
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChannelInfos.class, metaDataMap);
  }

  public ChannelInfos() {
  }

  public ChannelInfos(
    java.util.List<ChannelInfo> channelInfos,
    long revision)
  {
    this();
    this.channelInfos = channelInfos;
    this.revision = revision;
    setRevisionIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChannelInfos(ChannelInfos other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetChannelInfos()) {
      java.util.List<ChannelInfo> __this__channelInfos = new java.util.ArrayList<ChannelInfo>(other.channelInfos.size());
      for (ChannelInfo other_element : other.channelInfos) {
        __this__channelInfos.add(new ChannelInfo(other_element));
      }
      this.channelInfos = __this__channelInfos;
    }
    this.revision = other.revision;
  }

  public ChannelInfos deepCopy() {
    return new ChannelInfos(this);
  }

  @Override
  public void clear() {
    this.channelInfos = null;
    setRevisionIsSet(false);
    this.revision = 0;
  }

  public int getChannelInfosSize() {
    return (this.channelInfos == null) ? 0 : this.channelInfos.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ChannelInfo> getChannelInfosIterator() {
    return (this.channelInfos == null) ? null : this.channelInfos.iterator();
  }

  public void addToChannelInfos(ChannelInfo elem) {
    if (this.channelInfos == null) {
      this.channelInfos = new java.util.ArrayList<ChannelInfo>();
    }
    this.channelInfos.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ChannelInfo> getChannelInfos() {
    return this.channelInfos;
  }

  public ChannelInfos setChannelInfos(@org.apache.thrift.annotation.Nullable java.util.List<ChannelInfo> channelInfos) {
    this.channelInfos = channelInfos;
    return this;
  }

  public void unsetChannelInfos() {
    this.channelInfos = null;
  }

  /** Returns true if field channelInfos is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelInfos() {
    return this.channelInfos != null;
  }

  public void setChannelInfosIsSet(boolean value) {
    if (!value) {
      this.channelInfos = null;
    }
  }

  public long getRevision() {
    return this.revision;
  }

  public ChannelInfos setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
    return this;
  }

  public void unsetRevision() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CHANNEL_INFOS:
      if (value == null) {
        unsetChannelInfos();
      } else {
        setChannelInfos((java.util.List<ChannelInfo>)value);
      }
      break;

    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CHANNEL_INFOS:
      return getChannelInfos();

    case REVISION:
      return getRevision();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CHANNEL_INFOS:
      return isSetChannelInfos();
    case REVISION:
      return isSetRevision();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ChannelInfos)
      return this.equals((ChannelInfos)that);
    return false;
  }

  public boolean equals(ChannelInfos that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_channelInfos = true && this.isSetChannelInfos();
    boolean that_present_channelInfos = true && that.isSetChannelInfos();
    if (this_present_channelInfos || that_present_channelInfos) {
      if (!(this_present_channelInfos && that_present_channelInfos))
        return false;
      if (!this.channelInfos.equals(that.channelInfos))
        return false;
    }

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetChannelInfos()) ? 131071 : 524287);
    if (isSetChannelInfos())
      hashCode = hashCode * 8191 + channelInfos.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(revision);

    return hashCode;
  }

  @Override
  public int compareTo(ChannelInfos other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetChannelInfos()).compareTo(other.isSetChannelInfos());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelInfos()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelInfos, other.channelInfos);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ChannelInfos(");
    boolean first = true;

    sb.append("channelInfos:");
    if (this.channelInfos == null) {
      sb.append("null");
    } else {
      sb.append(this.channelInfos);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("revision:");
    sb.append(this.revision);
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

  private static class ChannelInfosStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ChannelInfosStandardScheme getScheme() {
      return new ChannelInfosStandardScheme();
    }
  }

  private static class ChannelInfosStandardScheme extends org.apache.thrift.scheme.StandardScheme<ChannelInfos> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChannelInfos struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHANNEL_INFOS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list88 = iprot.readListBegin();
                struct.channelInfos = new java.util.ArrayList<ChannelInfo>(_list88.size);
                @org.apache.thrift.annotation.Nullable ChannelInfo _elem89;
                for (int _i90 = 0; _i90 < _list88.size; ++_i90)
                {
                  _elem89 = new ChannelInfo();
                  _elem89.read(iprot);
                  struct.channelInfos.add(_elem89);
                }
                iprot.readListEnd();
              }
              struct.setChannelInfosIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.revision = iprot.readI64();
              struct.setRevisionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChannelInfos struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.channelInfos != null) {
        oprot.writeFieldBegin(CHANNEL_INFOS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.channelInfos.size()));
          for (ChannelInfo _iter91 : struct.channelInfos)
          {
            _iter91.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(struct.revision);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChannelInfosTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ChannelInfosTupleScheme getScheme() {
      return new ChannelInfosTupleScheme();
    }
  }

  private static class ChannelInfosTupleScheme extends org.apache.thrift.scheme.TupleScheme<ChannelInfos> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ChannelInfos struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetChannelInfos()) {
        optionals.set(0);
      }
      if (struct.isSetRevision()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetChannelInfos()) {
        {
          oprot.writeI32(struct.channelInfos.size());
          for (ChannelInfo _iter92 : struct.channelInfos)
          {
            _iter92.write(oprot);
          }
        }
      }
      if (struct.isSetRevision()) {
        oprot.writeI64(struct.revision);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ChannelInfos struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list93 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.channelInfos = new java.util.ArrayList<ChannelInfo>(_list93.size);
          @org.apache.thrift.annotation.Nullable ChannelInfo _elem94;
          for (int _i95 = 0; _i95 < _list93.size; ++_i95)
          {
            _elem94 = new ChannelInfo();
            _elem94.read(iprot);
            struct.channelInfos.add(_elem94);
          }
        }
        struct.setChannelInfosIsSet(true);
      }
      if (incoming.get(1)) {
        struct.revision = iprot.readI64();
        struct.setRevisionIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
