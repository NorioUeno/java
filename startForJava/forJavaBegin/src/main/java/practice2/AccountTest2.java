package practice2;

public class AccountTest2 {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    testInstantiate();
    //testTransfer();
  }

  private static void testInstantiate() {
    System.out.println("無事new出来るかのテスト");
    Account a = new Account("norio", 30000);
    if(!"norio".equals(a.owner)) {
      System.out.println("error:owner");
    }
    if(30000 != a.balance) {
      System.out.println("error:balance");
    }
    System.out.println("テスト終了");
  }

}
