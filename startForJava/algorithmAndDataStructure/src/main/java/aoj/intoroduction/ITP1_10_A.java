package aoj.intoroduction;

import java.util.Scanner;

/**
 * Distance.
 *
 * @author aa572057
 *
 */
public class ITP1_10_A {

  /** Main.
   * aaa
   * @param args aaa
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double x1 = scan.nextDouble();
    double y1 = scan.nextDouble();

    double x2 = scan.nextDouble();
    double y2 = scan.nextDouble();

    double sidex = Math.abs(x2 - x1);
    double sidey = Math.abs(y2 - y1);

    double ans = Math.sqrt(Math.pow(sidex, 2d) + Math.pow(sidey, 2d));

    System.out.printf("%.8f\n",ans);

  }
}
