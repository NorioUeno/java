package practice.training.no19_6Combination;

public class Framework {

  private int num;
  private String db;
  private String app;
  private String value;

  public Framework(int num, String app, String db, String value) {
    this.num = num;
    this.db = db;
    this.app = app;
    this.value = value;
//    System.out.println("create Framework! num:" + num + " app:" + app + " db:" + db +" value:" + value);

  }

  public String getDb() {
    return db;
  }

  public void setDb(String db) {
    this.db = db;
  }

  public String getApp() {
    return app;
  }

  public void setApp(String app) {
    this.app = app;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

}
