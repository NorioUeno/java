package practice.training.no1SnakeCaseConversion;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringUtilsSnakeTest {

  StringUtilsSnake sut;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
    sut = new StringUtilsSnake();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test1() {
    String expected = "aaa";
    String actual = sut.toSnakeCase("aaa");
    assertThat(actual,is(expected));
  }

  @Test
  public void test2() {
    String expected = "hello_world";
    String actual = sut.toSnakeCase("HelloWorld");
    assertThat(actual,is(expected));
  }
  @Test
  public void test3() {
    String expected = "practice_junit";
    String actual = sut.toSnakeCase("practiceJunit");
    assertThat(actual,is(expected));
  }



}
