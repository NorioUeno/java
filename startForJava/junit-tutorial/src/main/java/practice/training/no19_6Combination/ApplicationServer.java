package practice.training.no19_6Combination;

public enum ApplicationServer {
  GlassFish(111),
  Tomcat(2),
  JBoss(3)
  ;


  private int serverNum;

  ApplicationServer (int serverNum) {
    this.serverNum = serverNum;
  }

  public int getServerNum() {
    {
      return serverNum;
    }

  }


}
