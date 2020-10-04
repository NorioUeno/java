package practice.section3Readability;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.Timeout;
import practice.section1.Calculator;

public class TargetClassTest {

  private Calculator sut;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
    sut = new Calculator();
    sut.init();
    System.out.println("initialize");
  }

  @After
  public void tearDown() throws Exception {
//    sut.shutdown();
    System.out.println("finalize");
  }

  @Test
  public void test1() {
//    Calculator sut = new Calculator();
//    sut.init();
    int actual = sut.multiply(3, 4);
    assertThat(actual,is(12));
  }

  @Ignore("未実装")
  @Test(timeout = 100L)
  public void timeoutTest() {
    Timeout sut = new Timeout(20);

  }

  @Test
  public void instanceTest() {
//    Exercise
    Calculator instance = new Calculator("cal1");
//    Verify
    assertThat(instance.getName(),is("cal1"));
    assertThat(instance.getType(),is(-1));
  }


}
