package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_9_D {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int commandsLength = scan.nextInt();
//    Class<?> ITP1_9_D =

    for (int commandNum = 0; commandNum < commandsLength; commandNum++) {
      String command = scan.next();

      switch(command){
        case "replace":
          str = replace(str, scan.nextInt(), scan.nextInt(), scan.next());
          break;
        case "print":
          print(str,scan.nextInt(),scan.nextInt());
          break;
        case "reverse":
          str = reverse(str, scan.nextInt(), scan.nextInt());
          break;
      }
//      print(str,1,3);
//      replace(str, 1, 3, "xyz");
//      reverse(str, 0, 2);
    }
//    System.out.println("★：" + String.join("", reverseChar));
  }

  /**
   * @param str
   * @param first
   * @param last
   */
  public static void print(String str, int first, int last) {
//    System.out.println("print");
    String[] strChar = str.split("");
    while (first <= last) {
      System.out.print(strChar[first]);
      first++;
    }
    System.out.println();
  }

  /**
   * @param str
   * @param first
   * @param last
   * @param replaceStr
   * @return
   */
  public static String replace(String str, int first, int last, String replaceStr) {
//  System.out.println("print");
    String[] strChar = str.split("");
    String[] replaceStrChar = replaceStr.split("");
//    StringBuilder stringBuilder = StringBuilder;
    int rpelaceStrNum = 0;
    while (first <= last) {
      strChar[first] = replaceStrChar[rpelaceStrNum];
//      System.out.print(strChar[first]);
      first++;
      rpelaceStrNum++;
    }
//    System.out.println();
//    System.out.println("★：" + String.join("",strChar));
    return String.join("", strChar);
  }

  public static String reverse(String str, int first, int last) {
//  System.out.println("reverse");
    String[] strChar = str.split("");
    String[] reverseChar = strChar.clone();
    int reveseeNumEnd = last;
    while (first <= last) {
      reverseChar[reveseeNumEnd] = strChar[first];
      first++;
      reveseeNumEnd--;
    }
//    System.out.println("★：" + String.join("", reverseChar));
    return String.join("", reverseChar);
  }

}
