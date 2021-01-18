package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_9_D {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int commandsLength = scan.nextInt();

    for (int commandNum = 0; commandNum < commandsLength; commandNum++) {
      String command = scan.next();
      print(str,1,3);
    }
  }

  public static void print(String str, int first, int last) {
//    System.out.println("print");
    String[] strChar = str.split("");
    while (first <= last) {
      System.out.print(strChar[first]);
      first++;
    }
    System.out.println();
  }

}
