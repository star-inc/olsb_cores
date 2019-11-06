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

public class Announcement implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("Announcement");

  private static final TField INDEX_FIELD_DESC = new TField("index", TType.I32, (short)1);
  private static final TField FORCE_UPDATE_FIELD_DESC = new TField("forceUpdate", TType.BOOL, (short)10);
  private static final TField TITLE_FIELD_DESC = new TField("title", TType.STRING, (short)11);
  private static final TField TEXT_FIELD_DESC = new TField("text", TType.STRING, (short)12);
  private static final TField CREATED_TIME_FIELD_DESC = new TField("createdTime", TType.I64, (short)13);
  private static final TField PICTURE_URL_FIELD_DESC = new TField("pictureUrl", TType.STRING, (short)14);
  private static final TField THUMBNAIL_URL_FIELD_DESC = new TField("thumbnailUrl", TType.STRING, (short)15);

  private int index;
  private boolean forceUpdate;
  private String title;
  private String text;
  private long createdTime;
  private String pictureUrl;
  private String thumbnailUrl;

  // isset id assignments
  private static final int __INDEX_ISSET_ID = 0;
  private static final int __FORCEUPDATE_ISSET_ID = 1;
  private static final int __CREATEDTIME_ISSET_ID = 2;
  private boolean[] __isset_vector = new boolean[3];

  public Announcement() {
  }

  public Announcement(
    int index,
    boolean forceUpdate,
    String title,
    String text,
    long createdTime,
    String pictureUrl,
    String thumbnailUrl)
  {
    this();
    this.index = index;
    setIndexIsSet(true);
    this.forceUpdate = forceUpdate;
    setForceUpdateIsSet(true);
    this.title = title;
    this.text = text;
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.pictureUrl = pictureUrl;
    this.thumbnailUrl = thumbnailUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Announcement(Announcement other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.index = other.index;
    this.forceUpdate = other.forceUpdate;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetText()) {
      this.text = other.text;
    }
    this.createdTime = other.createdTime;
    if (other.isSetPictureUrl()) {
      this.pictureUrl = other.pictureUrl;
    }
    if (other.isSetThumbnailUrl()) {
      this.thumbnailUrl = other.thumbnailUrl;
    }
  }

  public Announcement deepCopy() {
    return new Announcement(this);
  }

  public void clear() {
    setIndexIsSet(false);
    this.index = 0;
    setForceUpdateIsSet(false);
    this.forceUpdate = false;
    this.title = null;
    this.text = null;
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.pictureUrl = null;
    this.thumbnailUrl = null;
  }

  public int getIndex() {
    return this.index;
  }

  public void setIndex(int index) {
    this.index = index;
    setIndexIsSet(true);
  }

  public void unsetIndex() {
    __isset_vector[__INDEX_ISSET_ID] = false;
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return __isset_vector[__INDEX_ISSET_ID];
  }

  public void setIndexIsSet(boolean value) {
    __isset_vector[__INDEX_ISSET_ID] = value;
  }

  public boolean isForceUpdate() {
    return this.forceUpdate;
  }

  public void setForceUpdate(boolean forceUpdate) {
    this.forceUpdate = forceUpdate;
    setForceUpdateIsSet(true);
  }

  public void unsetForceUpdate() {
    __isset_vector[__FORCEUPDATE_ISSET_ID] = false;
  }

  /** Returns true if field forceUpdate is set (has been assigned a value) and false otherwise */
  public boolean isSetForceUpdate() {
    return __isset_vector[__FORCEUPDATE_ISSET_ID];
  }

  public void setForceUpdateIsSet(boolean value) {
    __isset_vector[__FORCEUPDATE_ISSET_ID] = value;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
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

  public long getCreatedTime() {
    return this.createdTime;
  }

  public void setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
  }

  public void unsetCreatedTime() {
    __isset_vector[__CREATEDTIME_ISSET_ID] = false;
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return __isset_vector[__CREATEDTIME_ISSET_ID];
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_vector[__CREATEDTIME_ISSET_ID] = value;
  }

  public String getPictureUrl() {
    return this.pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public void unsetPictureUrl() {
    this.pictureUrl = null;
  }

  /** Returns true if field pictureUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetPictureUrl() {
    return this.pictureUrl != null;
  }

  public void setPictureUrlIsSet(boolean value) {
    if (!value) {
      this.pictureUrl = null;
    }
  }

  public String getThumbnailUrl() {
    return this.thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public void unsetThumbnailUrl() {
    this.thumbnailUrl = null;
  }

  /** Returns true if field thumbnailUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetThumbnailUrl() {
    return this.thumbnailUrl != null;
  }

  public void setThumbnailUrlIsSet(boolean value) {
    if (!value) {
      this.thumbnailUrl = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Announcement)
      return this.equals((Announcement)that);
    return false;
  }

  public boolean equals(Announcement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_index = true;
    boolean that_present_index = true;
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (this.index != that.index)
        return false;
    }

    boolean this_present_forceUpdate = true;
    boolean that_present_forceUpdate = true;
    if (this_present_forceUpdate || that_present_forceUpdate) {
      if (!(this_present_forceUpdate && that_present_forceUpdate))
        return false;
      if (this.forceUpdate != that.forceUpdate)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
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

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_pictureUrl = true && this.isSetPictureUrl();
    boolean that_present_pictureUrl = true && that.isSetPictureUrl();
    if (this_present_pictureUrl || that_present_pictureUrl) {
      if (!(this_present_pictureUrl && that_present_pictureUrl))
        return false;
      if (!this.pictureUrl.equals(that.pictureUrl))
        return false;
    }

    boolean this_present_thumbnailUrl = true && this.isSetThumbnailUrl();
    boolean that_present_thumbnailUrl = true && that.isSetThumbnailUrl();
    if (this_present_thumbnailUrl || that_present_thumbnailUrl) {
      if (!(this_present_thumbnailUrl && that_present_thumbnailUrl))
        return false;
      if (!this.thumbnailUrl.equals(that.thumbnailUrl))
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

    Announcement other = (Announcement)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetIndex(), other.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = TBaseHelper.compareTo(this.index, other.index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetForceUpdate(), other.isSetForceUpdate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetForceUpdate()) {
      lastComparison = TBaseHelper.compareTo(this.forceUpdate, other.forceUpdate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTitle(), other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetText(), other.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = TBaseHelper.compareTo(this.text, other.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetCreatedTime(), other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPictureUrl(), other.isSetPictureUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPictureUrl()) {
      lastComparison = TBaseHelper.compareTo(this.pictureUrl, other.pictureUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetThumbnailUrl(), other.isSetThumbnailUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThumbnailUrl()) {
      lastComparison = TBaseHelper.compareTo(this.thumbnailUrl, other.thumbnailUrl);
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
        case 1: // INDEX
          if (field.type == TType.I32) {
            this.index = iprot.readI32();
            setIndexIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // FORCE_UPDATE
          if (field.type == TType.BOOL) {
            this.forceUpdate = iprot.readBool();
            setForceUpdateIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // TITLE
          if (field.type == TType.STRING) {
            this.title = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // TEXT
          if (field.type == TType.STRING) {
            this.text = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 13: // CREATED_TIME
          if (field.type == TType.I64) {
            this.createdTime = iprot.readI64();
            setCreatedTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 14: // PICTURE_URL
          if (field.type == TType.STRING) {
            this.pictureUrl = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 15: // THUMBNAIL_URL
          if (field.type == TType.STRING) {
            this.thumbnailUrl = iprot.readString();
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
    oprot.writeFieldBegin(INDEX_FIELD_DESC);
    oprot.writeI32(this.index);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(FORCE_UPDATE_FIELD_DESC);
    oprot.writeBool(this.forceUpdate);
    oprot.writeFieldEnd();
    if (this.title != null) {
      oprot.writeFieldBegin(TITLE_FIELD_DESC);
      oprot.writeString(this.title);
      oprot.writeFieldEnd();
    }
    if (this.text != null) {
      oprot.writeFieldBegin(TEXT_FIELD_DESC);
      oprot.writeString(this.text);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
    oprot.writeI64(this.createdTime);
    oprot.writeFieldEnd();
    if (this.pictureUrl != null) {
      oprot.writeFieldBegin(PICTURE_URL_FIELD_DESC);
      oprot.writeString(this.pictureUrl);
      oprot.writeFieldEnd();
    }
    if (this.thumbnailUrl != null) {
      oprot.writeFieldBegin(THUMBNAIL_URL_FIELD_DESC);
      oprot.writeString(this.thumbnailUrl);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("Announcement(");
    boolean first = true;

    sb.append("index:");
    sb.append(this.index);
    first = false;
    if (!first) sb.append(", ");
    sb.append("forceUpdate:");
    sb.append(this.forceUpdate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
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
    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pictureUrl:");
    if (this.pictureUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.pictureUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("thumbnailUrl:");
    if (this.thumbnailUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.thumbnailUrl);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
