package practice.section11TestabilityMocStub;

import java.util.Random;

public class RandomNumberGeneratorImpl implements RandomNumberGenerator{

  // 乱数生成
  private final Random rand = new Random();

  @Override
  public int nextInt() {
    // TODO Auto-generated method stub
    return rand.nextInt();
  }

}
