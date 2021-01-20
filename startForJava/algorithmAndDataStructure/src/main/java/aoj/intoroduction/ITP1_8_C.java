package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_8_C {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] alf = new int[26];
    while (scan.hasNext()) {
      String str = scan.next().toLowerCase();
      for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if ('a' <= c && c <= 'z') {
          alf[str.charAt(i) - 'a']++;
//          System.out.println(str.charAt(i)-'a');
          System.out.println(str.charAt(i));
        }
      }
//      scan.close();
//      break;
    }
    for (int i = 0; i < 26; i++) {
      System.out.printf("%c : %d\n", (char) 'a' + i, alf[i]);
    }
    scan.close();

  }

}
