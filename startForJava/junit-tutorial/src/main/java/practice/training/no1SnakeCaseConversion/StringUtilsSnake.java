package practice.training.no1SnakeCaseConversion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/**
 * regex : 正規表現
 * PatternとMacher
 * @author aa572057
 *
 */
public class StringUtilsSnake {

  public static String toSnakeCase(String camel) {

    if (StringUtils.isEmpty(camel)) {
      return camel;
    }
    if (camel == null)
      throw new NullPointerException("camel == null");

    Pattern p = Pattern.compile("[A-Z]");
    Matcher m = p.matcher(camel);

//    Matcher の動き
    while (m.find()) {
      System.out.println(m.group());
    }

    String snake = camel;
    for (;;) {
      Matcher m2 = p.matcher(snake);
      if (!m2.find())
        break;
      snake = m2.replaceFirst("_" + m2.group().toLowerCase());
      System.out.println("camel to snake :" + snake);
    }

    System.out.println(snake.replaceFirst("^_", "").toUpperCase());

    return snake.replaceFirst("^_", "").toLowerCase();

//   以下色々検証した。。
//  snakeBF.append(m.replaceFirst("_" + m.group(0).toLowerCase()));
//  System.out.println("snake" + snake);

//  System.out.println("camel.length:" + camel.length());
//  System.out.println("camel.length:" + camel.charAt(0)) ;

//  for (int i = 0; i <= camel.length() - 1; i++) {

//    Matcher m = p.matcher(camel);

//
//    for (int i = 0; i <= camel.length(); i++) {
//      Matcher m = p.matcher(camel);
//      if(!m)
//
//    }

//    return null;
  }

}
