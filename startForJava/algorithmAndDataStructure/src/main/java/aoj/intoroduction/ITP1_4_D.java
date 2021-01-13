package aoj.intoroduction;

import java.util.Scanner;

/**
 * Min, Max and Sum
 * Write a program which reads a sequence of n integers ai(i=1,2,...n), and prints the minimum value, maximum value and sum of the sequence.
 *
 * @author aa572057
 *
 */
public class ITP1_4_D {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Integer aSize = scan.nextInt();
    Integer max = null;
    Integer min = null;
    long sum = 0;

    for (int aNum = 0; aNum < aSize; aNum++) {
      Integer[] a = new Integer[aSize];
      a[aNum] = scan.nextInt();
      if (aNum == 0) {
        max = a[aNum];
        min = a[aNum];
      } else {
        if (max < a[aNum]) {
          max = a[aNum];
        }
        if (min > a[aNum]) {
          min = a[aNum];
        }
      }
      sum += a[aNum];
    }

    System.out.printf("%d %d %d\n", min, max, sum);

  }

}
