package practice.training.no20_4InterfaceStub;

public class Authentication {

  AccountDao accountDao = new AccountDaoImp();
  Account account = accountDao.getAccount();

  public Account authenticate(String userId, String passward) {

    if(accountDao.findOrNull(userId).equals(null)) {
      return null;
    }
    if (account.getPassword().equals(passward)) {
      return account;
    }

    return null;
  }

}
