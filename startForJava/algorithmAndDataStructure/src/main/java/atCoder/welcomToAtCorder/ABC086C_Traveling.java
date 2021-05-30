package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class ABC086C_Traveling {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] t = new int[N];
    int[] x = new int[N];
    int[] y = new int[N];
    for (int nCount = 0; nCount < N; nCount++) {
      t[nCount] = scan.nextInt();
      x[nCount] = scan.nextInt();
      y[nCount] = scan.nextInt();
    }

    boolean canBe = true;
    int distance = 0;
    int dimension = 0;
    for (int nCount = 0; nCount < N; nCount++) {
      if (nCount != 0) {
        dimension = Math.abs(t[nCount] - t[nCount - 1]);
        distance = Math.abs((x[nCount] - x[nCount - 1]) + (y[nCount] - y[nCount - 1]));
      } else {
        dimension = t[nCount];
        distance = Math.abs(x[nCount] + y[nCount]);
      }

      if (distance == dimension) {
        continue;
      } else if (distance < dimension) {
        if (distance % 2 == dimension % 2) {
          continue;
        } else {
          canBe = false;
        }
      } else {
        canBe = false;
      }
    }

    if (canBe)
      System.out.printf("Yes\n");
    else
      System.out.printf("No\n");



  }

}
