package aoj.intoroduction;

import java.util.Scanner;

/**
 * Merge Sort.
 *
 * @author norioueno
 *
 */
public class ALDS1_5_B {
  static int[] originalArray;
  static int[] sortedArray;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    originalArray = new int[n];
    sortedArray = new int[n];
    for (int nNum = 0; nNum < n; nNum++) {
      originalArray[nNum] = scan.nextInt();
    }
    divide(0, originalArray.length);
    for (int a : sortedArray) {
      System.out.printf("%d ", a);
    }
    // solve
    // conquer
  }

  public static void divide(int begin, int end) {
    if (begin +1 < end) {
      solve(begin, end);
      return;
    }
//    System.out.println("left begin:" + begin + " end:" + end);
    int middle = (begin + end) / 2;
    divide(begin, middle);
    divide(middle, end);
  }

  public static void solve(int begin, int end) {
    int tmp;
    if (originalArray[begin] > originalArray[end-1]) {
      System.out.println("sortleft begin:" + begin + " end:" + end);
      sortedArray[end - 1] = originalArray[begin];
      sortedArray[begin] = originalArray[end - 1];
    } else {
      System.out.println("right begin:" + begin + " end:" + end);
      sortedArray[begin] = originalArray[begin];
      sortedArray[end - 1] = originalArray[end - 1];
    }
  }
}
