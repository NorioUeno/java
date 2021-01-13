package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Print a Frame
 *
 * @author aa572057
 *
 */
public class ITP1_5_B {
//public class Main {

  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    try {
      while ((line = br.readLine()) != null) {
        String[] length = line.split("[\\s]+");
        printReactangle(Integer.valueOf(length[0]), Integer.valueOf(length[1]));

      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

  private static void printReactangle(Integer height, Integer width) {

    if (height == 0 && width == 0) {

    } else {
      for (int heightNum = 0; heightNum < height; heightNum++) {
        for (int widthNum = 0; widthNum < width; widthNum++) {
          if (heightNum == 0 || heightNum == height - 1) {
            System.out.printf("#");
          } else {
            if (widthNum == 0 || widthNum == width -1) {
              System.out.printf("#");
            } else {
              System.out.printf(".");
            }
          }
        }
        System.out.printf("\n");
      }
      System.out.printf("\n");
    }
  }

}
