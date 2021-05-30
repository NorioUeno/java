package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class ABC085C_Otoshidama {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long Y = scan.nextLong();
    int satu[] = new int[3];
    satu[0] = 10000;
    satu[1] = 5000;
    satu[2] = 1000;

    boolean hasOtoshidama = false;
    int c = 0;
     loop : for (int xCount = 0; xCount <= N; xCount++) {
      for (int yCount = 0; yCount <= N; yCount++) {
        c = N - (xCount + yCount);
        if (c >= 0) {
          if ((c * satu[2]) == Y - ((satu[0] * xCount) + (satu[1] * yCount))) {
            hasOtoshidama = true;
            System.out.printf("%d %d %d\n", xCount, yCount, c);
            break loop;
          }
        }
      }
    }

    if (!hasOtoshidama) {
      System.out.printf("%d %d %d\n", -1, -1, -1);
    }

  }

}
