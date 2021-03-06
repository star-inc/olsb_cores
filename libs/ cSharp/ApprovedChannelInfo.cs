/**
 * Autogenerated by Thrift Compiler (0.14.0)
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
public partial class ApprovedChannelInfo : TBase
{
  private ChannelInfo _channelInfo;
  private long _approvedAt;

  public ChannelInfo ChannelInfo
  {
    get
    {
      return _channelInfo;
    }
    set
    {
      __isset.channelInfo = true;
      this._channelInfo = value;
    }
  }

  public long ApprovedAt
  {
    get
    {
      return _approvedAt;
    }
    set
    {
      __isset.approvedAt = true;
      this._approvedAt = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool channelInfo;
    public bool approvedAt;
  }

  public ApprovedChannelInfo() {
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
            if (field.Type == TType.Struct) {
              ChannelInfo = new ChannelInfo();
              ChannelInfo.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              ApprovedAt = iprot.ReadI64();
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
      TStruct struc = new TStruct("ApprovedChannelInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ChannelInfo != null && __isset.channelInfo) {
        field.Name = "channelInfo";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        ChannelInfo.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.approvedAt) {
        field.Name = "approvedAt";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ApprovedAt);
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
    StringBuilder __sb = new StringBuilder("ApprovedChannelInfo(");
    bool __first = true;
    if (ChannelInfo != null && __isset.channelInfo) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ChannelInfo: ");
      __sb.Append(ChannelInfo== null ? "<null>" : ChannelInfo.ToString());
    }
    if (__isset.approvedAt) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ApprovedAt: ");
      __sb.Append(ApprovedAt);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

