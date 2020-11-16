package practice.training.no20_6HelloWorld;

import static org.mockito.Mockito.*;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.mockito.Mockito;

public class HelloWordTest {

  @Rule
  public SysoutSpy sysoutSpy = new SysoutSpy();

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

  @Test
  public void test() {
    HelloWord  sut = new HelloWord();
    sut.say();
    verify(sysoutSpy.spy).println("Hello Worid");
  }

  class SysoutSpy implements TestRule {

    PrintStream spy;

    @Override
    public Statement apply(final Statement base, final Description description) {
      return new Statement() {

        @Override
        public void evaluate() throws Throwable {
          PrintStream out = System.out;
          spy = Mockito.spy(out);
          try {
            System.setOut(spy);
            base.evaluate();
          } finally {
            System.setOut(out);
          }
        }
      };
    }

  }

}
