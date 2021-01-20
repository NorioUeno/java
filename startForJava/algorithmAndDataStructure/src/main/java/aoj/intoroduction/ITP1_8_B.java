package aoj.intoroduction;

import java.util.Scanner;

/**
 * Sum of Numbers
 * @author aa572057
 *
 */
public class ITP1_8_B {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
//    scan.useDelimiter("|[\\n]");
    String inputLine;
    int output;

    while ((inputLine = scan.next()) != null) {

      if (inputLine.equals("0")) {
        break;
      } else {
        output = 0;
        String[] inputDigits = inputLine.split("");
        for (String inputDigit : inputDigits) {
          output += Integer.valueOf(inputDigit);
        }
        System.out.printf("%s\n", output);

      }
    }

  }

}
