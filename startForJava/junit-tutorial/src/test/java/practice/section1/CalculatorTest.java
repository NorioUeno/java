package practice.section1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

  @Test
  public void multiply1() {
    Calculator calc = new Calculator();
    int expected = 12;
    int actual = calc.multiply(3, 4);
    assertThat(actual, is(expected));
  }

  @Test
  public void multiply2() {
    Calculator calc = new Calculator();
    int expected =35;
    int actual = calc.multiply(5, 7);
    assertThat(actual,is(expected));
  }

  @Test
  public void divide1() {
    Calculator calc = new Calculator();
    float expected = 1.5f;
    float atucal = calc.divide(3, 2);
    assertThat(atucal, is(expected));
  }

  @Test (expected = IllegalArgumentException.class)
  public void divide2() {
    Calculator calc = new Calculator();
    calc.divide(5, 0);
  }

}
