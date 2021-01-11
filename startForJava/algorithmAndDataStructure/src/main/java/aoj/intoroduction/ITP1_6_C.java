package aoj.intoroduction;

import java.util.Scanner;

/**
 * Official House
 *
 * @author aa572057
 *
 */
public class ITP1_6_C {
//public class Main {

  public static void main(String[] args) {

    int[][][] mgmtBuilldingStatus = new int[4][3][10];
//    mgmtBuilldingStatus = 0;
    String buildingSepareter = "####################";

    Scanner scan = new Scanner(System.in);
    int numberOfNotice = scan.nextInt();
    for(int inputNumber = 0; inputNumber < numberOfNotice ; inputNumber++) {
      int b = scan.nextInt();
      int f = scan.nextInt();
      int r = scan.nextInt();
      int v = scan.nextInt();
      mgmtBuilldingStatus[b-1][f-1][r-1] += v;
    }
    scan.close();



//      describe
    for (int building = 0; building < 4; building++) {
      for (int floor = 0; floor < 3; floor++) {
        for (int room = 0; room < 10; room++) {
          System.out.printf(" %d", mgmtBuilldingStatus[building][floor][room]);
        }
        System.out.printf("\n");
      }
      if (building != 3) {
        System.out.printf("%s\n", buildingSepareter);
      }

    }

  }

}
