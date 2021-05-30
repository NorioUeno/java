package aoj.intoroduction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ALDS1_4_B_2 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] S = new int[n];
    for (int nCount = 0; nCount < n; nCount++) {
      S[nCount] = scan.nextInt();
    }
    int q = scan.nextInt();
    int[] T = new int[q];
    for (int qCount = 0; qCount < q; qCount++) {
      T[qCount] = scan.nextInt();
    }
    Arrays.sort(T);
    Arrays.sort(S);
    int count = 0;

    for (int qCount = 0; qCount < q; qCount++) {
      if (binarySearch(S, T[qCount]))
        count++;
    }
    System.out.printf("%d\n", count);
  }

  private static boolean binarySearch(int[] S, int i) {
    int left = 0;
    int right = S.length;
    int mid = 0;
    while (left <= right) {
      mid = (right + left) / 2;
      if(S.length <= mid) {
        return false;
      }
      else if (S[mid] == i) {
        return true;
      } else if (S[mid] < i) {
        left = mid + 1;
      } else {
        right = mid -1;
      }
    }

    return false;

  }

}
