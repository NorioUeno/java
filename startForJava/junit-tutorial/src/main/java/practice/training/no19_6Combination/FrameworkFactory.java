package practice.training.no19_6Combination;

public class FrameworkFactory {

  private static int num = 0;

  public static Framework create(String db, String app, String value) {

    return new Framework(++num, db, app, value);
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

}
