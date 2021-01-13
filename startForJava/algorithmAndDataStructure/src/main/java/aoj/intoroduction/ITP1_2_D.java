package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_2_D {
//  public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Integer W = scan.nextInt();
    Integer H = scan.nextInt();
    Integer x = scan.nextInt();
    Integer y = scan.nextInt();
    Integer r = scan.nextInt();

    if (0 <= x + r && x + r <= W && x - r >= 0) {
      if (0 <= y + r && y + r <= H && y - r >= 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } else {
      System.out.println("No");
    }
    scan.close();
  }

}
