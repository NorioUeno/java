package practice;

public class PoisonMatango extends Matango {

  private int limitedAttackCount = 5;

  /**
   * @param suffix
   */
  public PoisonMatango(char suffix) {
    super(suffix);
  }

  public void poisonAttack(Hero h) {

    System.out.println("start:poisonAttack count:" + this.limitedAttackCount);
    System.out.println("HERO Name:" + h.getName() + " HP:" + h.getHp());
    if (this.limitedAttackCount > 0) {
      h.setHp(h.getHp() - (h.getHp() / 5));
      System.out.println("start:Additional atack: hero.hp " + h.getHp());
      this.limitedAttackCount -= 1;
      System.out.println("start:Additional2 atack: hero.hp " + h.getHp());
    }
  }
  public int getLimitedAttackCount() {
    return this.limitedAttackCount;
  }
  public void getLimitedAttackCount(int limitedAttackCount) {
    this.limitedAttackCount=limitedAttackCount;
  }

}
