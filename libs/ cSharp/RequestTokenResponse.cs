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
public partial class RequestTokenResponse : TBase
{
  private string _requestToken;
  private string _returnUrl;

  public string RequestToken
  {
    get
    {
      return _requestToken;
    }
    set
    {
      __isset.requestToken = true;
      this._requestToken = value;
    }
  }

  public string ReturnUrl
  {
    get
    {
      return _returnUrl;
    }
    set
    {
      __isset.returnUrl = true;
      this._returnUrl = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool requestToken;
    public bool returnUrl;
  }

  public RequestTokenResponse() {
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
              RequestToken = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              ReturnUrl = iprot.ReadString();
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
      TStruct struc = new TStruct("RequestTokenResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (RequestToken != null && __isset.requestToken) {
        field.Name = "requestToken";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(RequestToken);
        oprot.WriteFieldEnd();
      }
      if (ReturnUrl != null && __isset.returnUrl) {
        field.Name = "returnUrl";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ReturnUrl);
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
    StringBuilder __sb = new StringBuilder("RequestTokenResponse(");
    bool __first = true;
    if (RequestToken != null && __isset.requestToken) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RequestToken: ");
      __sb.Append(RequestToken);
    }
    if (ReturnUrl != null && __isset.returnUrl) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ReturnUrl: ");
      __sb.Append(ReturnUrl);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

