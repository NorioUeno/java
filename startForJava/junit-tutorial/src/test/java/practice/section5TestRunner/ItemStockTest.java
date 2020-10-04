package practice.section5TestRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import practice.section5TestRunner.ItemStock;
import practice.section5TestRunner.ItemStockImpl;

@RunWith(Enclosed.class)
public class ItemStockTest {

  public static class testEmpty {
    ItemStock sut;

    @Before
    public void setUp() throws Exception {
      sut = new ItemStockImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void size_Aが0を返す() throws Exception{
      assertThat(sut.size("A"),is(0));
    }

    @Test
    public void contains_Aはfalseを返す() throws Exception{
      assertThat(sut.contains("A"),is(false));
    }
  }

   public static class testNotEmpty {
     ItemStock sut;

      @Before
      public void setUp() throws Exception {
        sut = new ItemStockImpl();
      }

      @After
      public void tearDown() throws Exception {
      }

      @Test
      public void size_Aが0を返す() throws Exception{
        assertThat(sut.size("A"),is(0));
      }

      @Test
      public void contains_Aはfalseを返す() throws Exception{
        assertThat(sut.contains("A"),is(false));
      }

  }

}
