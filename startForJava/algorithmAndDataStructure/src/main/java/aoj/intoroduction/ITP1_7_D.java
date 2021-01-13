package aoj.intoroduction;

import java.util.Scanner;

/**
 * Matrix Multiplication
 *
 * @author aa572057
 *
 */
public class ITP1_7_D {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int l = scan.nextInt();

    int[][] A = new int[n][m];
    int[][] B = new int[m][l];
    long[][] product = new long[n][l];

//    assign variable A from scan
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        A[i][j] = scan.nextInt();
      }
    }
//  assign variable B from scan
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < l; j++) {
        B[i][j] = scan.nextInt();
      }
    }
    scan.close();

    for (int i = 0; i < n; i++) {
//      System.out.printf("for i = %d\n",i);
      for (int j = 0; j < m; j++) {
        for (int k = 0; k < l; k++) {
          product[i][k] += (A[i][j] * B[j][k]);
        }
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

    for (int productRow = 0; productRow < n; productRow++) {
      for (int productColmun = 0; productColmun < l; productColmun++) {
        if(productColmun == 0) {
          System.out.printf("%d", product[productRow][productColmun]);
        } else {
          System.out.printf(" %d", product[productRow][productColmun]);
        }
      }
      System.out.printf("\n");
    }

//    for (int[] a : product) {
//      for (int b : a) {
//        System.out.printf("%d ", b);
//      }
//      System.out.printf("\n");
//    }

  }

}
