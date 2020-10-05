package practice.section7TestFixture;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.yaml.snakeyaml.Yaml;

public class BookStoreYamlTest {

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
//    SetUp used by SnakeYaml
    BookStore sut = new BookStore();
    Book book =(Book) new Yaml().loadAs(ClassLoader.getSystemResourceAsStream("testFixture.yml"), Book.class);
    sut.addToCart(book, 1);

//    Exercise & Verify
    assertThat(sut.getTotalPrice(),is(4501));
  }

}
