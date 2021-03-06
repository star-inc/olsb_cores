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
public partial class ChannelInfo : TBase
{
  private string _channelId;
  private string _name;
  private string _entryPageUrl;
  private string _descriptionText;
  private ChannelProvider _provider;
  private PublicType _publicType;
  private string _iconImage;
  private List<string> _permissions;
  private string _iconThumbnailImage;
  private List<ChannelConfiguration> _channelConfigurations;

  public string ChannelId
  {
    get
    {
      return _channelId;
    }
    set
    {
      __isset.channelId = true;
      this._channelId = value;
    }
  }

  public string Name
  {
    get
    {
      return _name;
    }
    set
    {
      __isset.name = true;
      this._name = value;
    }
  }

  public string EntryPageUrl
  {
    get
    {
      return _entryPageUrl;
    }
    set
    {
      __isset.entryPageUrl = true;
      this._entryPageUrl = value;
    }
  }

  public string DescriptionText
  {
    get
    {
      return _descriptionText;
    }
    set
    {
      __isset.descriptionText = true;
      this._descriptionText = value;
    }
  }

  public ChannelProvider Provider
  {
    get
    {
      return _provider;
    }
    set
    {
      __isset.provider = true;
      this._provider = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="PublicType"/>
  /// </summary>
  public PublicType PublicType
  {
    get
    {
      return _publicType;
    }
    set
    {
      __isset.publicType = true;
      this._publicType = value;
    }
  }

  public string IconImage
  {
    get
    {
      return _iconImage;
    }
    set
    {
      __isset.iconImage = true;
      this._iconImage = value;
    }
  }

  public List<string> Permissions
  {
    get
    {
      return _permissions;
    }
    set
    {
      __isset.permissions = true;
      this._permissions = value;
    }
  }

  public string IconThumbnailImage
  {
    get
    {
      return _iconThumbnailImage;
    }
    set
    {
      __isset.iconThumbnailImage = true;
      this._iconThumbnailImage = value;
    }
  }

  public List<ChannelConfiguration> ChannelConfigurations
  {
    get
    {
      return _channelConfigurations;
    }
    set
    {
      __isset.channelConfigurations = true;
      this._channelConfigurations = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool channelId;
    public bool name;
    public bool entryPageUrl;
    public bool descriptionText;
    public bool provider;
    public bool publicType;
    public bool iconImage;
    public bool permissions;
    public bool iconThumbnailImage;
    public bool channelConfigurations;
  }

  public ChannelInfo() {
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
              ChannelId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Name = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              EntryPageUrl = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              DescriptionText = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Struct) {
              Provider = new ChannelProvider();
              Provider.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I32) {
              PublicType = (PublicType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              IconImage = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.List) {
              {
                Permissions = new List<string>();
                TList _list0 = iprot.ReadListBegin();
                for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  string _elem2;
                  _elem2 = iprot.ReadString();
                  Permissions.Add(_elem2);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.String) {
              IconThumbnailImage = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.List) {
              {
                ChannelConfigurations = new List<ChannelConfiguration>();
                TList _list3 = iprot.ReadListBegin();
                for( int _i4 = 0; _i4 < _list3.Count; ++_i4)
                {
                  ChannelConfiguration _elem5;
                  _elem5 = (ChannelConfiguration)iprot.ReadI32();
                  ChannelConfigurations.Add(_elem5);
                }
                iprot.ReadListEnd();
              }
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
      TStruct struc = new TStruct("ChannelInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ChannelId != null && __isset.channelId) {
        field.Name = "channelId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ChannelId);
        oprot.WriteFieldEnd();
      }
      if (Name != null && __isset.name) {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Name);
        oprot.WriteFieldEnd();
      }
      if (EntryPageUrl != null && __isset.entryPageUrl) {
        field.Name = "entryPageUrl";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(EntryPageUrl);
        oprot.WriteFieldEnd();
      }
      if (DescriptionText != null && __isset.descriptionText) {
        field.Name = "descriptionText";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(DescriptionText);
        oprot.WriteFieldEnd();
      }
      if (Provider != null && __isset.provider) {
        field.Name = "provider";
        field.Type = TType.Struct;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        Provider.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.publicType) {
        field.Name = "publicType";
        field.Type = TType.I32;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)PublicType);
        oprot.WriteFieldEnd();
      }
      if (IconImage != null && __isset.iconImage) {
        field.Name = "iconImage";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(IconImage);
        oprot.WriteFieldEnd();
      }
      if (Permissions != null && __isset.permissions) {
        field.Name = "permissions";
        field.Type = TType.List;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.String, Permissions.Count));
          foreach (string _iter6 in Permissions)
          {
            oprot.WriteString(_iter6);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (IconThumbnailImage != null && __isset.iconThumbnailImage) {
        field.Name = "iconThumbnailImage";
        field.Type = TType.String;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(IconThumbnailImage);
        oprot.WriteFieldEnd();
      }
      if (ChannelConfigurations != null && __isset.channelConfigurations) {
        field.Name = "channelConfigurations";
        field.Type = TType.List;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.I32, ChannelConfigurations.Count));
          foreach (ChannelConfiguration _iter7 in ChannelConfigurations)
          {
            oprot.WriteI32((int)_iter7);
          }
          oprot.WriteListEnd();
        }
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
    StringBuilder __sb = new StringBuilder("ChannelInfo(");
    bool __first = true;
    if (ChannelId != null && __isset.channelId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ChannelId: ");
      __sb.Append(ChannelId);
    }
    if (Name != null && __isset.name) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Name: ");
      __sb.Append(Name);
    }
    if (EntryPageUrl != null && __isset.entryPageUrl) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("EntryPageUrl: ");
      __sb.Append(EntryPageUrl);
    }
    if (DescriptionText != null && __isset.descriptionText) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("DescriptionText: ");
      __sb.Append(DescriptionText);
    }
    if (Provider != null && __isset.provider) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Provider: ");
      __sb.Append(Provider== null ? "<null>" : Provider.ToString());
    }
    if (__isset.publicType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PublicType: ");
      __sb.Append(PublicType);
    }
    if (IconImage != null && __isset.iconImage) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("IconImage: ");
      __sb.Append(IconImage);
    }
    if (Permissions != null && __isset.permissions) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Permissions: ");
      __sb.Append(Permissions);
    }
    if (IconThumbnailImage != null && __isset.iconThumbnailImage) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("IconThumbnailImage: ");
      __sb.Append(IconThumbnailImage);
    }
    if (ChannelConfigurations != null && __isset.channelConfigurations) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ChannelConfigurations: ");
      __sb.Append(ChannelConfigurations);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

