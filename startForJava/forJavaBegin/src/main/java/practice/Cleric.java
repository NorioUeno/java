package practice;

/**
 * @author aa572057
 *   Practice 8
 */
public class Cleric {
  String name;
  int HP;
  final static int maxHP = 50;
  int MP;
  final static int maxMP = 10;

  //コンストラクタのオーバロード
  public Cleric() {
    this.name="初期値";
    this.HP=maxHP;
    this.MP=maxMP;
  }
  public Cleric(String name, int HP, int MP) {
    this.name = name;
    this.HP = HP;
    this.MP = MP;
  }

  public Cleric(String name, int HP) {
    this(); //コンストラクタ呼び出し
    this.name = name;
    this.HP=HP;
  }
  public Cleric(String name) {
    this();
    this.name = name;
  }

  public void selfAid() {
    System.out.println("selfAid:start");
    this.MP -= 5;
    System.out.println("selfAid:end status" + " HP:" + HP + " MP:" + MP);
  }

  public void pray(int time) {
    System.out.println("pray:start");
    int recoveryMP = new java.util.Random().nextInt(time - 1);
    MP = MP + recoveryMP;
    if (MP > maxMP) {
      MP = maxMP;
    }
    System.out.println("selfAid:end status" + " HP:" + HP + " MP:" + MP + " recoveryMP: " + recoveryMP);

  }

}
