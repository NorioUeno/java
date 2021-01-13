package aoj.intoroduction;

import java.io.IOException;
import java.util.Scanner;

/**
 * Toggling Cases:<br>
 * Stdinを受け取る方法
 * 1.BufferedReaderのreadLine<br>
 * 2.Scanner.useDelimiterで区切り位置を変更
 *
 * @author aa572057
 *
 */
public class ITP1_8_A {
//  public class Main {
  public static void main(String[] args) throws IOException {

//    1.BufferedReader
//    BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
//    String line = br.readLine();
//    Pattern pattern = Pattern.compile("LATER");
//    Matcher matcher = pattern.matcher(line);

//    2.Scanner.useDelimiter
    Scanner scan = new Scanner(System.in);
    scan.useDelimiter("[\\n]");
    String line = scan.next();
//    String line = "fAIR, LATER, OCCASIONALLY CLOUDY.";
    String[] lineArray = line.split("");
    for (String line1letter : lineArray) {
//      System.out.printf("%s",line1letter);
//      System.out.printf("%s", line1letter.toUpperCase());
      if (line1letter.toUpperCase().equals(line1letter)) {
        System.out.printf("%s", line1letter.toLowerCase());
      } else {
        System.out.printf("%s", line1letter.toUpperCase());
      }
    }
    System.out.printf("\n");
//    System.out.printf("---------\n");
//    for (int inputLineNum = 0; inputLineNum < line.length(); inputLineNum++) {
//      System.out.printf("%s", line.charAt(inputLineNum));
////      System.out.printf("%s",line.);
//    }
//    System.out.println();

//    System.out.println(line + ":" + line.charAt(0));
//    System.out.println(line2);
//    System.out.println(matcher.find());
//    input.sp

  }

}
