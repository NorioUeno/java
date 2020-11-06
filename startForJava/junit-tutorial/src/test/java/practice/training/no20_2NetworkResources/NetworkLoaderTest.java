package practice.training.no20_2NetworkResources;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NetworkLoaderTest {

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
  public void test() throws IOException {
    NetworkResources sut = new NetworkResources();
    assertThat(sut.load(), is("Hello world\n"));
  }

  @Test
  public void useMockit() throws IOException {
//    setUp
    String expected = "Hello world\\n";
    NetworkLoader mockLoader = mock(NetworkLoader.class);
    ByteArrayInputStream input = new ByteArrayInputStream(expected.getBytes());

//    Mockのメソッドにexpectedを定義
    when(mockLoader.getInput()).thenReturn(input);
    NetworkResources sut = new NetworkResources();
    sut.loader = mockLoader;
//    Excercise
    String actual = sut.load();
//    Assertion
    assertThat(actual, is(expected));
  }

}
