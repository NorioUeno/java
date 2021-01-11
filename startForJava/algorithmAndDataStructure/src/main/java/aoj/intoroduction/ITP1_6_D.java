package aoj.intoroduction;

import java.util.Scanner;

/**
 * Matrix Vector Multiplication
 *
 * @author aa572057
 *
 */
public class ITP1_6_D {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int[] product = new int[n];

    int[][] A = new int[n][m];
    int[] B = new int[m];

//    assign variable A from scan
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        A[i][j] = scan.nextInt();
      }
    }
//  assign variable B from scan
    for (int j = 0; j < m; j++) {
      B[j] = scan.nextInt();
    }
    scan.close();

    for (int i = 0; i < n; i++) {
//      System.out.printf("for i = %d\n",i);
      for (int j = 0; j < m; j++) {
        product[i] += (A[i][j] * B[j]);
//        System.out.printf(" product=%d A[i][j]=%d b[j]=%d \n",product[i],A[i][j] ,B[i] );
      }
    }
//
//    for (int[] a : A) {
//      for (int b : a) {
//        System.out.printf("%d", b);
//      }
//      System.out.printf("\n");
//    }
//    for (int a : B) {
//      System.out.printf("%d\n", a);
//    }
    for (int a : product) {
      System.out.printf("%d\n", a);
    }

  }
}