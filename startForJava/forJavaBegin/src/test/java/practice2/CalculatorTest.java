/**
 *
 */
package practice2;

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
public class CalculatorTest {

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
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testAdd0() {
    int actual = Calculator.add(1, 2);
    assertEquals(actual,3);
  }
  @Test
  public void testAdd1() {
    int actual = Calculator.add(1, 2);
    assertEquals(actual, is(3));
  }

  @Test
  public void testAdd2() {
    int actual = Calculator.add(1, 2);
    assertEquals(actual, is(4));
  }

  @Test
  public void testAdd3() {
    int actual = Calculator.add(1, 2);
    assertNull(actual);
  }

}
