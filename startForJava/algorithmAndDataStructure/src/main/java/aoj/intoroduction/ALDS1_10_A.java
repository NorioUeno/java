package aoj.intoroduction;

import java.util.Scanner;

/**
 * Fibonacci Number.
 *
 */
public class ALDS1_10_A {
  static int[] F = new int[45];

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println(fibonach(n));
  }

  private static int fibonach(int n) {
//    Arrays.fill(F, -1);

    if (n == 0 || n == 1) {
      return F[n] = 1;
//      return F[n];
    }
    if (F[n] != 0) {
      return F[n];
    }
    return F[n] = fibonach(n -2) + fibonach(n -1);
//    return F[n];
  }
}
