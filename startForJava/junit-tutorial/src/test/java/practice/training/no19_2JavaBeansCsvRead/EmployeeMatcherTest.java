package practice.training.no19_2JavaBeansCsvRead;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * カスタムmatcher
 * @author aa572057
 *
 */
public class EmployeeMatcherTest {

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
  public void test() throws FileNotFoundException {

//    setup
    InputStream input = getClass().getResourceAsStream("employee.csv");
//    List<Employee> input = Employee.load(new FileInputStream("employee.csv"));


    Employee expected = new Employee(1);
    expected.setFirstName("Norio");
    expected.setLastName("Ueno11");
    expected.setEmail("uenorio.october9@gmail.com");

//    Exercise
//    List<Employee> actual = Employee.load(input);
    List<Employee> actual = Employee.load(new FileInputStream("employee.csv"));

//    Verrify
    assertThat(actual, is(notNullValue()));
    assertThat(actual.size(), is(1));
    assertThat(actual.get(0), is(EmployeeMatcher.employee(expected)));
  }

  static class EmployeeMatcher extends BaseMatcher<Employee> {

    private final Employee expected;
    private String field;
    private Object expectedValue;
    private Object actualValue;

//    constructor
    EmployeeMatcher(Employee expected) {
      this.expected = expected;
    }

    public static BaseMatcher<Employee> employee(Employee expected) {
      return new EmployeeMatcher(expected);
    }

    @Override
    public boolean matches(Object actual) {
      if (expected == null)
        return (actual == null);
      if (!(actual instanceof Employee))
        return false;
      Employee other = (Employee) actual;
      if (notEquals(expected.getFirstName(), other.getFirstName())) {
        field = "firstName";
        expectedValue = expected.getFirstName();
        actualValue = other.getFirstName();
        return false;
      }
      if (notEquals(expected.getLastName(), other.getLastName())) {
        field = "lastName";
        expectedValue = expected.getLastName();
        actualValue = other.getLastName();
        return false;
      }
      if (notEquals(expected.getEmail(), other.getEmail())) {
        field = "email";
        expectedValue = expected.getEmail();
        actualValue = other.getEmail();
        return false;
      }
      return true;
    }

    @Override
    public void describeTo(Description description) {
      if (expected == null || field == null) {
        description.appendValue(expected);
      } else {
        description.appendText(field + " is ").appendValue(expectedValue).appendText(", but").appendValue(actualValue);
      }
    }

    private boolean notEquals(Object obj, Object other) {
      if (obj == null)
        return other != null;
      return !obj.equals(other);

    }

  }

}
