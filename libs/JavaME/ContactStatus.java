/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class ContactStatus implements org.apache.thrift.TEnum {

  public static final ContactStatus UNSPECIFIED = new ContactStatus(0);
  public static final ContactStatus FRIEND = new ContactStatus(1);
  public static final ContactStatus FRIEND_BLOCKED = new ContactStatus(2);
  public static final ContactStatus RECOMMEND = new ContactStatus(3);
  public static final ContactStatus RECOMMEND_BLOCKED = new ContactStatus(4);
  public static final ContactStatus DELETED = new ContactStatus(5);
  public static final ContactStatus DELETED_BLOCKED = new ContactStatus(6);

  private final int value;

  private ContactStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ContactStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return UNSPECIFIED;
      case 1:
        return FRIEND;
      case 2:
        return FRIEND_BLOCKED;
      case 3:
        return RECOMMEND;
      case 4:
        return RECOMMEND_BLOCKED;
      case 5:
        return DELETED;
      case 6:
        return DELETED_BLOCKED;
      default:
        return null;
    }
  }
}
