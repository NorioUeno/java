package practice.training.no20_4InterfaceStub;

public class AccountDaoImp implements AccountDao {

  public Account account;

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
