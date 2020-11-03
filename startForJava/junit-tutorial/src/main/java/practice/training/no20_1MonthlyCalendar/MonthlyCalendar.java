package practice.training.no20_1MonthlyCalendar;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 *
 * @author aa572057
 *
 */
public class MonthlyCalendar {

  private final Calendar cal;

  /**
   * Constractor
   */
  public MonthlyCalendar() {
    this.cal = Calendar.getInstance();
  }
  public MonthlyCalendar(Calendar cal) {
    this.cal = cal;
  }

  /**
   * 月末までの日数
   * @return
   */
  public int getReamingDay() {
    return cal.getActualMaximum(Calendar.DATE) - cal.get(Calendar.DATE);
  }

  /**
   * システム日付を基準に月末までの日数を取得する
   * @return
   */
  public int getRemainingDays1() {

//    getDate
    LocalDateTime jst = LocalDateTime.now();
    Date now = new Date();
    long time = now.getTime();
    Timestamp ts = new Timestamp(time);

    System.out.println(ts);
    System.out.println(jst);

//    カレンダーのインスタンス取得
    Calendar c = Calendar.getInstance();

//    カレンダーに日付をセット
    //    c.setTime(now);
    c.set(2012,0,31);

    int day = c.get(Calendar.DAY_OF_MONTH);
    int lastDayofMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

    System.out.println("today:" + day);
    System.out.println("lastDayOfMonth"+lastDayofMonth);

//    演算 used by BigDecimal
    BigDecimal dayf = new BigDecimal(Float.valueOf(day));
    BigDecimal lastDayofMonthf = new BigDecimal(Float.valueOf(lastDayofMonth));
    BigDecimal substract = lastDayofMonthf.subtract(dayf);

    System.out.println(substract.intValue());

    return substract.intValue();
  }

}
