package practice.section7TestFixture;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;
import practice.section1.Calculator;

public class CalacRuleTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Rule
  public TemporaryFolder tempFolder = new TemporaryFolder();

  @Rule //タイムアウト
  public Timeout timeout = new Timeout(100);

  @Rule //実行中のテストメソッド名を参照できる
  public TestName testName = new TestName();

  @Test
  public void test() throws InterruptedException {
//    Thread.sleep(10);
    Calculator calc = new Calculator();
    int expected = 5;
    int actual = calc.add(5, 0);
    assertThat(actual, is(expected));
  }

}
