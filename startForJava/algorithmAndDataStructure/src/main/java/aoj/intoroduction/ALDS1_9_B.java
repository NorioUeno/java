package aoj.intoroduction;

import java.util.Scanner;

/**
 * Maximum Heap.
 */
public class ALDS1_9_B {

  static int[] A; // comleteBinalyHeapTree

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    A = new int[H];
    for (int hCount = 0; hCount < H; hCount++) {
      A[hCount] = scan.nextInt();
    }

    // buildMaxHeap
    for (int aCount = (A.length + 1) / 2; aCount > 0; aCount--) {
      maxHeapify(aCount);
    }
    // System.out.println(Arrays.toString(A));
    StringBuilder sb = new StringBuilder();
    for (int i : A) {
//      System.out.printf(" %d", i);
      sb.append(" " + i);
    }
    System.out.println(sb);
  }

  private static void maxHeapify(int i) {
    int l = left(i);
    int r = right(i);
    int largest = i;
    if (l != -1) {
      if (A[l - 1] > A[i - 1] && A[l - 1] > A[largest-1]) {
        largest = l;
      }
    }
    if (r != -1) {
      if (A[r - 1] > A[i - 1] && A[r - 1] > A[largest-1]) {
        largest = r;
      }
    }
    if (largest != i) {
      swap(i, largest);
      maxHeapify(largest);
    }
  }

  private static void swap(int i, int largest) {
    int tmp = A[i - 1];
    A[i - 1] = A[largest - 1];
    A[largest - 1] = tmp;
  }

  private static int right(int i) {
    int node;
    int rightKey;
    node = i;

    rightKey = 2 * node + 1;
    if (rightKey < A.length + 1) {
      // return A[rightKey - 1];
      return rightKey;
    } else {
      return -1;
    }
  }

  private static int left(int i) {
    int node;
    int leftKey;

    node = i;
    leftKey = 2 * node;
    if (leftKey < A.length + 1) {
      // return A[leftKey - 1];
      return leftKey;
    } else {
      return -1;
    }
  }

}
