package practice.training.no4Even;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberUitlsTest {

  NumberUitls sut;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
    sut = new NumberUitls();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test() {
    assertThat(sut.isEven(5),is(false));
  }
  @Test
  public void testEvne() {
    assertThat(sut.isEven(10),is(true));
  }
  @Test
  public void testOdd() {
    assertThat(sut.isEven(7),is(false));
  }



}
