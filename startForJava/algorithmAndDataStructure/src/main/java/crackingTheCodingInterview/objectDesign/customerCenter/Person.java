package crackingTheCodingInterview.objectDesign.customerCenter;

public abstract class Person {

  String name;
  String department;
  String sex;
  int age;
  String responsible;
  String roll;

  boolean isBusy = false;

  public Res reciveCall(Call call) throws Exception {

    isBusy = true;
    Res res = new Res();
    Thread.sleep(10L);
    isBusy = false;
    return res;
  }


}
