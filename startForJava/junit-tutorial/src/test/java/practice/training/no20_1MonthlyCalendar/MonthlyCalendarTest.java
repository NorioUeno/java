package practice.training.no20_1MonthlyCalendar;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MonthlyCalendarTest {

  Calendar cal;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
    TimeZone zone = TimeZone.getDefault();
    TimeZone jst = TimeZone.getTimeZone("Asia/Tokyo");
    Locale aLocal = new Locale("ja");

    cal = cal.getInstance(zone);

  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test() {

    MonthlyCalendar sut = new MonthlyCalendar(cal);
    assertThat(sut.getReamingDay(), is(27));
  }

  @Test
  public void test2() {
    TimeZone zone = TimeZone.getDefault();

    cal.set(2012, 0, 30);
    MonthlyCalendar sut = new MonthlyCalendar(cal);
    assertThat(sut.getReamingDay(), is(1));

  }

  @Test
  public void test3() {
    TimeZone zone = TimeZone.getDefault();

    cal.set(2012, 1, 1);
    MonthlyCalendar sut = new MonthlyCalendar(cal);
    assertThat(sut.getReamingDay(), is(28));

  }

}
