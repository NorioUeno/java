package practice;

public class Wizard {

  private int hp;
  private int mp;
  private String name;
  private Wand wand = new Wand();

  public void heal(Hero h) {
    int basePoint = 10;
    int recovPoint = (int) (basePoint * this.wand.getPower());

    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した");

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() <=3 && name != null) {
      throw new IllegalArgumentException("ERROR: Name length is less than 3 letters or null");
    }
      this.name = name;

  }

  public int getMp() {
    return mp;
  }

  public void setMp(int mp) {
    this.mp = mp;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

}
