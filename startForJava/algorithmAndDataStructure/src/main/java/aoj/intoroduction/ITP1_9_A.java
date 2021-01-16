package aoj.intoroduction;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Finding a Word
 * eg.regex case insencisitive
 *
 * @author aa572057
 *
 */
public class ITP1_9_A {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int wordCount = 0;
    String word = scan.next();
    String text;
    Pattern pattern = Pattern.compile(word,Pattern.CASE_INSENSITIVE); // regex 大文字小文字区別しない
//    Pattern pattern = Pattern.compile(".*" + word + ".*",Pattern.CASE_INSENSITIVE); // regex 大文字小文字区別しない

    while (scan.hasNext()) {
      text = scan.next();
//      System.out.println(text);
      if (pattern.matcher(text).matches()) {
        wordCount++;
      }
      if (text.equals("END_OF_TEXT")) {
        break;
      }
    }
    System.out.println(wordCount);
  }

}
