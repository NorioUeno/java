/**
 *
 */
package practice.section7TestFixture;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * @author aa572057
 *
 */
@RunWith(Enclosed.class)
public class LruCacheTest {

  public static class Test1 {
    static LruCache<String, String> sut;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
      sut = new LruCache <String, String>() ;
      sut.put("1", "value1");
      sut.put("2", "value2");
      sut.put("3", "value3");
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
    public void test1_1() {
      assertThat(sut.getSize(),is(3));
    }
    @Test
    public void test1_2() {
      assertThat(sut.getValue("aaa"),is(nullValue()));
      assertThat(sut.getValue("2"),is("value2"));
    }

  }
}
