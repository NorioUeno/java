package aoj.intoroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Structured Programming
 * ナベアツ問題
 *
 * @author aa572057
 *
 */
public class ITP1_5_D {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Integer input = scan.nextInt();
    List<Integer> outputs = new ArrayList<Integer>();
    Integer tmp;

    for (int targetValue = 3; targetValue <= input; targetValue++) {
      if (targetValue % 3 == 0) {
        outputs.add(targetValue);
        continue;
      }
      tmp = targetValue;
      do {
//        System.out.println("targetvalue=" + targetValue + " tmp=" + tmp);
        if (tmp % 10 == 3) {
          outputs.add(targetValue);
          break;
        }
        tmp /= 10;
      } while (tmp != 0);
//      if ((targetValue/ 10) > 0) {
//        if ((targetValue / 10) % 3 == 0) {
//          outputs.add(targetValue);
//          continue;
//        }
//      }
//      if (targetValue % 10 == 3) {
//        outputs.add(targetValue);
//        continue;
//      }
    }

    for (Integer output : outputs) {
      System.out.printf(" %d", output);
    }
    System.out.println();

  }

}
