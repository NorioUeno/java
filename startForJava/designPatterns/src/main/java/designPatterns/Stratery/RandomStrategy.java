package designPatterns.Stratery;

import java.util.Random;

public class RandomStrategy implements Strategy {

  private Random random;
  private Hand randomHand;


  public RandomStrategy(int seed) {
    random = new Random(seed);
  }

  @Override
  public Hand nextHand() {
    randomHand = Hand.getHand(random.nextInt(3));
    return randomHand;
  }

  @Override
  public void study(boolean win) {

    //勝ってもなにも考えない

  }

}
