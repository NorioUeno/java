package practice;

public class Practice14VariousAPI {

  private String accountNumber;
  private int balance;

  public void acccountInfo() {

    System.out.println("口座番号:" + this.accountNumber + " 残高：" + this.balance);

  }

  @Override
  public String toString() {
    return ("口座番号:" + this.accountNumber + " 残高：" + this.balance);
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }
    if (obj instanceof Practice14VariousAPI) {
      Practice14VariousAPI account = (Practice14VariousAPI) obj;
      if(this.accountNumber.trim().equals(account.accountNumber.trim()) && this.balance == account.balance) {
        return true;
      }
      return false;
    }
    return false;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

}
