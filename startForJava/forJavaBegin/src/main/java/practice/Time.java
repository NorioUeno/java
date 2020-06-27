package practice;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Time {

  public void timePrint() {
    // getdate()
    LocalDateTime jst = LocalDateTime.now();
    Date now = new Date();
    long time = now.getTime();
    Timestamp ts = new Timestamp(time);

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

    System.out.println(day);

  }

}
