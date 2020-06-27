package practice;

public class Wand {

  private String name; // 杖の名前
  private int power; // 杖の魔力

  void wand(){
    this.power=5;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

}
