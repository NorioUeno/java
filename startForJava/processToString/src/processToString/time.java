package processToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class time {
  /**
   * time取得
   */
  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    LocalDateTime jst = LocalDateTime.now();
    Date now = new Date();
    long time = now.getTime();
    Timestamp ts = new Timestamp(time);
    System.out.println(jst);
    System.out.println(time);
    System.out.println(ts);
    System.out.println();

  }

}
