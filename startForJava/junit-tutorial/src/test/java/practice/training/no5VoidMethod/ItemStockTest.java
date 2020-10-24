package practice.training.no5VoidMethod;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ItemStockTest {

  Item item;
  ItemStock sut;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
//    item = new Item(");
    sut = new ItemStock();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test1() {
    assertThat(sut.getNum(),is(0));
  }

  @Ignore
  @Test
  public void test2() {
    item = new Item("item1",100);
    sut.add(item);
    assertThat(sut.getNum(item),is(1));
  }
  @Test
  public void test3() {
    item = new Item("item1",100);
//    item = new Item("item1",100);
    sut.add(item);
    sut.add(item);
    assertThat(sut.getNum(item),is(2));
  }


}
