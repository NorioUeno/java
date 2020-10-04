package practice.section5TestRunner;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.experimental.categories.Category;


public class SlowAndFastTest {

  @Test
  public void fastTest01() throws Exception{

  }

  @Test
//  @Category(SlowTests.class)
  public void slowTest01() throws Exception{
    fail();
  }

  @Test
  @Category(SlowTests.class)
  public void slowTest02() throws Exception{
    fail();
  }



}
