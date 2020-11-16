package practice.training.no19_6Combination;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FrameworksTest {

  private static Frameworks frameworks;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
    frameworks = new Frameworks();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test() {
    ApplicationServer as = ApplicationServer.Tomcat;
    DataBase db = DataBase.MySQL;
    assertThat(true,is(frameworks.isSupport(as, db)));



//    Frameworks frameworks = new Frameworks();
//    assertThat(1,is(1));


//    DataBase db = null;
//    boolean support = Frameworks.isSupport(as, db);
  }

}
