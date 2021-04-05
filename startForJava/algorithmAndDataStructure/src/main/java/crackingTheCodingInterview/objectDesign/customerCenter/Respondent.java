package crackingTheCodingInterview.objectDesign.customerCenter;

public class Respondent extends Person{


  public Respondent(String name){
    this.name = name;
    this.roll = Role.Respondent;
  }


  @Override
  public Res reciveCall(Call call) {

    Res res = new Res();
    return res;
  }

}
