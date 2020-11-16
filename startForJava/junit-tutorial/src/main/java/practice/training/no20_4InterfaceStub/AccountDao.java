package practice.training.no20_4InterfaceStub;

public interface AccountDao {

  /**
   * userIdを指定し、アカウント情報を取得する
   * @param userId
   * @return 指定されたユーザIDのアカウント情報、存在しない場合はnull
   */
  Account findOrNull(String userId);

  /**
   * @return
   */
  Account getAccount();

}
