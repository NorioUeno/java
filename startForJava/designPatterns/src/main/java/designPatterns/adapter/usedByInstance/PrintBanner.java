package designPatterns.adapter.usedByInstance;

public class PrintBanner extends Print {

  private Banner bn;

  public PrintBanner(String string) {
    this.bn = new Banner(string);
  }

  @Override
  public void printWeak() {
    // TODO 自動生成されたメソッド・スタブ
    bn.showWithParen();
  }

  @Override
  public void printStrong() {
    // TODO 自動生成されたメソッド・スタブ
    bn.showWithAster();;
  }

}
