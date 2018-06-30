/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class Ticket : TBase
{
  private string _id;
  private long _expirationTime;
  private int _maxUseCount;

  public string Id
  {
    get
    {
      return _id;
    }
    set
    {
      __isset.id = true;
      this._id = value;
    }
  }

  public long ExpirationTime
  {
    get
    {
      return _expirationTime;
    }
    set
    {
      __isset.expirationTime = true;
      this._expirationTime = value;
    }
  }

  public int MaxUseCount
  {
    get
    {
      return _maxUseCount;
    }
    set
    {
      __isset.maxUseCount = true;
      this._maxUseCount = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool id;
    public bool expirationTime;
    public bool maxUseCount;
  }

  public Ticket() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.String) {
              Id = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.I64) {
              ExpirationTime = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 21:
            if (field.Type == TType.I32) {
              MaxUseCount = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("Ticket");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Id != null && __isset.id) {
        field.Name = "id";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Id);
        oprot.WriteFieldEnd();
      }
      if (__isset.expirationTime) {
        field.Name = "expirationTime";
        field.Type = TType.I64;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ExpirationTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.maxUseCount) {
        field.Name = "maxUseCount";
        field.Type = TType.I32;
        field.ID = 21;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(MaxUseCount);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("Ticket(");
    bool __first = true;
    if (Id != null && __isset.id) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Id: ");
      __sb.Append(Id);
    }
    if (__isset.expirationTime) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ExpirationTime: ");
      __sb.Append(ExpirationTime);
    }
    if (__isset.maxUseCount) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MaxUseCount: ");
      __sb.Append(MaxUseCount);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
