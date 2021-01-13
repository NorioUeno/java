package aoj.intoroduction;

import java.util.Scanner;

/**
 * Spreadsheet
 *
 * @author aa572057
 *
 */
public class ITP1_7_C {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int row = scan.nextInt();
    int column = scan.nextInt();
    int[][] inputArray = new int[row + 1][column + 1];

    for (int r = 0; r < row; r++) {
      for (int c = 0; c < column; c++) {
        inputArray[r][c] = scan.nextInt();
        inputArray[row][c] += inputArray[r][c];
        inputArray[r][column] += inputArray[r][c];
        inputArray[row][column] += inputArray[r][c];
      }
    }

    System.out.println("");

    for (int r = 0; r <= row; r++) {
      for (int c = 0; c <= column; c++) {
        if (c  == column && r  == row) {
          System.out.printf("%d", inputArray[r][c]);
        }else if (c  == column) {
          System.out.printf("%d\n", inputArray[r][c]);
        } else {
          System.out.printf("%d ", inputArray[r][c]);
        }
      }
    }
  }

}
