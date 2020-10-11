package practice.section7TestFixture.mockit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ControllerTest {


  @Mock
  private Service service;

  @InjectMocks
  private Controller controller;


  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {

//    mockitのアノテーション初期化
    MockitoAnnotations.initMocks(this);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test() {
    when(service.getContentById(1)).thenReturn("hello");

//    assertThat(service.getContentById(1),is(nullValue()));
    assertThat(service.getContentById(1),is("hello"));
//    assertThat(service.getContentById(0),is("content:2"));
  }

}
