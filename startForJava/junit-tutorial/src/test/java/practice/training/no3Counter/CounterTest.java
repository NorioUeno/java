/**
 *
 */
package practice.training.no3Counter;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author aa572057
 *
 */
public class CounterTest {

  Counter sut;

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {

    sut = new Counter();
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void initTest() {
    assertThat(sut.increment(), is(1));
  }

  @Test
  public void initTest2() {
    for (int i = 0; i < 50; i++) {
      sut.increment();
    }
    assertThat(sut.increment(), is(51));
  }

}
