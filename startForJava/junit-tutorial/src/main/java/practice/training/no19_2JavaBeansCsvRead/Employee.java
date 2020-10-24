package practice.training.no19_2JavaBeansCsvRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Employee {

  private int id;
  private String firstName;
  private String lastName;
  private String email;

  Employee(int id) {
    setId(id);
  }

  public static List<Employee> load(InputStream is) {

    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);

    String line;
    String[] array;
    List<Employee> employees = new ArrayList<Employee>();
    int i = 1;

    try {
      while ((line = br.readLine()) != null) {

        Employee e = FactoryEmployee.create(i);
        array = line.split(",");
        System.out.println("firstName:" + array[0]);
        System.out.println("lastName:" + array[1]);
        System.out.println("email:" + array[2]);
        System.out.println("id:" + e.getId());

        e.setFirstName(array[0]);
        e.setLastName(array[1]);
        e.setEmail(array[2]);
        employees.add(e);

        i++;

      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return employees;
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
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

}
