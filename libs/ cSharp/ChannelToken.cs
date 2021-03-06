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
public partial class ChannelToken : TBase
{
  private string _token;
  private string _obsToken;
  private long _expiration;
  private string _refreshToken;
  private string _channelAccessToken;

  public string Token
  {
    get
    {
      return _token;
    }
    set
    {
      __isset.token = true;
      this._token = value;
    }
  }

  public string ObsToken
  {
    get
    {
      return _obsToken;
    }
    set
    {
      __isset.obsToken = true;
      this._obsToken = value;
    }
  }

  public long Expiration
  {
    get
    {
      return _expiration;
    }
    set
    {
      __isset.expiration = true;
      this._expiration = value;
    }
  }

  public string RefreshToken
  {
    get
    {
      return _refreshToken;
    }
    set
    {
      __isset.refreshToken = true;
      this._refreshToken = value;
    }
  }

  public string ChannelAccessToken
  {
    get
    {
      return _channelAccessToken;
    }
    set
    {
      __isset.channelAccessToken = true;
      this._channelAccessToken = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool token;
    public bool obsToken;
    public bool expiration;
    public bool refreshToken;
    public bool channelAccessToken;
  }

  public ChannelToken() {
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
              Token = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              ObsToken = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I64) {
              Expiration = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              RefreshToken = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              ChannelAccessToken = iprot.ReadString();
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
      TStruct struc = new TStruct("ChannelToken");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Token != null && __isset.token) {
        field.Name = "token";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Token);
        oprot.WriteFieldEnd();
      }
      if (ObsToken != null && __isset.obsToken) {
        field.Name = "obsToken";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ObsToken);
        oprot.WriteFieldEnd();
      }
      if (__isset.expiration) {
        field.Name = "expiration";
        field.Type = TType.I64;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Expiration);
        oprot.WriteFieldEnd();
      }
      if (RefreshToken != null && __isset.refreshToken) {
        field.Name = "refreshToken";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(RefreshToken);
        oprot.WriteFieldEnd();
      }
      if (ChannelAccessToken != null && __isset.channelAccessToken) {
        field.Name = "channelAccessToken";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ChannelAccessToken);
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
    StringBuilder __sb = new StringBuilder("ChannelToken(");
    bool __first = true;
    if (Token != null && __isset.token) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Token: ");
      __sb.Append(Token);
    }
    if (ObsToken != null && __isset.obsToken) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ObsToken: ");
      __sb.Append(ObsToken);
    }
    if (__isset.expiration) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Expiration: ");
      __sb.Append(Expiration);
    }
    if (RefreshToken != null && __isset.refreshToken) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RefreshToken: ");
      __sb.Append(RefreshToken);
    }
    if (ChannelAccessToken != null && __isset.channelAccessToken) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ChannelAccessToken: ");
      __sb.Append(ChannelAccessToken);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

