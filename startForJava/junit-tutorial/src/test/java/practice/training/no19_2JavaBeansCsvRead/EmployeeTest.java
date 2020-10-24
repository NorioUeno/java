package practice.training.no19_2JavaBeansCsvRead;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {

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

    List<Employee> listEm = new ArrayList<Employee>();
    Employee e = new Employee(1);
    e.setFirstName("Norio");
    e.setLastName("Ueno");
    e.setEmail("uenorio.october9@gmail.com");
    listEm.add(e);


    try {
      List<Employee> actual = Employee.load(new FileInputStream("employee.csv"));
      Employee actualEmployee = actual.get(0);
      assertThat(actualEmployee.getFirstName(),is(e.getFirstName()));
    } catch (FileNotFoundException e2) {
      // TODO Auto-generated catch block
      e2.printStackTrace();
    }


////    Employee e1 = new Employee(2);
//    try {
//      assertThat(Employee.load(new FileInputStream("employee.csv")),is(listEm));
//    } catch (FileNotFoundException e1) {
//      // TODO Auto-generated catch block
//      e1.printStackTrace();
//    }



  }

}
