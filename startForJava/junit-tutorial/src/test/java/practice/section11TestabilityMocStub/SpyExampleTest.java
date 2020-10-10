package practice.section11TestabilityMocStub;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpyExampleTest {

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

    SpyExample sut = new SpyExample();
    SpyLogger spy = new SpyLogger(sut.logger);
    sut.logger = spy;
    sut.doSomething();
    assertThat(spy.log.toString(), is("doSomething"));
  }

}
