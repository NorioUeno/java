package practice.training.no19_2JavaBeansCsvRead;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Employee {

  private String firstName;
  private String lastName;
  private String email;
  private List<Employee> employees;

  Employee() {
    this.employees = new ArrayList<Employee>();
  }

  public static List<Employee> load(InputStream fileStream) {

//    int i = fileStream.read();
//    while (i != -1) {
//    }

//      employees = new ArrayList<Employee>();

    return null;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
