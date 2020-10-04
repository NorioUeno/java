package practice.section7TestFixture;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilTest {

  @Test
  public void isEmptyOrNullReturnTruebyEmpty () throws Exception {
//    SetUp
    String input ="";
    boolean expected = true;
//    Exercise
    boolean actual = StringUtils.isEmpty(input);
//    Verify
    assertThat(actual,is(expected));
  }

  @Test
  public void isEmptyReturnTruebyAAA () throws Exception {
//    SetUp
    String input ="AAA";
    boolean expected = false;
//    Exercise
    boolean actual = StringUtils.isEmpty(input);
//    Verify
    assertThat(actual,is(expected));
  }

  


}
