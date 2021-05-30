package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class B_Trained {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] botton = new int[N];
    boolean[] traceArray = new boolean[N];
    for (int nCount = 1; nCount <= N; nCount++) {
      botton[nCount - 1] = scan.nextInt();
    }
    // press botton
    int res = has2(botton, 1, 0, traceArray);
    System.out.printf("%d\n", res);



  }

  private static int has2(int[] botton, int key, int count, boolean[] traceArray) {
    count++;
    traceArray[key - 1] = true;
    if (botton[key - 1] == 2) {
      return count;
    } else if (!traceArray[botton[key - 1] -1 ]) {

      count = has2(botton, botton[key - 1], count, traceArray);
    } else {
      count = -1;
    }
    // return count;
    return count;

  }

}
