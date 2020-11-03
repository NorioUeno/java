package useful.tools.UsefulTools.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Calc {

  /**
   * bigDecimalを使った計算
   * @return
   */
  public int getRemainingDays() {

//    getDate
    LocalDateTime jst = LocalDateTime.now();
    Date now = new Date();
    long time = now.getTime();
    Timestamp ts = new Timestamp(time);

    System.out.println(ts);
    System.out.println(jst);

//    日付取得
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH);
    int lastDayofMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

    System.out.println(day);
    System.out.println(lastDayofMonth);

//    演算 used by BigDecimal
    BigDecimal dayf = new BigDecimal(Float.valueOf(day));
    BigDecimal lastDayofMonthf = new BigDecimal(Float.valueOf(lastDayofMonth));
    BigDecimal substract = lastDayofMonthf.subtract(dayf);

    System.out.println(substract.intValue());

    return substract.intValue();
  }

}
