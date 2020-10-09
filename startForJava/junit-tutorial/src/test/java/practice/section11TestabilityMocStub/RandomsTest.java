package practice.section11TestabilityMocStub;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RandomsTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void AnswerAofConice() throws Exception{
    List<String> options = new ArrayList<String>();
    options.add("A");
    options.add("B");
    Randoms sut = new Randoms();

//    スタブの設定
    sut.generator = new RandomNumberGenerator() {
      @Override
      public int nextInt() {
        // TODO Auto-generated method stub
        return 0;
      }
    };
    assertThat(sut.choice(options),is("A"));
  }

  @Test
  public void AnswerBofConice() throws Exception{
    List<String> options = new ArrayList<String>();
    options.add("A");
    options.add("B");
    Randoms sut = new Randoms();

//    スタブの設定
    sut.generator = new RandomNumberGenerator() {
      @Override
      public int nextInt() {
        // TODO Auto-generated method stub
        return 1;
      }
    };
    assertThat(sut.choice(options),is("B"));
  }




}
