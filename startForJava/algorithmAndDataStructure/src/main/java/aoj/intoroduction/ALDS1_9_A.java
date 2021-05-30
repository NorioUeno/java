package aoj.intoroduction;

import java.util.Scanner;

/**
 * Complete Binary Tree.
 *
 */
public class ALDS1_9_A {

  static int[] A; // comleteBinalyHeapTree

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    A = new int[H];
    for (int hCount = 0; hCount < H; hCount++) {
      A[hCount] = scan.nextInt();
    }

    for (int ACount = 0; ACount < A.length; ACount++) {
      printComleteBinalyHeapTree(A, ACount);
    }
  }

  private static void printComleteBinalyHeapTree(int[] A, int i) {
    int node;
    int key;
    int leftKey;
    int rightKey;
    int parentKey;
    StringBuilder sb = new StringBuilder();
    node = i + 1;
    sb.append("node " + node + ": ");

    key = A[i];
    sb.append("key = " + key + ", ");

    if (i != 0) {
      parentKey = (int) Math.floor((i + 1) / 2);
      sb.append("parent key = " + A[parentKey -1] + ", ");
    }

    leftKey = 2 * node;
    if (leftKey < A.length +1) {
      sb.append("left key = " + A[leftKey -1] + ", ");
    }

    rightKey = 2 * node + 1;
    if (rightKey < A.length +1) {
      sb.append("right key = " + A[rightKey -1] + ", ");
    }

    System.out.println(sb);
  }

}

