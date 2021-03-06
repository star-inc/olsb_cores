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

public class ProductSimpleList implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ProductSimpleList");

  private static final TField HAS_NEXT_FIELD_DESC = new TField("hasNext", TType.BOOL, (short)1);
  private static final TField REINVOKE_HOUR_FIELD_DESC = new TField("reinvokeHour", TType.I32, (short)2);
  private static final TField LAST_VERSION_SEQ_FIELD_DESC = new TField("lastVersionSeq", TType.I64, (short)3);
  private static final TField PRODUCT_LIST_FIELD_DESC = new TField("productList", TType.LIST, (short)4);
  private static final TField RECENT_NEW_RELEASE_DATE_FIELD_DESC = new TField("recentNewReleaseDate", TType.I64, (short)5);
  private static final TField RECENT_EVENT_RELEASE_DATE_FIELD_DESC = new TField("recentEventReleaseDate", TType.I64, (short)6);

  private boolean hasNext;
  private int reinvokeHour;
  private long lastVersionSeq;
  private Vector productList;
  private long recentNewReleaseDate;
  private long recentEventReleaseDate;

  // isset id assignments
  private static final int __HASNEXT_ISSET_ID = 0;
  private static final int __REINVOKEHOUR_ISSET_ID = 1;
  private static final int __LASTVERSIONSEQ_ISSET_ID = 2;
  private static final int __RECENTNEWRELEASEDATE_ISSET_ID = 3;
  private static final int __RECENTEVENTRELEASEDATE_ISSET_ID = 4;
  private boolean[] __isset_vector = new boolean[5];

  public ProductSimpleList() {
  }

  public ProductSimpleList(
    boolean hasNext,
    int reinvokeHour,
    long lastVersionSeq,
    Vector productList,
    long recentNewReleaseDate,
    long recentEventReleaseDate)
  {
    this();
    this.hasNext = hasNext;
    setHasNextIsSet(true);
    this.reinvokeHour = reinvokeHour;
    setReinvokeHourIsSet(true);
    this.lastVersionSeq = lastVersionSeq;
    setLastVersionSeqIsSet(true);
    this.productList = productList;
    this.recentNewReleaseDate = recentNewReleaseDate;
    setRecentNewReleaseDateIsSet(true);
    this.recentEventReleaseDate = recentEventReleaseDate;
    setRecentEventReleaseDateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProductSimpleList(ProductSimpleList other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.hasNext = other.hasNext;
    this.reinvokeHour = other.reinvokeHour;
    this.lastVersionSeq = other.lastVersionSeq;
    if (other.isSetProductList()) {
      Vector __this__productList = new Vector();
      for (Enumeration other_enum = other.productList.elements(); other_enum.hasMoreElements(); ) {
        ProductSimple other_element = (ProductSimple)other_enum.nextElement();
        __this__productList.addElement(new ProductSimple(other_element));
      }
      this.productList = __this__productList;
    }
    this.recentNewReleaseDate = other.recentNewReleaseDate;
    this.recentEventReleaseDate = other.recentEventReleaseDate;
  }

  public ProductSimpleList deepCopy() {
    return new ProductSimpleList(this);
  }

  public void clear() {
    setHasNextIsSet(false);
    this.hasNext = false;
    setReinvokeHourIsSet(false);
    this.reinvokeHour = 0;
    setLastVersionSeqIsSet(false);
    this.lastVersionSeq = 0;
    this.productList = null;
    setRecentNewReleaseDateIsSet(false);
    this.recentNewReleaseDate = 0;
    setRecentEventReleaseDateIsSet(false);
    this.recentEventReleaseDate = 0;
  }

  public boolean isHasNext() {
    return this.hasNext;
  }

  public void setHasNext(boolean hasNext) {
    this.hasNext = hasNext;
    setHasNextIsSet(true);
  }

  public void unsetHasNext() {
    __isset_vector[__HASNEXT_ISSET_ID] = false;
  }

  /** Returns true if field hasNext is set (has been assigned a value) and false otherwise */
  public boolean isSetHasNext() {
    return __isset_vector[__HASNEXT_ISSET_ID];
  }

  public void setHasNextIsSet(boolean value) {
    __isset_vector[__HASNEXT_ISSET_ID] = value;
  }

  public int getReinvokeHour() {
    return this.reinvokeHour;
  }

  public void setReinvokeHour(int reinvokeHour) {
    this.reinvokeHour = reinvokeHour;
    setReinvokeHourIsSet(true);
  }

  public void unsetReinvokeHour() {
    __isset_vector[__REINVOKEHOUR_ISSET_ID] = false;
  }

  /** Returns true if field reinvokeHour is set (has been assigned a value) and false otherwise */
  public boolean isSetReinvokeHour() {
    return __isset_vector[__REINVOKEHOUR_ISSET_ID];
  }

  public void setReinvokeHourIsSet(boolean value) {
    __isset_vector[__REINVOKEHOUR_ISSET_ID] = value;
  }

  public long getLastVersionSeq() {
    return this.lastVersionSeq;
  }

  public void setLastVersionSeq(long lastVersionSeq) {
    this.lastVersionSeq = lastVersionSeq;
    setLastVersionSeqIsSet(true);
  }

  public void unsetLastVersionSeq() {
    __isset_vector[__LASTVERSIONSEQ_ISSET_ID] = false;
  }

  /** Returns true if field lastVersionSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetLastVersionSeq() {
    return __isset_vector[__LASTVERSIONSEQ_ISSET_ID];
  }

  public void setLastVersionSeqIsSet(boolean value) {
    __isset_vector[__LASTVERSIONSEQ_ISSET_ID] = value;
  }

  public int getProductListSize() {
    return (this.productList == null) ? 0 : this.productList.size();
  }

  public Enumeration getProductListEnumeration() {
    return (this.productList == null) ? null : this.productList.elements();
  }

  public void addToProductList(ProductSimple elem) {
    if (this.productList == null) {
      this.productList = new Vector();
    }
    this.productList.addElement(elem);
  }

  public Vector getProductList() {
    return this.productList;
  }

  public void setProductList(Vector productList) {
    this.productList = productList;
  }

  public void unsetProductList() {
    this.productList = null;
  }

  /** Returns true if field productList is set (has been assigned a value) and false otherwise */
  public boolean isSetProductList() {
    return this.productList != null;
  }

  public void setProductListIsSet(boolean value) {
    if (!value) {
      this.productList = null;
    }
  }

  public long getRecentNewReleaseDate() {
    return this.recentNewReleaseDate;
  }

  public void setRecentNewReleaseDate(long recentNewReleaseDate) {
    this.recentNewReleaseDate = recentNewReleaseDate;
    setRecentNewReleaseDateIsSet(true);
  }

  public void unsetRecentNewReleaseDate() {
    __isset_vector[__RECENTNEWRELEASEDATE_ISSET_ID] = false;
  }

  /** Returns true if field recentNewReleaseDate is set (has been assigned a value) and false otherwise */
  public boolean isSetRecentNewReleaseDate() {
    return __isset_vector[__RECENTNEWRELEASEDATE_ISSET_ID];
  }

  public void setRecentNewReleaseDateIsSet(boolean value) {
    __isset_vector[__RECENTNEWRELEASEDATE_ISSET_ID] = value;
  }

  public long getRecentEventReleaseDate() {
    return this.recentEventReleaseDate;
  }

  public void setRecentEventReleaseDate(long recentEventReleaseDate) {
    this.recentEventReleaseDate = recentEventReleaseDate;
    setRecentEventReleaseDateIsSet(true);
  }

  public void unsetRecentEventReleaseDate() {
    __isset_vector[__RECENTEVENTRELEASEDATE_ISSET_ID] = false;
  }

  /** Returns true if field recentEventReleaseDate is set (has been assigned a value) and false otherwise */
  public boolean isSetRecentEventReleaseDate() {
    return __isset_vector[__RECENTEVENTRELEASEDATE_ISSET_ID];
  }

  public void setRecentEventReleaseDateIsSet(boolean value) {
    __isset_vector[__RECENTEVENTRELEASEDATE_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProductSimpleList)
      return this.equals((ProductSimpleList)that);
    return false;
  }

  public boolean equals(ProductSimpleList that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hasNext = true;
    boolean that_present_hasNext = true;
    if (this_present_hasNext || that_present_hasNext) {
      if (!(this_present_hasNext && that_present_hasNext))
        return false;
      if (this.hasNext != that.hasNext)
        return false;
    }

    boolean this_present_reinvokeHour = true;
    boolean that_present_reinvokeHour = true;
    if (this_present_reinvokeHour || that_present_reinvokeHour) {
      if (!(this_present_reinvokeHour && that_present_reinvokeHour))
        return false;
      if (this.reinvokeHour != that.reinvokeHour)
        return false;
    }

    boolean this_present_lastVersionSeq = true;
    boolean that_present_lastVersionSeq = true;
    if (this_present_lastVersionSeq || that_present_lastVersionSeq) {
      if (!(this_present_lastVersionSeq && that_present_lastVersionSeq))
        return false;
      if (this.lastVersionSeq != that.lastVersionSeq)
        return false;
    }

    boolean this_present_productList = true && this.isSetProductList();
    boolean that_present_productList = true && that.isSetProductList();
    if (this_present_productList || that_present_productList) {
      if (!(this_present_productList && that_present_productList))
        return false;
      if (!this.productList.equals(that.productList))
        return false;
    }

    boolean this_present_recentNewReleaseDate = true;
    boolean that_present_recentNewReleaseDate = true;
    if (this_present_recentNewReleaseDate || that_present_recentNewReleaseDate) {
      if (!(this_present_recentNewReleaseDate && that_present_recentNewReleaseDate))
        return false;
      if (this.recentNewReleaseDate != that.recentNewReleaseDate)
        return false;
    }

    boolean this_present_recentEventReleaseDate = true;
    boolean that_present_recentEventReleaseDate = true;
    if (this_present_recentEventReleaseDate || that_present_recentEventReleaseDate) {
      if (!(this_present_recentEventReleaseDate && that_present_recentEventReleaseDate))
        return false;
      if (this.recentEventReleaseDate != that.recentEventReleaseDate)
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

    ProductSimpleList other = (ProductSimpleList)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetHasNext(), other.isSetHasNext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasNext()) {
      lastComparison = TBaseHelper.compareTo(this.hasNext, other.hasNext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetReinvokeHour(), other.isSetReinvokeHour());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReinvokeHour()) {
      lastComparison = TBaseHelper.compareTo(this.reinvokeHour, other.reinvokeHour);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetLastVersionSeq(), other.isSetLastVersionSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastVersionSeq()) {
      lastComparison = TBaseHelper.compareTo(this.lastVersionSeq, other.lastVersionSeq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetProductList(), other.isSetProductList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductList()) {
      lastComparison = TBaseHelper.compareTo(this.productList, other.productList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRecentNewReleaseDate(), other.isSetRecentNewReleaseDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecentNewReleaseDate()) {
      lastComparison = TBaseHelper.compareTo(this.recentNewReleaseDate, other.recentNewReleaseDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRecentEventReleaseDate(), other.isSetRecentEventReleaseDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecentEventReleaseDate()) {
      lastComparison = TBaseHelper.compareTo(this.recentEventReleaseDate, other.recentEventReleaseDate);
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
        case 1: // HAS_NEXT
          if (field.type == TType.BOOL) {
            this.hasNext = iprot.readBool();
            setHasNextIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // REINVOKE_HOUR
          if (field.type == TType.I32) {
            this.reinvokeHour = iprot.readI32();
            setReinvokeHourIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // LAST_VERSION_SEQ
          if (field.type == TType.I64) {
            this.lastVersionSeq = iprot.readI64();
            setLastVersionSeqIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PRODUCT_LIST
          if (field.type == TType.LIST) {
            {
              TList _list128 = iprot.readListBegin();
              this.productList = new Vector(_list128.size);
              for (int _i129 = 0; _i129 < _list128.size; ++_i129)
              {
                ProductSimple _elem130;
                _elem130 = new ProductSimple();
                _elem130.read(iprot);
                this.productList.addElement(_elem130);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // RECENT_NEW_RELEASE_DATE
          if (field.type == TType.I64) {
            this.recentNewReleaseDate = iprot.readI64();
            setRecentNewReleaseDateIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // RECENT_EVENT_RELEASE_DATE
          if (field.type == TType.I64) {
            this.recentEventReleaseDate = iprot.readI64();
            setRecentEventReleaseDateIsSet(true);
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
    oprot.writeFieldBegin(HAS_NEXT_FIELD_DESC);
    oprot.writeBool(this.hasNext);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(REINVOKE_HOUR_FIELD_DESC);
    oprot.writeI32(this.reinvokeHour);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(LAST_VERSION_SEQ_FIELD_DESC);
    oprot.writeI64(this.lastVersionSeq);
    oprot.writeFieldEnd();
    if (this.productList != null) {
      oprot.writeFieldBegin(PRODUCT_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.productList.size()));
        for (Enumeration _iter131_enum = this.productList.elements(); _iter131_enum.hasMoreElements(); )         {
          ProductSimple _iter131 = (ProductSimple)_iter131_enum.nextElement();
          _iter131.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(RECENT_NEW_RELEASE_DATE_FIELD_DESC);
    oprot.writeI64(this.recentNewReleaseDate);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(RECENT_EVENT_RELEASE_DATE_FIELD_DESC);
    oprot.writeI64(this.recentEventReleaseDate);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ProductSimpleList(");
    boolean first = true;

    sb.append("hasNext:");
    sb.append(this.hasNext);
    first = false;
    if (!first) sb.append(", ");
    sb.append("reinvokeHour:");
    sb.append(this.reinvokeHour);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastVersionSeq:");
    sb.append(this.lastVersionSeq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("productList:");
    if (this.productList == null) {
      sb.append("null");
    } else {
      sb.append(this.productList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recentNewReleaseDate:");
    sb.append(this.recentNewReleaseDate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("recentEventReleaseDate:");
    sb.append(this.recentEventReleaseDate);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

