package designPatterns.Singleton.practice;

public class TicketMaker {

  private static TicketMaker tm = new TicketMaker();
  private static int ticket = 1000;
  private TicketMaker() {
    System.out.println("インスタンス生成: ticketmaker");
    // TODO 自動生成されたコンストラクター・スタブ
  }
  public synchronized int getNextTicketNumber() {
    return ticket++;
  }
  public static TicketMaker getInstance () {
    return tm;

  }


}
