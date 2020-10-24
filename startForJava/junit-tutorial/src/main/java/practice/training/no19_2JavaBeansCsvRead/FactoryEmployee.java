package practice.training.no19_2JavaBeansCsvRead;

public class FactoryEmployee {

  int num;

  public static final Employee create(int id) {

    Employee e = new Employee(id);

    return e;
  }

  public void resiterNum() {

    ++num;
  }

}
