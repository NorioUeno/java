package designPatterns.ChainOfResponsiblility;

public class LimitSupport extends Support {

  private int limit;

  public LimitSupport(String name, int limit) {
    super(name);
    this.limit = limit;
    // TODO 自動生成されたコンストラクター・スタブ
  }

  @Override
  protected boolean resolve(Trouble trouble) {

    if (trouble.getNumber() < limit) {
      return true;
    } else {
      return false;
    }
  }

}
