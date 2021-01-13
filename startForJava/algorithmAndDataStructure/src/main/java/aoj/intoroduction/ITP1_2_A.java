package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_2_A {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    String relation;

    if (a == b) {
      relation = "==";
    } else if (a > b) {
      relation = ">";
    } else {
      relation = "<";
    }
//    System.out.printf("%d %s %d", a, relation, b);
    System.out.printf("a %s b\n", relation);
  }
}
