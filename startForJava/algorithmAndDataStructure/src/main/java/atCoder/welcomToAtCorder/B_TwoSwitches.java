package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class B_TwoSwitches {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = scan.nextInt();

    if (A < D && C < B) {
      int start = Math.max(A, C);
      int end = Math.min(D, B);
      System.out.printf("%d\n",end - start);
    } else {
      System.out.printf("%d\n",0);
    }

  }

}
