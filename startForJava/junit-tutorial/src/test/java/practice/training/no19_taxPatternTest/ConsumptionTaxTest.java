package practice.training.no19_taxPatternTest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ConsumptionTaxTest {

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

  @DataPoints
  public static Fixture[] FIXTURES = new Fixture[] {
      new Fixture(5, 100, 105),
      new Fixture(5, 3000, 3150),
      new Fixture(10, 50, 55),
      new Fixture(5, 50, 53),
      new Fixture(3, 50, 52),
      };

  @Ignore
  @Test
  public void test() {
//    set up
    ConsumptionTax ct = ConsumptionTax.getInstance(5);
    int expected = 105;
    assertThat(ct.apply(100), is(expected));
  }

  @Ignore
  @Test
  public void test1() {
//    set up
    ConsumptionTax ct = ConsumptionTax.getInstance(5);
    int expected = 3150;

    Fixture fx = new Fixture(2, 1, 2);

    assertThat(ct.apply(3000), is(expected));
  }

  @Theory
  public void test2(Fixture fixture) throws Exception {

//    set up
    ConsumptionTax sut = ConsumptionTax.getInstance(fixture.taxRate);

    String desc = "when rate=" + fixture.taxRate + ",price" + fixture.price ;
    assertThat(desc,sut.apply(fixture.price),is(fixture.expected));

  }

  static class Fixture {
    final int taxRate;
    final int price;
    final int expected;

    Fixture(int taxRate, int price, int expected) {
      this.taxRate = taxRate;
      this.price = price;
      this.expected = expected;
    }
  }

}
