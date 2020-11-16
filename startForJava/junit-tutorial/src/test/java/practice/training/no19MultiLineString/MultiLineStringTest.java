package practice.training.no19MultiLineString;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultiLineStringTest {

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
    String br = System.getProperty("line.separator");
    String expected = "helllo" + br + "world" + br;

    MultiLineString sut = new MultiLineString();
    String[] testData = { "helllo", "world" };

    assertThat(expected, is(MultiLineString.join(testData)));
  }

  @Test
  public void test2() {
    String br = System.getProperty("line.separator");
    String expected = "helllo" + br + "world" + br;

    MultiLineString sut = new MultiLineString();
    String[] testData = { "ahelllo", "worsasald" };

    assertThat(expected, is(MutiLineStringMatcher.text(MultiLineString.join(testData))));
  }

  static class MutiLineStringMatcher extends BaseMatcher<String> {

    private final String expected;
    private Object actual;
    private final List<String> expectedLines = new ArrayList<String>();
    private final List<String> actualLines = new ArrayList<String>();
    private final Pattern pattern;

    public MutiLineStringMatcher(String expected, String ls) {
      this.expected = expected;
      if (ls.equals("\r")) {
        this.pattern = Pattern.compile(".+(\\r|$)");
      } else if (ls.equals("\n")) {
        this.pattern = Pattern.compile(".+(\\n|$)");
      } else {
        this.pattern = Pattern.compile(".+(\\r\\n|$)");
      }
      if (expected != null) {
        java.util.regex.Matcher m = pattern.matcher(expected);
        while (m.find()) {
          expectedLines.add(expected.substring(m.start(), m.end()));
        }
      }
    }

    public static MutiLineStringMatcher text(String text) {

      return new MutiLineStringMatcher(text, System.getProperty("line.separator"));
    }

    @Override
    public boolean matches(Object actual) {
      this.actual = actual;
      if (expected == null)
        return (actual == null);
      if (!(actual instanceof String)) {
        return false;
      }

      if (expected.equals(actual))
        return true;

      String actualString = (String) actual;
      java.util.regex.Matcher m = pattern.matcher(actualString);
      while (m.find()) {
        actualLines.add(actualString.substring(m.start(), m.end()));
      }
      return expectedLines.equals(actualLines);
    }

    @Override
    public void describeTo(Description desc) {
      if (expected == null || actual == null) {
        desc.appendValue(expected);
      } else {
        int lines = Math.min(expectedLines.size(), actualLines.size());
        actualLines.size();
        for (int idx = 0; idx < lines; idx++) {
          String expectedLine = expectedLines.get(idx);
          String actualLine = actualLines.get(idx);
          if (!expectedLine.equals(actualLine)) {
            desc.appendValue(expectedLine);
            desc.appendText(",but actual is");
            desc.appendValue(actualLine);
            desc.appendText(",line" + (idx + 1) + "\n");
            desc.appendValue(expected);
          }
        }
      }

    }

  }

}
