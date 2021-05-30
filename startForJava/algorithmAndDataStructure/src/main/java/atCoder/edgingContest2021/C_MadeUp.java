package atCoder.edgingContest2021;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicColorChooserUI;

public class C_MadeUp {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];

    for (int nCount = 0; nCount < N; nCount++) {
      A[nCount] = scan.nextInt();
    }
    for (int nCount = 0; nCount < N; nCount++) {
      B[nCount] = scan.nextInt();
    }
    for (int nCount = 0; nCount < N; nCount++) {
      C[nCount] = scan.nextInt();
    }

    // Arrays.sort(B);
    // Arrays.sort(C);
    // int numOfB;
    int[] BCcount = new int[N];
    for (int nCount = 0; nCount < N; nCount++) {
      BCcount[B[C[nCount]-1]] += 1;
    }

    long ABCount = 0;
    for (int nCount = 0; nCount < N; nCount++) {
      ABCount += BCcount[A[nCount] ];
    }

  // if (Arrays.binarySearch(B, a) >= 0) {
  // if (Arrays.binarySearch(C, a) >= 0) {
  // numOfB = binarySearch(B, a);
  // if(numOfB >= 0) {
  // if(binarySearch(C, B[numOfB]) >= 0) {
  // count++;
  // }
  // }


  System.out.printf("%d\n",ABCount);

  }

  public static int binarySearch(int[] array, int key) {
    int left = 0;
    int right = array.length;
    int mid;
    while (left < right) {
      mid = (left + right) / 2;
      if (array[mid] == key) {
        return mid;
      } else if (array[mid] > key) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

}
