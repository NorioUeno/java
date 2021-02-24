package aoj.intoroduction;

import java.util.Scanner;

/**
 * @author norioueno
 *
 */
public class ALDS1_4_A {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int nNum = 0;
    int[] S = new int[n];
    while (nNum < n) {
      S[nNum] = scan.nextInt();
      nNum++;
    }
    int count = 0;

    int q = scan.nextInt();
    int qNum = 0;
    int[] T = new int[q];
    while (qNum < q) {
      T[qNum] = scan.nextInt();
      qNum++;
    }

    int linearSearchNum = 0;
    for (qNum = 0; qNum < q; qNum++) {
      while (S[linearSearchNum] != T[qNum]) {
        linearSearchNum++;
        if (linearSearchNum == n - 1) {
          break;
        }
      }
      if (linearSearchNum != n - 1) {
        count++;
      }
      linearSearchNum = 0;
    }
    System.out.println(count);

  }

}
