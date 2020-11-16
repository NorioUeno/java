package processToString;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class time {
  /**
   * time取得
   */
  public void timePrint() {

    // getdate()
    LocalDateTime jst = LocalDateTime.now();
    Date now = new Date();
    long time = now.getTime();
    Timestamp ts = new Timestamp(time);

    // 時刻データ表示
    System.out.println(jst); // 2020-07-09T09:43:48.801
    System.out.println(now); // 英語風 : Thu Jul 09 09:38:00 JST 2020
    System.out.println(time); // long型 1594255328850
    System.out.println(ts); // log系 : 2020-07-09 09:38:00.721

    // 整形処理
    // 取得した日時情報をcalendarにセット
    Calendar c = Calendar.getInstance();
    c.setTime(now);

    // Calendarから日の情報を取得
    int day = c.get(Calendar.DAY_OF_MONTH);
    System.out.println(day);
    // 取得した値に100を足してカレンダの日にセット
    day += 10;
    c.set(Calendar.DAY_OF_MONTH, day);
    // calendarの日付情報をdate型に変換
    Date future = c.getTime();

    // 指定された形式で表示
    SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd");
    System.out.println(f.format(future));

    // 日を表示
    System.out.println(day);
  }

  public static Timestamp getDate() {
    Date now = new Date();
    long time = now.getTime();
    Timestamp ts = new Timestamp(time);
    return (ts);
  }

  public static int getRemainingDaysfromThisMonth() {

//  getDate
    LocalDateTime jst = LocalDateTime.now();
    Date now = new Date();
    long time = now.getTime();
    Timestamp ts = new Timestamp(time);

    // 日付取得
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH);
    int lastDayofMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

//  演算 used by BigDecimal
    BigDecimal dayf = new BigDecimal(Float.valueOf(day));
    BigDecimal lastDayofMonthf = new BigDecimal(Float.valueOf(lastDayofMonth));
    BigDecimal substract = lastDayofMonthf.subtract(dayf);

    return substract.intValue();
  }

}
