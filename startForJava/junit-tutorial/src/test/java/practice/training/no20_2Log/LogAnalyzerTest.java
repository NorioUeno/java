package practice.training.no20_2Log;

import static org.mockito.Mockito.*;
import java.io.IOException;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import practice.training.no20_2Log.LogAnalyzer.AnalyzeException;

public class LogAnalyzerTest {

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

  @Rule
  public ExpectedException ex = ExpectedException.none();

  @Test(expected = AnalyzeException.class)
  public void test() {
    LogAnalyzer sut = new LogAnalyzer();
    sut.analyze("");
  }

  @Test
  public void test2() throws Exception {
//    setup
    LogAnalyzer sut = new LogAnalyzer();
    final IOException errorCause = new IOException("error by stub");

    LogLoader mockLoader = mock(LogLoader.class);
    sut.logLoader = mockLoader;
    when(mockLoader.load("test")).thenThrow(errorCause);

    ex.expect(LogAnalyzer.AnalyzeException.class);
    ex.expectMessage("error by stub");
    ex.expect(new Matcher<Object>() {

      Throwable cause;

      @Override
      public void describeTo(Description description) {
        description.appendValue(cause);
      }

      @Override
      public boolean matches(Object item) {
        Throwable t = (Throwable) item;
        cause = t.getCause();
        return cause == errorCause;
      }

      @Override
      public void describeMismatch(Object item, Description mismatchDescription) {
        // TODO Auto-generated method stub
      }

      @Override
      public void _dont_implement_Matcher___instead_extend_BaseMatcher_() {
        // TODO Auto-generated method stub

      }

    });

//    Excercise
    sut.analyze("test");

  }

}
