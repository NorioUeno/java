package aoj.intoroduction;

import java.util.Scanner;

/**
 * Priority Queue.
 */
public class ALDS1_9_C {

  static int[] A = new int[100000];
  static int H = -1;

  public static void main(String[] args) {
    int key;
    Scanner scan = new Scanner(System.in);
    while (scan.hasNext()) {
      switch (scan.next()) {
        case "insert":
          key = scan.nextInt();
          insert(key);
          break;
        case "extract":
          System.out.println(heapExtract() + " H:" +H);
          break;
        case "end":
          break;
      }
    }
  }

  private static int heapExtract() {
    if(H < 0) {
      System.err.println("heap underFlow");
    }
    int max = A[0];
//    if()
    A[0] = A[H];
    H--;
    maxHeapify(1);
    return max;
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


  private static void insert(int key) {
    H++;
    A[H] = -100000;
    System.out.println("key" + key + " insert H:" +H);
    heapIncreaseKey(key);
  }

  private static void heapIncreaseKey(int key) {
    if (key < A[H]) {
      System.err.println("error");
    }
    A[H] = key;
    if (parent(H) != -1) {
      while (H > 0 && A[parent(H)] < A[H]) {
        swap(H,parent(H));
        H = parent(H);
      }
    }
  }
  private static void swap(int i, int largest) {
    int tmp = A[i];
    A[i] = A[largest];
    A[largest] = tmp;
  }

  private static int parent(int i) {
    int parentKey;
    if (i != 0) {
      parentKey = (int) Math.floor((i + 1) / 2);
      return parentKey -1;
    } else {
      return -1;
    }
  }
}
