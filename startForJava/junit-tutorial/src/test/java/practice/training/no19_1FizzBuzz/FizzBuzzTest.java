package practice.training.no19_1FizzBuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

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
    List list = FizzBuzz.createFizzBuzzList(16);
    assertThat(list.get(0),is("1"));
    assertThat(list.get(2),is("Fizdzz"));
  }

}
