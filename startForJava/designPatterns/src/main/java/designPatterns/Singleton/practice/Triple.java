package designPatterns.Singleton.practice;

public class Triple {

  private static int limmitCount = 0;
  private int instanceNum;
  private static Triple[] triple = new Triple[] { new Triple(1), new Triple(2), new Triple(3), };

  private Triple(int insutanceNum) {
    // TODO 自動生成されたコンストラクター・スタブ
    System.out.println("The instance num " + insutanceNum + "is created");
    this.instanceNum = insutanceNum;
  }

  public static Triple createInstance() {
    if (limmitCount <= 3) {
      limmitCount++;
      return new Triple(limmitCount);
    } else {
      System.out.println("上限を超えています");
      return null;
    }
  }

  public static Triple getInstance(int insutanceNum) {
    return triple[insutanceNum];
  }

  @Override
  public String toString() {
    return "[Triple num =" + instanceNum + "]";

  }

}
