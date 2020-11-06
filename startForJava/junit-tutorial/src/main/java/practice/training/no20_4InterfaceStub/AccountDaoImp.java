package practice.training.no20_4InterfaceStub;

public class AccountDaoImp implements AccountDao {

  public Account account;

  public AccountDaoImp() {
    account = new Account();
//  本来ならdb接続
    account.setName("ueno");
    account.setName("norio");
  }

  @Override
  public Account findOrNull(String userId) {

    if (account.getName().equals(userId))
      return account;

    return null;
  }

  @Override
  public Account getAccount() {

    return account;
  }

}
