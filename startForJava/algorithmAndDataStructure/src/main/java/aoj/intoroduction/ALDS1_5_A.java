package aoj.intoroduction;

import java.util.Scanner;

/**
 * Exhaustive Search
 *
 * @author norioueno
 *
 */
public class ALDS1_5_A {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] A = new int[n];
    for (int nNum = 0; nNum < n; nNum++) {
      A[nNum] = scan.nextInt();
//      System.out.println("n");
    }
    int q = scan.nextInt();
    int[] M = new int[q];

    for (int qNum = 0; qNum < q; qNum++) {
//      System.out.println("q");
      if (solve(0, scan.nextInt(), A)) {
        // if (solve(0, M[qNum], A)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }

  /**
   * @return
   */
  public static boolean solve(int i, int m, int[] A) {
//    System.out.println("i:" + i + " m:" + m + " int[] A:" + A[i]);
    if (m == 0)
      return true;
    if (i >= A.length)
      return false;
    return solve(i + 1, m, A) || solve(i + 1, m - A[i], A);
  }
}
