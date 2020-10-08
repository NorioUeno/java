package practice.section7TestFixture;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;
import org.junit.rules.TestWatcher;
import org.junit.rules.Timeout;
import org.junit.runner.Description;
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
  public Timeout timeout = new Timeout(100000);

  @Rule //実行中のテストメソッド名を参照できる
  public TestName testName = new TestName();

  @Rule //例外出力　よくわからん。。
  public ExpectedException expectedException = ExpectedException.none();

  @Rule //ログ出力 テストウォッチャー
  public TestWatcher testWatcher = new TestWatcher () {
    @Override
    protected void starting(Description description) {
      Logger.getAnonymousLogger().info("start:"
      + description.getMethodName());
    }
    @Override
    protected void succeeded(Description description) {
      Logger.getAnonymousLogger().info("succeeded:"
      + description.getMethodName());
    }
    @Override
    protected void failed(Throwable e, Description description) {
      Logger.getAnonymousLogger().log(Level.WARNING, "failed:" + description.getMethodName(),e);
    }
    @Override
    protected void finished(Description description) {
      Logger.getAnonymousLogger().info("finished:"
          + description.getMethodName());
    }
  };

  @Test(timeout = 300L)
  public void test() throws InterruptedException {
//    Thread.sleep(10);
    Calculator calc = new Calculator();
    int expected = 5;
    int actual = calc.add(5, 0);
    assertThat(actual, is(expected));
    System.out.println("テストメソッド名:" + testName.getMethodName());
  }

  @Test
  public void ExMsg() throws Exception{
    expectedException.expect(IllegalArgumentException.class);
    expectedException.expectMessage("argument is null");
    throw new IllegalArgumentException();

  }

}
