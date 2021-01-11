package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Grading
 *
 * @author aa572057
 *
 */
public class ITP1_7_A {

  public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    try {
      while ((line = br.readLine()) != null) {
        String[] input = line.split("[\\s]+");
        int m = Integer.valueOf(input[0]);
        int f = Integer.valueOf(input[1]);
        int r = Integer.valueOf(input[2]);

        if (m == -1 && f == -1 && r == -1) {
//          System.out.printf("F\n");
          continue;
        }
//        evaluatino
        if (m == -1 || f == -1) {
          System.out.printf("F\n");
          continue;
        }
        if (m + f >= 80) {
          System.out.printf("A\n");
          continue;
        }
        if (m + f >= 65 && m + f < 80) {
          System.out.printf("B\n");
          continue;
        }
        if (m + f >= 50 && m + f < 65) {
          System.out.printf("C\n");
          continue;
        }
        if (m + f >= 30 && m + f < 50) {
          if (r >= 50) {
            System.out.printf("C\n");
            continue;
          }
          System.out.printf("D\n");
          continue;
        }
        if (m + f < 30) {
          System.out.printf("F\n");
          continue;
        }

//        System.out.printf("%d %d %d \n",m,f,r);

      }

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
