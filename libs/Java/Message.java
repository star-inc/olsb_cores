/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Compiled for SuperSonic Line API Lite", date = "2018-06-30")
public class Message implements org.apache.thrift.TBase<Message, Message._Fields>, java.io.Serializable, Cloneable, Comparable<Message> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Message");

  private static final org.apache.thrift.protocol.TField _FROM_FIELD_DESC = new org.apache.thrift.protocol.TField("_from", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TO_FIELD_DESC = new org.apache.thrift.protocol.TField("to", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TO_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("toType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField DELIVERED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("deliveredTime", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)10);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRUCT, (short)11);
  private static final org.apache.thrift.protocol.TField HAS_CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("hasContent", org.apache.thrift.protocol.TType.BOOL, (short)14);
  private static final org.apache.thrift.protocol.TField CONTENT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("contentType", org.apache.thrift.protocol.TType.I32, (short)15);
  private static final org.apache.thrift.protocol.TField CONTENT_PREVIEW_FIELD_DESC = new org.apache.thrift.protocol.TField("contentPreview", org.apache.thrift.protocol.TType.STRING, (short)17);
  private static final org.apache.thrift.protocol.TField CONTENT_METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("contentMetadata", org.apache.thrift.protocol.TType.MAP, (short)18);
  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.I64, (short)19);
  private static final org.apache.thrift.protocol.TField CHUNKS_FIELD_DESC = new org.apache.thrift.protocol.TField("chunks", org.apache.thrift.protocol.TType.LIST, (short)20);
  private static final org.apache.thrift.protocol.TField RELATED_MESSAGE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("relatedMessageId", org.apache.thrift.protocol.TType.STRING, (short)21);
  private static final org.apache.thrift.protocol.TField MESSAGE_RELATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("messageRelationType", org.apache.thrift.protocol.TType.I64, (short)22);
  private static final org.apache.thrift.protocol.TField READ_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("readCount", org.apache.thrift.protocol.TType.I64, (short)23);
  private static final org.apache.thrift.protocol.TField RELATED_MESSAGE_SERVICE_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("relatedMessageServiceCode", org.apache.thrift.protocol.TType.I64, (short)24);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MessageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MessageTupleSchemeFactory();

  public java.lang.String _from; // required
  public java.lang.String to; // required
  /**
   * 
   * @see MIDType
   */
  public MIDType toType; // required
  public java.lang.String id; // required
  public long createdTime; // required
  public long deliveredTime; // required
  public java.lang.String text; // required
  public Location location; // required
  public boolean hasContent; // required
  /**
   * 
   * @see ContentType
   */
  public ContentType contentType; // required
  public java.nio.ByteBuffer contentPreview; // required
  public java.util.Map<java.lang.String,java.lang.String> contentMetadata; // required
  public long sessionId; // required
  public java.util.List<java.lang.String> chunks; // required
  public java.lang.String relatedMessageId; // required
  public long messageRelationType; // required
  public long readCount; // required
  public long relatedMessageServiceCode; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    _FROM((short)1, "_from"),
    TO((short)2, "to"),
    /**
     * 
     * @see MIDType
     */
    TO_TYPE((short)3, "toType"),
    ID((short)4, "id"),
    CREATED_TIME((short)5, "createdTime"),
    DELIVERED_TIME((short)6, "deliveredTime"),
    TEXT((short)10, "text"),
    LOCATION((short)11, "location"),
    HAS_CONTENT((short)14, "hasContent"),
    /**
     * 
     * @see ContentType
     */
    CONTENT_TYPE((short)15, "contentType"),
    CONTENT_PREVIEW((short)17, "contentPreview"),
    CONTENT_METADATA((short)18, "contentMetadata"),
    SESSION_ID((short)19, "sessionId"),
    CHUNKS((short)20, "chunks"),
    RELATED_MESSAGE_ID((short)21, "relatedMessageId"),
    MESSAGE_RELATION_TYPE((short)22, "messageRelationType"),
    READ_COUNT((short)23, "readCount"),
    RELATED_MESSAGE_SERVICE_CODE((short)24, "relatedMessageServiceCode");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // _FROM
          return _FROM;
        case 2: // TO
          return TO;
        case 3: // TO_TYPE
          return TO_TYPE;
        case 4: // ID
          return ID;
        case 5: // CREATED_TIME
          return CREATED_TIME;
        case 6: // DELIVERED_TIME
          return DELIVERED_TIME;
        case 10: // TEXT
          return TEXT;
        case 11: // LOCATION
          return LOCATION;
        case 14: // HAS_CONTENT
          return HAS_CONTENT;
        case 15: // CONTENT_TYPE
          return CONTENT_TYPE;
        case 17: // CONTENT_PREVIEW
          return CONTENT_PREVIEW;
        case 18: // CONTENT_METADATA
          return CONTENT_METADATA;
        case 19: // SESSION_ID
          return SESSION_ID;
        case 20: // CHUNKS
          return CHUNKS;
        case 21: // RELATED_MESSAGE_ID
          return RELATED_MESSAGE_ID;
        case 22: // MESSAGE_RELATION_TYPE
          return MESSAGE_RELATION_TYPE;
        case 23: // READ_COUNT
          return READ_COUNT;
        case 24: // RELATED_MESSAGE_SERVICE_CODE
          return RELATED_MESSAGE_SERVICE_CODE;
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
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private static final int __DELIVEREDTIME_ISSET_ID = 1;
  private static final int __HASCONTENT_ISSET_ID = 2;
  private static final int __SESSIONID_ISSET_ID = 3;
  private static final int __MESSAGERELATIONTYPE_ISSET_ID = 4;
  private static final int __READCOUNT_ISSET_ID = 5;
  private static final int __RELATEDMESSAGESERVICECODE_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields._FROM, new org.apache.thrift.meta_data.FieldMetaData("_from", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO, new org.apache.thrift.meta_data.FieldMetaData("to", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO_TYPE, new org.apache.thrift.meta_data.FieldMetaData("toType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MIDType.class)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DELIVERED_TIME, new org.apache.thrift.meta_data.FieldMetaData("deliveredTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Location.class)));
    tmpMap.put(_Fields.HAS_CONTENT, new org.apache.thrift.meta_data.FieldMetaData("hasContent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CONTENT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("contentType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ContentType.class)));
    tmpMap.put(_Fields.CONTENT_PREVIEW, new org.apache.thrift.meta_data.FieldMetaData("contentPreview", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.CONTENT_METADATA, new org.apache.thrift.meta_data.FieldMetaData("contentMetadata", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CHUNKS, new org.apache.thrift.meta_data.FieldMetaData("chunks", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RELATED_MESSAGE_ID, new org.apache.thrift.meta_data.FieldMetaData("relatedMessageId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE_RELATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("messageRelationType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.READ_COUNT, new org.apache.thrift.meta_data.FieldMetaData("readCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RELATED_MESSAGE_SERVICE_CODE, new org.apache.thrift.meta_data.FieldMetaData("relatedMessageServiceCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Message.class, metaDataMap);
  }

  public Message() {
  }

  public Message(
    java.lang.String _from,
    java.lang.String to,
    MIDType toType,
    java.lang.String id,
    long createdTime,
    long deliveredTime,
    java.lang.String text,
    Location location,
    boolean hasContent,
    ContentType contentType,
    java.nio.ByteBuffer contentPreview,
    java.util.Map<java.lang.String,java.lang.String> contentMetadata,
    long sessionId,
    java.util.List<java.lang.String> chunks,
    java.lang.String relatedMessageId,
    long messageRelationType,
    long readCount,
    long relatedMessageServiceCode)
  {
    this();
    this._from = _from;
    this.to = to;
    this.toType = toType;
    this.id = id;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.deliveredTime = deliveredTime;
    setDeliveredTimeIsSet(true);
    this.text = text;
    this.location = location;
    this.hasContent = hasContent;
    setHasContentIsSet(true);
    this.contentType = contentType;
    this.contentPreview = org.apache.thrift.TBaseHelper.copyBinary(contentPreview);
    this.contentMetadata = contentMetadata;
    this.sessionId = sessionId;
    setSessionIdIsSet(true);
    this.chunks = chunks;
    this.relatedMessageId = relatedMessageId;
    this.messageRelationType = messageRelationType;
    setMessageRelationTypeIsSet(true);
    this.readCount = readCount;
    setReadCountIsSet(true);
    this.relatedMessageServiceCode = relatedMessageServiceCode;
    setRelatedMessageServiceCodeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Message(Message other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSet_from()) {
      this._from = other._from;
    }
    if (other.isSetTo()) {
      this.to = other.to;
    }
    if (other.isSetToType()) {
      this.toType = other.toType;
    }
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.createdTime = other.createdTime;
    this.deliveredTime = other.deliveredTime;
    if (other.isSetText()) {
      this.text = other.text;
    }
    if (other.isSetLocation()) {
      this.location = new Location(other.location);
    }
    this.hasContent = other.hasContent;
    if (other.isSetContentType()) {
      this.contentType = other.contentType;
    }
    if (other.isSetContentPreview()) {
      this.contentPreview = org.apache.thrift.TBaseHelper.copyBinary(other.contentPreview);
    }
    if (other.isSetContentMetadata()) {
      java.util.Map<java.lang.String,java.lang.String> __this__contentMetadata = new java.util.HashMap<java.lang.String,java.lang.String>(other.contentMetadata);
      this.contentMetadata = __this__contentMetadata;
    }
    this.sessionId = other.sessionId;
    if (other.isSetChunks()) {
      java.util.List<java.lang.String> __this__chunks = new java.util.ArrayList<java.lang.String>(other.chunks);
      this.chunks = __this__chunks;
    }
    if (other.isSetRelatedMessageId()) {
      this.relatedMessageId = other.relatedMessageId;
    }
    this.messageRelationType = other.messageRelationType;
    this.readCount = other.readCount;
    this.relatedMessageServiceCode = other.relatedMessageServiceCode;
  }

  public Message deepCopy() {
    return new Message(this);
  }

  @Override
  public void clear() {
    this._from = null;
    this.to = null;
    this.toType = null;
    this.id = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    setDeliveredTimeIsSet(false);
    this.deliveredTime = 0;
    this.text = null;
    this.location = null;
    setHasContentIsSet(false);
    this.hasContent = false;
    this.contentType = null;
    this.contentPreview = null;
    this.contentMetadata = null;
    setSessionIdIsSet(false);
    this.sessionId = 0;
    this.chunks = null;
    this.relatedMessageId = null;
    setMessageRelationTypeIsSet(false);
    this.messageRelationType = 0;
    setReadCountIsSet(false);
    this.readCount = 0;
    setRelatedMessageServiceCodeIsSet(false);
    this.relatedMessageServiceCode = 0;
  }

  public java.lang.String get_from() {
    return this._from;
  }

  public Message set_from(java.lang.String _from) {
    this._from = _from;
    return this;
  }

  public void unset_from() {
    this._from = null;
  }

  /** Returns true if field _from is set (has been assigned a value) and false otherwise */
  public boolean isSet_from() {
    return this._from != null;
  }

  public void set_fromIsSet(boolean value) {
    if (!value) {
      this._from = null;
    }
  }

  public java.lang.String getTo() {
    return this.to;
  }

  public Message setTo(java.lang.String to) {
    this.to = to;
    return this;
  }

  public void unsetTo() {
    this.to = null;
  }

  /** Returns true if field to is set (has been assigned a value) and false otherwise */
  public boolean isSetTo() {
    return this.to != null;
  }

  public void setToIsSet(boolean value) {
    if (!value) {
      this.to = null;
    }
  }

  /**
   * 
   * @see MIDType
   */
  public MIDType getToType() {
    return this.toType;
  }

  /**
   * 
   * @see MIDType
   */
  public Message setToType(MIDType toType) {
    this.toType = toType;
    return this;
  }

  public void unsetToType() {
    this.toType = null;
  }

  /** Returns true if field toType is set (has been assigned a value) and false otherwise */
  public boolean isSetToType() {
    return this.toType != null;
  }

  public void setToTypeIsSet(boolean value) {
    if (!value) {
      this.toType = null;
    }
  }

  public java.lang.String getId() {
    return this.id;
  }

  public Message setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public Message setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  public long getDeliveredTime() {
    return this.deliveredTime;
  }

  public Message setDeliveredTime(long deliveredTime) {
    this.deliveredTime = deliveredTime;
    setDeliveredTimeIsSet(true);
    return this;
  }

  public void unsetDeliveredTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DELIVEREDTIME_ISSET_ID);
  }

  /** Returns true if field deliveredTime is set (has been assigned a value) and false otherwise */
  public boolean isSetDeliveredTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DELIVEREDTIME_ISSET_ID);
  }

  public void setDeliveredTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DELIVEREDTIME_ISSET_ID, value);
  }

  public java.lang.String getText() {
    return this.text;
  }

  public Message setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public Location getLocation() {
    return this.location;
  }

  public Message setLocation(Location location) {
    this.location = location;
    return this;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public boolean isHasContent() {
    return this.hasContent;
  }

  public Message setHasContent(boolean hasContent) {
    this.hasContent = hasContent;
    setHasContentIsSet(true);
    return this;
  }

  public void unsetHasContent() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASCONTENT_ISSET_ID);
  }

  /** Returns true if field hasContent is set (has been assigned a value) and false otherwise */
  public boolean isSetHasContent() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASCONTENT_ISSET_ID);
  }

  public void setHasContentIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASCONTENT_ISSET_ID, value);
  }

  /**
   * 
   * @see ContentType
   */
  public ContentType getContentType() {
    return this.contentType;
  }

  /**
   * 
   * @see ContentType
   */
  public Message setContentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

  public void unsetContentType() {
    this.contentType = null;
  }

  /** Returns true if field contentType is set (has been assigned a value) and false otherwise */
  public boolean isSetContentType() {
    return this.contentType != null;
  }

  public void setContentTypeIsSet(boolean value) {
    if (!value) {
      this.contentType = null;
    }
  }

  public byte[] getContentPreview() {
    setContentPreview(org.apache.thrift.TBaseHelper.rightSize(contentPreview));
    return contentPreview == null ? null : contentPreview.array();
  }

  public java.nio.ByteBuffer bufferForContentPreview() {
    return org.apache.thrift.TBaseHelper.copyBinary(contentPreview);
  }

  public Message setContentPreview(byte[] contentPreview) {
    this.contentPreview = contentPreview == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(contentPreview.clone());
    return this;
  }

  public Message setContentPreview(java.nio.ByteBuffer contentPreview) {
    this.contentPreview = org.apache.thrift.TBaseHelper.copyBinary(contentPreview);
    return this;
  }

  public void unsetContentPreview() {
    this.contentPreview = null;
  }

  /** Returns true if field contentPreview is set (has been assigned a value) and false otherwise */
  public boolean isSetContentPreview() {
    return this.contentPreview != null;
  }

  public void setContentPreviewIsSet(boolean value) {
    if (!value) {
      this.contentPreview = null;
    }
  }

  public int getContentMetadataSize() {
    return (this.contentMetadata == null) ? 0 : this.contentMetadata.size();
  }

  public void putToContentMetadata(java.lang.String key, java.lang.String val) {
    if (this.contentMetadata == null) {
      this.contentMetadata = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.contentMetadata.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.String> getContentMetadata() {
    return this.contentMetadata;
  }

  public Message setContentMetadata(java.util.Map<java.lang.String,java.lang.String> contentMetadata) {
    this.contentMetadata = contentMetadata;
    return this;
  }

  public void unsetContentMetadata() {
    this.contentMetadata = null;
  }

  /** Returns true if field contentMetadata is set (has been assigned a value) and false otherwise */
  public boolean isSetContentMetadata() {
    return this.contentMetadata != null;
  }

  public void setContentMetadataIsSet(boolean value) {
    if (!value) {
      this.contentMetadata = null;
    }
  }

  public long getSessionId() {
    return this.sessionId;
  }

  public Message setSessionId(long sessionId) {
    this.sessionId = sessionId;
    setSessionIdIsSet(true);
    return this;
  }

  public void unsetSessionId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SESSIONID_ISSET_ID);
  }

  public void setSessionIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SESSIONID_ISSET_ID, value);
  }

  public int getChunksSize() {
    return (this.chunks == null) ? 0 : this.chunks.size();
  }

  public java.util.Iterator<java.lang.String> getChunksIterator() {
    return (this.chunks == null) ? null : this.chunks.iterator();
  }

  public void addToChunks(java.lang.String elem) {
    if (this.chunks == null) {
      this.chunks = new java.util.ArrayList<java.lang.String>();
    }
    this.chunks.add(elem);
  }

  public java.util.List<java.lang.String> getChunks() {
    return this.chunks;
  }

  public Message setChunks(java.util.List<java.lang.String> chunks) {
    this.chunks = chunks;
    return this;
  }

  public void unsetChunks() {
    this.chunks = null;
  }

  /** Returns true if field chunks is set (has been assigned a value) and false otherwise */
  public boolean isSetChunks() {
    return this.chunks != null;
  }

  public void setChunksIsSet(boolean value) {
    if (!value) {
      this.chunks = null;
    }
  }

  public java.lang.String getRelatedMessageId() {
    return this.relatedMessageId;
  }

  public Message setRelatedMessageId(java.lang.String relatedMessageId) {
    this.relatedMessageId = relatedMessageId;
    return this;
  }

  public void unsetRelatedMessageId() {
    this.relatedMessageId = null;
  }

  /** Returns true if field relatedMessageId is set (has been assigned a value) and false otherwise */
  public boolean isSetRelatedMessageId() {
    return this.relatedMessageId != null;
  }

  public void setRelatedMessageIdIsSet(boolean value) {
    if (!value) {
      this.relatedMessageId = null;
    }
  }

  public long getMessageRelationType() {
    return this.messageRelationType;
  }

  public Message setMessageRelationType(long messageRelationType) {
    this.messageRelationType = messageRelationType;
    setMessageRelationTypeIsSet(true);
    return this;
  }

  public void unsetMessageRelationType() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MESSAGERELATIONTYPE_ISSET_ID);
  }

  /** Returns true if field messageRelationType is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageRelationType() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MESSAGERELATIONTYPE_ISSET_ID);
  }

  public void setMessageRelationTypeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MESSAGERELATIONTYPE_ISSET_ID, value);
  }

  public long getReadCount() {
    return this.readCount;
  }

  public Message setReadCount(long readCount) {
    this.readCount = readCount;
    setReadCountIsSet(true);
    return this;
  }

  public void unsetReadCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __READCOUNT_ISSET_ID);
  }

  /** Returns true if field readCount is set (has been assigned a value) and false otherwise */
  public boolean isSetReadCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __READCOUNT_ISSET_ID);
  }

  public void setReadCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __READCOUNT_ISSET_ID, value);
  }

  public long getRelatedMessageServiceCode() {
    return this.relatedMessageServiceCode;
  }

  public Message setRelatedMessageServiceCode(long relatedMessageServiceCode) {
    this.relatedMessageServiceCode = relatedMessageServiceCode;
    setRelatedMessageServiceCodeIsSet(true);
    return this;
  }

  public void unsetRelatedMessageServiceCode() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RELATEDMESSAGESERVICECODE_ISSET_ID);
  }

  /** Returns true if field relatedMessageServiceCode is set (has been assigned a value) and false otherwise */
  public boolean isSetRelatedMessageServiceCode() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RELATEDMESSAGESERVICECODE_ISSET_ID);
  }

  public void setRelatedMessageServiceCodeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RELATEDMESSAGESERVICECODE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case _FROM:
      if (value == null) {
        unset_from();
      } else {
        set_from((java.lang.String)value);
      }
      break;

    case TO:
      if (value == null) {
        unsetTo();
      } else {
        setTo((java.lang.String)value);
      }
      break;

    case TO_TYPE:
      if (value == null) {
        unsetToType();
      } else {
        setToType((MIDType)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((java.lang.Long)value);
      }
      break;

    case DELIVERED_TIME:
      if (value == null) {
        unsetDeliveredTime();
      } else {
        setDeliveredTime((java.lang.Long)value);
      }
      break;

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((java.lang.String)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((Location)value);
      }
      break;

    case HAS_CONTENT:
      if (value == null) {
        unsetHasContent();
      } else {
        setHasContent((java.lang.Boolean)value);
      }
      break;

    case CONTENT_TYPE:
      if (value == null) {
        unsetContentType();
      } else {
        setContentType((ContentType)value);
      }
      break;

    case CONTENT_PREVIEW:
      if (value == null) {
        unsetContentPreview();
      } else {
        if (value instanceof byte[]) {
          setContentPreview((byte[])value);
        } else {
          setContentPreview((java.nio.ByteBuffer)value);
        }
      }
      break;

    case CONTENT_METADATA:
      if (value == null) {
        unsetContentMetadata();
      } else {
        setContentMetadata((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((java.lang.Long)value);
      }
      break;

    case CHUNKS:
      if (value == null) {
        unsetChunks();
      } else {
        setChunks((java.util.List<java.lang.String>)value);
      }
      break;

    case RELATED_MESSAGE_ID:
      if (value == null) {
        unsetRelatedMessageId();
      } else {
        setRelatedMessageId((java.lang.String)value);
      }
      break;

    case MESSAGE_RELATION_TYPE:
      if (value == null) {
        unsetMessageRelationType();
      } else {
        setMessageRelationType((java.lang.Long)value);
      }
      break;

    case READ_COUNT:
      if (value == null) {
        unsetReadCount();
      } else {
        setReadCount((java.lang.Long)value);
      }
      break;

    case RELATED_MESSAGE_SERVICE_CODE:
      if (value == null) {
        unsetRelatedMessageServiceCode();
      } else {
        setRelatedMessageServiceCode((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case _FROM:
      return get_from();

    case TO:
      return getTo();

    case TO_TYPE:
      return getToType();

    case ID:
      return getId();

    case CREATED_TIME:
      return getCreatedTime();

    case DELIVERED_TIME:
      return getDeliveredTime();

    case TEXT:
      return getText();

    case LOCATION:
      return getLocation();

    case HAS_CONTENT:
      return isHasContent();

    case CONTENT_TYPE:
      return getContentType();

    case CONTENT_PREVIEW:
      return getContentPreview();

    case CONTENT_METADATA:
      return getContentMetadata();

    case SESSION_ID:
      return getSessionId();

    case CHUNKS:
      return getChunks();

    case RELATED_MESSAGE_ID:
      return getRelatedMessageId();

    case MESSAGE_RELATION_TYPE:
      return getMessageRelationType();

    case READ_COUNT:
      return getReadCount();

    case RELATED_MESSAGE_SERVICE_CODE:
      return getRelatedMessageServiceCode();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case _FROM:
      return isSet_from();
    case TO:
      return isSetTo();
    case TO_TYPE:
      return isSetToType();
    case ID:
      return isSetId();
    case CREATED_TIME:
      return isSetCreatedTime();
    case DELIVERED_TIME:
      return isSetDeliveredTime();
    case TEXT:
      return isSetText();
    case LOCATION:
      return isSetLocation();
    case HAS_CONTENT:
      return isSetHasContent();
    case CONTENT_TYPE:
      return isSetContentType();
    case CONTENT_PREVIEW:
      return isSetContentPreview();
    case CONTENT_METADATA:
      return isSetContentMetadata();
    case SESSION_ID:
      return isSetSessionId();
    case CHUNKS:
      return isSetChunks();
    case RELATED_MESSAGE_ID:
      return isSetRelatedMessageId();
    case MESSAGE_RELATION_TYPE:
      return isSetMessageRelationType();
    case READ_COUNT:
      return isSetReadCount();
    case RELATED_MESSAGE_SERVICE_CODE:
      return isSetRelatedMessageServiceCode();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Message)
      return this.equals((Message)that);
    return false;
  }

  public boolean equals(Message that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present__from = true && this.isSet_from();
    boolean that_present__from = true && that.isSet_from();
    if (this_present__from || that_present__from) {
      if (!(this_present__from && that_present__from))
        return false;
      if (!this._from.equals(that._from))
        return false;
    }

    boolean this_present_to = true && this.isSetTo();
    boolean that_present_to = true && that.isSetTo();
    if (this_present_to || that_present_to) {
      if (!(this_present_to && that_present_to))
        return false;
      if (!this.to.equals(that.to))
        return false;
    }

    boolean this_present_toType = true && this.isSetToType();
    boolean that_present_toType = true && that.isSetToType();
    if (this_present_toType || that_present_toType) {
      if (!(this_present_toType && that_present_toType))
        return false;
      if (!this.toType.equals(that.toType))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_deliveredTime = true;
    boolean that_present_deliveredTime = true;
    if (this_present_deliveredTime || that_present_deliveredTime) {
      if (!(this_present_deliveredTime && that_present_deliveredTime))
        return false;
      if (this.deliveredTime != that.deliveredTime)
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    boolean this_present_hasContent = true;
    boolean that_present_hasContent = true;
    if (this_present_hasContent || that_present_hasContent) {
      if (!(this_present_hasContent && that_present_hasContent))
        return false;
      if (this.hasContent != that.hasContent)
        return false;
    }

    boolean this_present_contentType = true && this.isSetContentType();
    boolean that_present_contentType = true && that.isSetContentType();
    if (this_present_contentType || that_present_contentType) {
      if (!(this_present_contentType && that_present_contentType))
        return false;
      if (!this.contentType.equals(that.contentType))
        return false;
    }

    boolean this_present_contentPreview = true && this.isSetContentPreview();
    boolean that_present_contentPreview = true && that.isSetContentPreview();
    if (this_present_contentPreview || that_present_contentPreview) {
      if (!(this_present_contentPreview && that_present_contentPreview))
        return false;
      if (!this.contentPreview.equals(that.contentPreview))
        return false;
    }

    boolean this_present_contentMetadata = true && this.isSetContentMetadata();
    boolean that_present_contentMetadata = true && that.isSetContentMetadata();
    if (this_present_contentMetadata || that_present_contentMetadata) {
      if (!(this_present_contentMetadata && that_present_contentMetadata))
        return false;
      if (!this.contentMetadata.equals(that.contentMetadata))
        return false;
    }

    boolean this_present_sessionId = true;
    boolean that_present_sessionId = true;
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (this.sessionId != that.sessionId)
        return false;
    }

    boolean this_present_chunks = true && this.isSetChunks();
    boolean that_present_chunks = true && that.isSetChunks();
    if (this_present_chunks || that_present_chunks) {
      if (!(this_present_chunks && that_present_chunks))
        return false;
      if (!this.chunks.equals(that.chunks))
        return false;
    }

    boolean this_present_relatedMessageId = true && this.isSetRelatedMessageId();
    boolean that_present_relatedMessageId = true && that.isSetRelatedMessageId();
    if (this_present_relatedMessageId || that_present_relatedMessageId) {
      if (!(this_present_relatedMessageId && that_present_relatedMessageId))
        return false;
      if (!this.relatedMessageId.equals(that.relatedMessageId))
        return false;
    }

    boolean this_present_messageRelationType = true;
    boolean that_present_messageRelationType = true;
    if (this_present_messageRelationType || that_present_messageRelationType) {
      if (!(this_present_messageRelationType && that_present_messageRelationType))
        return false;
      if (this.messageRelationType != that.messageRelationType)
        return false;
    }

    boolean this_present_readCount = true;
    boolean that_present_readCount = true;
    if (this_present_readCount || that_present_readCount) {
      if (!(this_present_readCount && that_present_readCount))
        return false;
      if (this.readCount != that.readCount)
        return false;
    }

    boolean this_present_relatedMessageServiceCode = true;
    boolean that_present_relatedMessageServiceCode = true;
    if (this_present_relatedMessageServiceCode || that_present_relatedMessageServiceCode) {
      if (!(this_present_relatedMessageServiceCode && that_present_relatedMessageServiceCode))
        return false;
      if (this.relatedMessageServiceCode != that.relatedMessageServiceCode)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSet_from()) ? 131071 : 524287);
    if (isSet_from())
      hashCode = hashCode * 8191 + _from.hashCode();

    hashCode = hashCode * 8191 + ((isSetTo()) ? 131071 : 524287);
    if (isSetTo())
      hashCode = hashCode * 8191 + to.hashCode();

    hashCode = hashCode * 8191 + ((isSetToType()) ? 131071 : 524287);
    if (isSetToType())
      hashCode = hashCode * 8191 + toType.getValue();

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(createdTime);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(deliveredTime);

    hashCode = hashCode * 8191 + ((isSetText()) ? 131071 : 524287);
    if (isSetText())
      hashCode = hashCode * 8191 + text.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocation()) ? 131071 : 524287);
    if (isSetLocation())
      hashCode = hashCode * 8191 + location.hashCode();

    hashCode = hashCode * 8191 + ((hasContent) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetContentType()) ? 131071 : 524287);
    if (isSetContentType())
      hashCode = hashCode * 8191 + contentType.getValue();

    hashCode = hashCode * 8191 + ((isSetContentPreview()) ? 131071 : 524287);
    if (isSetContentPreview())
      hashCode = hashCode * 8191 + contentPreview.hashCode();

    hashCode = hashCode * 8191 + ((isSetContentMetadata()) ? 131071 : 524287);
    if (isSetContentMetadata())
      hashCode = hashCode * 8191 + contentMetadata.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(sessionId);

    hashCode = hashCode * 8191 + ((isSetChunks()) ? 131071 : 524287);
    if (isSetChunks())
      hashCode = hashCode * 8191 + chunks.hashCode();

    hashCode = hashCode * 8191 + ((isSetRelatedMessageId()) ? 131071 : 524287);
    if (isSetRelatedMessageId())
      hashCode = hashCode * 8191 + relatedMessageId.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(messageRelationType);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(readCount);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(relatedMessageServiceCode);

    return hashCode;
  }

  @Override
  public int compareTo(Message other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSet_from()).compareTo(other.isSet_from());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet_from()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this._from, other._from);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTo()).compareTo(other.isSetTo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.to, other.to);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetToType()).compareTo(other.isSetToType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toType, other.toType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDeliveredTime()).compareTo(other.isSetDeliveredTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeliveredTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deliveredTime, other.deliveredTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetText()).compareTo(other.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, other.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetHasContent()).compareTo(other.isSetHasContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasContent, other.hasContent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContentType()).compareTo(other.isSetContentType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentType, other.contentType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContentPreview()).compareTo(other.isSetContentPreview());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentPreview()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentPreview, other.contentPreview);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContentMetadata()).compareTo(other.isSetContentMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContentMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contentMetadata, other.contentMetadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetChunks()).compareTo(other.isSetChunks());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChunks()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chunks, other.chunks);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRelatedMessageId()).compareTo(other.isSetRelatedMessageId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelatedMessageId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relatedMessageId, other.relatedMessageId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMessageRelationType()).compareTo(other.isSetMessageRelationType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageRelationType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messageRelationType, other.messageRelationType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReadCount()).compareTo(other.isSetReadCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReadCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.readCount, other.readCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRelatedMessageServiceCode()).compareTo(other.isSetRelatedMessageServiceCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelatedMessageServiceCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relatedMessageServiceCode, other.relatedMessageServiceCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Message(");
    boolean first = true;

    sb.append("_from:");
    if (this._from == null) {
      sb.append("null");
    } else {
      sb.append(this._from);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("to:");
    if (this.to == null) {
      sb.append("null");
    } else {
      sb.append(this.to);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("toType:");
    if (this.toType == null) {
      sb.append("null");
    } else {
      sb.append(this.toType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("deliveredTime:");
    sb.append(this.deliveredTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("text:");
    if (this.text == null) {
      sb.append("null");
    } else {
      sb.append(this.text);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasContent:");
    sb.append(this.hasContent);
    first = false;
    if (!first) sb.append(", ");
    sb.append("contentType:");
    if (this.contentType == null) {
      sb.append("null");
    } else {
      sb.append(this.contentType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contentPreview:");
    if (this.contentPreview == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.contentPreview, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contentMetadata:");
    if (this.contentMetadata == null) {
      sb.append("null");
    } else {
      sb.append(this.contentMetadata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionId:");
    sb.append(this.sessionId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("chunks:");
    if (this.chunks == null) {
      sb.append("null");
    } else {
      sb.append(this.chunks);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("relatedMessageId:");
    if (this.relatedMessageId == null) {
      sb.append("null");
    } else {
      sb.append(this.relatedMessageId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("messageRelationType:");
    sb.append(this.messageRelationType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("readCount:");
    sb.append(this.readCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("relatedMessageServiceCode:");
    sb.append(this.relatedMessageServiceCode);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (location != null) {
      location.validate();
    }
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

  private static class MessageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MessageStandardScheme getScheme() {
      return new MessageStandardScheme();
    }
  }

  private static class MessageStandardScheme extends org.apache.thrift.scheme.StandardScheme<Message> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Message struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // _FROM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct._from = iprot.readString();
              struct.set_fromIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.to = iprot.readString();
              struct.setToIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TO_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.toType = MIDType.findByValue(iprot.readI32());
              struct.setToTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DELIVERED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.deliveredTime = iprot.readI64();
              struct.setDeliveredTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.location = new Location();
              struct.location.read(iprot);
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 14: // HAS_CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasContent = iprot.readBool();
              struct.setHasContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 15: // CONTENT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.contentType = ContentType.findByValue(iprot.readI32());
              struct.setContentTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 17: // CONTENT_PREVIEW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contentPreview = iprot.readBinary();
              struct.setContentPreviewIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 18: // CONTENT_METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map16 = iprot.readMapBegin();
                struct.contentMetadata = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map16.size);
                java.lang.String _key17;
                java.lang.String _val18;
                for (int _i19 = 0; _i19 < _map16.size; ++_i19)
                {
                  _key17 = iprot.readString();
                  _val18 = iprot.readString();
                  struct.contentMetadata.put(_key17, _val18);
                }
                iprot.readMapEnd();
              }
              struct.setContentMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 19: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sessionId = iprot.readI64();
              struct.setSessionIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 20: // CHUNKS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list20 = iprot.readListBegin();
                struct.chunks = new java.util.ArrayList<java.lang.String>(_list20.size);
                java.lang.String _elem21;
                for (int _i22 = 0; _i22 < _list20.size; ++_i22)
                {
                  _elem21 = iprot.readString();
                  struct.chunks.add(_elem21);
                }
                iprot.readListEnd();
              }
              struct.setChunksIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 21: // RELATED_MESSAGE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.relatedMessageId = iprot.readString();
              struct.setRelatedMessageIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 22: // MESSAGE_RELATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.messageRelationType = iprot.readI64();
              struct.setMessageRelationTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 23: // READ_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.readCount = iprot.readI64();
              struct.setReadCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 24: // RELATED_MESSAGE_SERVICE_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.relatedMessageServiceCode = iprot.readI64();
              struct.setRelatedMessageServiceCodeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Message struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct._from != null) {
        oprot.writeFieldBegin(_FROM_FIELD_DESC);
        oprot.writeString(struct._from);
        oprot.writeFieldEnd();
      }
      if (struct.to != null) {
        oprot.writeFieldBegin(TO_FIELD_DESC);
        oprot.writeString(struct.to);
        oprot.writeFieldEnd();
      }
      if (struct.toType != null) {
        oprot.writeFieldBegin(TO_TYPE_FIELD_DESC);
        oprot.writeI32(struct.toType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DELIVERED_TIME_FIELD_DESC);
      oprot.writeI64(struct.deliveredTime);
      oprot.writeFieldEnd();
      if (struct.text != null) {
        oprot.writeFieldBegin(TEXT_FIELD_DESC);
        oprot.writeString(struct.text);
        oprot.writeFieldEnd();
      }
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        struct.location.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_CONTENT_FIELD_DESC);
      oprot.writeBool(struct.hasContent);
      oprot.writeFieldEnd();
      if (struct.contentType != null) {
        oprot.writeFieldBegin(CONTENT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.contentType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.contentPreview != null) {
        oprot.writeFieldBegin(CONTENT_PREVIEW_FIELD_DESC);
        oprot.writeBinary(struct.contentPreview);
        oprot.writeFieldEnd();
      }
      if (struct.contentMetadata != null) {
        oprot.writeFieldBegin(CONTENT_METADATA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.contentMetadata.size()));
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter23 : struct.contentMetadata.entrySet())
          {
            oprot.writeString(_iter23.getKey());
            oprot.writeString(_iter23.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
      oprot.writeI64(struct.sessionId);
      oprot.writeFieldEnd();
      if (struct.chunks != null) {
        oprot.writeFieldBegin(CHUNKS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.chunks.size()));
          for (java.lang.String _iter24 : struct.chunks)
          {
            oprot.writeString(_iter24);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.relatedMessageId != null) {
        oprot.writeFieldBegin(RELATED_MESSAGE_ID_FIELD_DESC);
        oprot.writeString(struct.relatedMessageId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MESSAGE_RELATION_TYPE_FIELD_DESC);
      oprot.writeI64(struct.messageRelationType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(READ_COUNT_FIELD_DESC);
      oprot.writeI64(struct.readCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RELATED_MESSAGE_SERVICE_CODE_FIELD_DESC);
      oprot.writeI64(struct.relatedMessageServiceCode);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MessageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MessageTupleScheme getScheme() {
      return new MessageTupleScheme();
    }
  }

  private static class MessageTupleScheme extends org.apache.thrift.scheme.TupleScheme<Message> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Message struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSet_from()) {
        optionals.set(0);
      }
      if (struct.isSetTo()) {
        optionals.set(1);
      }
      if (struct.isSetToType()) {
        optionals.set(2);
      }
      if (struct.isSetId()) {
        optionals.set(3);
      }
      if (struct.isSetCreatedTime()) {
        optionals.set(4);
      }
      if (struct.isSetDeliveredTime()) {
        optionals.set(5);
      }
      if (struct.isSetText()) {
        optionals.set(6);
      }
      if (struct.isSetLocation()) {
        optionals.set(7);
      }
      if (struct.isSetHasContent()) {
        optionals.set(8);
      }
      if (struct.isSetContentType()) {
        optionals.set(9);
      }
      if (struct.isSetContentPreview()) {
        optionals.set(10);
      }
      if (struct.isSetContentMetadata()) {
        optionals.set(11);
      }
      if (struct.isSetSessionId()) {
        optionals.set(12);
      }
      if (struct.isSetChunks()) {
        optionals.set(13);
      }
      if (struct.isSetRelatedMessageId()) {
        optionals.set(14);
      }
      if (struct.isSetMessageRelationType()) {
        optionals.set(15);
      }
      if (struct.isSetReadCount()) {
        optionals.set(16);
      }
      if (struct.isSetRelatedMessageServiceCode()) {
        optionals.set(17);
      }
      oprot.writeBitSet(optionals, 18);
      if (struct.isSet_from()) {
        oprot.writeString(struct._from);
      }
      if (struct.isSetTo()) {
        oprot.writeString(struct.to);
      }
      if (struct.isSetToType()) {
        oprot.writeI32(struct.toType.getValue());
      }
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetDeliveredTime()) {
        oprot.writeI64(struct.deliveredTime);
      }
      if (struct.isSetText()) {
        oprot.writeString(struct.text);
      }
      if (struct.isSetLocation()) {
        struct.location.write(oprot);
      }
      if (struct.isSetHasContent()) {
        oprot.writeBool(struct.hasContent);
      }
      if (struct.isSetContentType()) {
        oprot.writeI32(struct.contentType.getValue());
      }
      if (struct.isSetContentPreview()) {
        oprot.writeBinary(struct.contentPreview);
      }
      if (struct.isSetContentMetadata()) {
        {
          oprot.writeI32(struct.contentMetadata.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter25 : struct.contentMetadata.entrySet())
          {
            oprot.writeString(_iter25.getKey());
            oprot.writeString(_iter25.getValue());
          }
        }
      }
      if (struct.isSetSessionId()) {
        oprot.writeI64(struct.sessionId);
      }
      if (struct.isSetChunks()) {
        {
          oprot.writeI32(struct.chunks.size());
          for (java.lang.String _iter26 : struct.chunks)
          {
            oprot.writeString(_iter26);
          }
        }
      }
      if (struct.isSetRelatedMessageId()) {
        oprot.writeString(struct.relatedMessageId);
      }
      if (struct.isSetMessageRelationType()) {
        oprot.writeI64(struct.messageRelationType);
      }
      if (struct.isSetReadCount()) {
        oprot.writeI64(struct.readCount);
      }
      if (struct.isSetRelatedMessageServiceCode()) {
        oprot.writeI64(struct.relatedMessageServiceCode);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Message struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(18);
      if (incoming.get(0)) {
        struct._from = iprot.readString();
        struct.set_fromIsSet(true);
      }
      if (incoming.get(1)) {
        struct.to = iprot.readString();
        struct.setToIsSet(true);
      }
      if (incoming.get(2)) {
        struct.toType = MIDType.findByValue(iprot.readI32());
        struct.setToTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.deliveredTime = iprot.readI64();
        struct.setDeliveredTimeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.text = iprot.readString();
        struct.setTextIsSet(true);
      }
      if (incoming.get(7)) {
        struct.location = new Location();
        struct.location.read(iprot);
        struct.setLocationIsSet(true);
      }
      if (incoming.get(8)) {
        struct.hasContent = iprot.readBool();
        struct.setHasContentIsSet(true);
      }
      if (incoming.get(9)) {
        struct.contentType = ContentType.findByValue(iprot.readI32());
        struct.setContentTypeIsSet(true);
      }
      if (incoming.get(10)) {
        struct.contentPreview = iprot.readBinary();
        struct.setContentPreviewIsSet(true);
      }
      if (incoming.get(11)) {
        {
          org.apache.thrift.protocol.TMap _map27 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.contentMetadata = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map27.size);
          java.lang.String _key28;
          java.lang.String _val29;
          for (int _i30 = 0; _i30 < _map27.size; ++_i30)
          {
            _key28 = iprot.readString();
            _val29 = iprot.readString();
            struct.contentMetadata.put(_key28, _val29);
          }
        }
        struct.setContentMetadataIsSet(true);
      }
      if (incoming.get(12)) {
        struct.sessionId = iprot.readI64();
        struct.setSessionIdIsSet(true);
      }
      if (incoming.get(13)) {
        {
          org.apache.thrift.protocol.TList _list31 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.chunks = new java.util.ArrayList<java.lang.String>(_list31.size);
          java.lang.String _elem32;
          for (int _i33 = 0; _i33 < _list31.size; ++_i33)
          {
            _elem32 = iprot.readString();
            struct.chunks.add(_elem32);
          }
        }
        struct.setChunksIsSet(true);
      }
      if (incoming.get(14)) {
        struct.relatedMessageId = iprot.readString();
        struct.setRelatedMessageIdIsSet(true);
      }
      if (incoming.get(15)) {
        struct.messageRelationType = iprot.readI64();
        struct.setMessageRelationTypeIsSet(true);
      }
      if (incoming.get(16)) {
        struct.readCount = iprot.readI64();
        struct.setReadCountIsSet(true);
      }
      if (incoming.get(17)) {
        struct.relatedMessageServiceCode = iprot.readI64();
        struct.setRelatedMessageServiceCodeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
