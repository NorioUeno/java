package aoj.intoroduction;

import java.util.Scanner;

/**
 * BinarySearch 二分探索
 *
 * @author norioueno
 *
 */
public class ALDS1_4_B {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = 0;

    int n = scan.nextInt();
    int nNum = 0;
    int[] S = new int[n];
    while (nNum < n) {
      S[nNum] = scan.nextInt();
      nNum++;
    }

    int q = scan.nextInt();
    int qNum = 0;
    int[] T = new int[q];
    while (qNum < q) {
      T[qNum] = scan.nextInt();
      qNum++;
    }

    for (qNum = 0; qNum < q; qNum++) {
      count += binarySearch(S, T[qNum]);
    }
    System.out.println(count);
  }

  public static int binarySearch(int[] S, int key) {
    int left = 0;
    int right = S.length;
    int middle = 0;

    while (left < right) {
      middle = (right + left) / 2;
//      System.out.println("left:" + left + "right:" + right + "middle:" + middle + "key:" + key);
      if (key == S[middle]) {
        return 1;
      } else if (key < S[middle]) {
        right = middle;
      } else {
        left = middle + 1;
      }
    }
    return 0;
  }

}
