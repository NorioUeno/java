package aoj.intoroduction;

import java.util.Arrays;
import java.util.Scanner;

public class ALDS1_4_B_3 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] S = new int[n];
    for(int nCount = 0; nCount < n ; nCount++) {
      S[nCount] = scan.nextInt();
    }
    int q = scan.nextInt();
    int[] T = new int[q];
    for(int qCount = 0; qCount < q ; qCount++) {
      T[qCount] = scan.nextInt();
    }
    Arrays.sort(T);
    Arrays.sort(S);
    int count = 0;

    for(int qCount = 0; qCount < q ; qCount++) {
      if (Arrays.binarySearch(S, T[qCount]) >= 0)
        count++;
    }

    System.out.println(count);




  }

}
