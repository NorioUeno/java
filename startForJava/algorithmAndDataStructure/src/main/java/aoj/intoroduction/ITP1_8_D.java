package aoj.intoroduction;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Ring
 *
 * @author aa572057
 *
 */
public class ITP1_8_D {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String p = scan.next();
    String outputBoolean = "No";

    Pattern pattern = Pattern.compile("^.*" + p + ".*");
    int sFirst;
    StringBuilder shape = new StringBuilder();

    for (int sBegin = 0; sBegin < s.length(); sBegin++) {
      sFirst = sBegin;
      shape.delete(0, shape.length());
      for (int sLength = 0; sLength < s.length(); sLength++) {
        shape.append(s.charAt(sFirst));
//        System.out.print(s.charAt(sFirst));
        if (sFirst >= (s.length() - 1)) {
          sFirst -= s.length() - 1;
        } else {
          sFirst++;
        }
      }

//      System.out.println(shape);
//      System.out.println(pattern.matcher(shape).matches());
      if (pattern.matcher(shape).matches()) {
        outputBoolean = "Yes";
      }
    }

    System.out.println(outputBoolean);
  }

}
