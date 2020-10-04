package practice.section5TestRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import practice.section1.Calculator;

@RunWith(Theories.class)
public class CalcTheoriesTest {

  @DataPoints
  public static int[][] VALUES = {
      {0,0,0},
      {0,1,1},
      {1,1,2},
      {3,4,7}
  };


  /**
   * テストランナー Theory
   * パラメータ化したテストケースを実行する
   * @param values
   * @throws Exception
   */
  @Theory
  public void add(int[] values) throws Exception {

    Calculator sut = new Calculator();
    assertThat(sut.add(values[0], values[1]),is(values[2]));

  }






}

