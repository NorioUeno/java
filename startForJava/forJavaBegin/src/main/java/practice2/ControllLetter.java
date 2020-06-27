/**
 *
 */
package practice2;

/**
 * @author aa572057
 *
 */
public class ControllLetter {

  final String file = "readme.txt";

  static public void count() {

    StringBuilder sb = new StringBuilder();

    System.out.println("start");
    int i;

    for (i = 0; i < 100; i++) {
      sb.append(i + 1 + ",");

      System.out.println(sb);
    }

    String a = sb.toString();
    String[] b = a.split(",");

    System.out.println("end");

  }

  static public void makePath() {

    String filepath1 = "/Users/aa572057";
    String filepath2 = "/Users/aa572057";

    if (filepath2.matches(".*/$") != true) {

      filepath2 +=  "/";
      System.out.println(filepath2);

    }
  }

  //regex=regurler exppression = 正規表現
  static public void regex() {

    String testRegex= "a12222Aa";

    //すべての文字列
    System.out.println(testRegex.matches(".*"));

    // 最初の１文字はA、２文字目は数字、３文目は数字がなし
    System.out.println(testRegex.matches("^a\\d{1,2}"));

    // ?:直前の0回、または１回の繰り返し
    System.out.println(testRegex.matches("^[a-z]([a-z0-9][a-zA-Z0-9]*)?$"));

  }




}