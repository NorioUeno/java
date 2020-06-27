package practice;

public class Hero {

  private int hp;
  private String name;

  public Hero() {
    this.name="norio";
    this.hp=100;
  }

  void sleep() {
    this.hp = 100;

  }

  void attack(int damage) {
    System.out.println(this.name + "の攻撃");

  }

  public void setHp (int hp) {
    this.hp = hp;
  }
  public int getHp() {
    return this.hp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


}
