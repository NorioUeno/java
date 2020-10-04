package practice.section1;

public class Calculator {

  private String name;
  private int type;

  public Calculator() {
  }
  public Calculator(String name) {
    this.setName(name);
  }

  public void init() {

    System.out.println("Calculator.class init.");
  }

  public void shutdown() {

    System.out.println("Calculator.class shut down");
  }

  public int multiply(int x,int y) {

    return x * y;
  }

  public float divide(int x,int y) {

    if(y==0) throw new IllegalArgumentException("divide by zero.");
    return (float)x / (float)y;
  }

  public int add(int x, int y) {
    return x +y;
  }



  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getType() {
    return type;
  }
  public void setType(int type) {
    this.type = type;
  }

}
