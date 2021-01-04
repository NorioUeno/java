package aoj.intoroduction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ITP1_2_C {
//  public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int[] init = { a, b, c };
    scan.close();
//    int[] init = { 211, 121, 23 };

//    System.out.print("init:" + init[0]);
//    System.out.print("," + init[1]);
//    System.out.print("," + init[2]);
//    System.out.println(",length:" + init.length);
//    System.out.println("-------");

    int[] sortAscending = new int[init.length];
    sortAscending = init.clone();

    for (int i = 0; i < init.length - 1; i++) {
//      System.out.println("vriable:" + i + ",value:" + init[i]);

      for (int l = 0; l < init.length - 1; l++) {
//        System.out.println(" vriable l:" + l);
        if (init[i] > sortAscending[l + 1]) {
          int temp = init[i];
          sortAscending[l] = sortAscending[l + 1];
          sortAscending[l + 1] = temp;
//          init[i] = init[i + 1];
//          init[i+1] = temp;
        }
//        System.out.print("  sortAscending:");
//        for (int k = 0; k < init.length; k++) {
//          System.out.print(sortAscending[k] + ",");
//        }
//        System.out.println("");

      }
//      System.out.println("===");
//      System.out.print("init:");
//      for (int j = 0; j < init.length; j++) {
//        System.out.print(init[j] + ",");
//      }
//      System.out.println("");
//      System.out.print("sortAscending:");
//      System.out.println("");
//      System.out.println("-------");
    }

    System.out.println(sortAscending[0] + " " + sortAscending[1] + " " + sortAscending[2]);
    System.out.println("-------");
  //昇順
    Arrays.sort(init);
    for (int j = 0; j < init.length; j++) {
      System.out.print(init[j] + ",");
    }
  //降順
    Integer[] init2 = { 1, 2, 3 };
    Arrays.sort(init2, Collections.reverseOrder());
    for (int j = 0; j < init2.length; j++) {
      System.out.print(init2[j] + ",");
    }
  }

}
