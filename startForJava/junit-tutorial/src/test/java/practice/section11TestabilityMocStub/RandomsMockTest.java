package practice.section11TestabilityMocStub;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.Test;

public class RandomsMockTest {

  @Test
  public void answerAfromChoice() throws Exception{

    List<String> options = new ArrayList<String>();
    options.add("A");
    options.add("B");
    Randoms sut = new Randoms();

//    モックの設定
    final AtomicBoolean isCallNextIntMethod = new AtomicBoolean(false);

  }

}
