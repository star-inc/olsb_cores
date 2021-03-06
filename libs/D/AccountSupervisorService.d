/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
module AccountSupervisorService;

import thrift.base;
import thrift.codegen.base;
import thrift.util.hashset;

import line_types;

interface AccountSupervisorService {
  RSAKey getRSAKey();
  void notifyEmailConfirmationResult(string[string] parameterMap);
  string registerVirtualAccount(string locale, string encryptedVirtualUserId, string encryptedPassword);
  void requestVirtualAccountPasswordChange(string virtualMid, string encryptedVirtualUserId, string encryptedOldPassword, string encryptedNewPassword);
  void requestVirtualAccountPasswordSet(string virtualMid, string encryptedVirtualUserId, string encryptedNewPassword);
  void unregisterVirtualAccount(string virtualMid);

  alias line_types.TalkException TalkException;

  enum methodMeta = [
    TMethodMeta(`getRSAKey`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`notifyEmailConfirmationResult`, 
      [TParamMeta(`parameterMap`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`registerVirtualAccount`, 
      [TParamMeta(`locale`, 2), TParamMeta(`encryptedVirtualUserId`, 3), TParamMeta(`encryptedPassword`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`requestVirtualAccountPasswordChange`, 
      [TParamMeta(`virtualMid`, 2), TParamMeta(`encryptedVirtualUserId`, 3), TParamMeta(`encryptedOldPassword`, 4), TParamMeta(`encryptedNewPassword`, 5)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`requestVirtualAccountPasswordSet`, 
      [TParamMeta(`virtualMid`, 2), TParamMeta(`encryptedVirtualUserId`, 3), TParamMeta(`encryptedNewPassword`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`unregisterVirtualAccount`, 
      [TParamMeta(`virtualMid`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    )
  ];
}
