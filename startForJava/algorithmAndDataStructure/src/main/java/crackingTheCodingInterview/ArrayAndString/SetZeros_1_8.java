package crackingTheCodingInterview.ArrayAndString;

import java.util.Arrays;

public class SetZeros_1_8 {

  public static void main(String[] args) {

    int[][] array = {{1, 232, 32, 44}, {3, 0, 22, 44}, {232, 21, 23, 0}};
    setZeros(array);
  }

  private static void setZeros(int[][] array) {
    boolean[] isZeroRow = new boolean[array.length];
    boolean[] isZeroColumn = new boolean[array[0].length];
    for (int row = 0; row < array.length; row++) {
      for (int column = 0; column < array[0].length; column++) {
        // System.out.printf("%d,",array[row][column]);
        if (array[row][column] == 0) {
          isZeroRow[row] = true;
          isZeroColumn[column] = true;
        }
      }
      // System.out.println();
    }

    for (int row = 0; row < array.length; row++) {
      if (isZeroRow[row]) {
        Arrays.fill(array[row], 0);
      }
    }


    // System.out.println( Arrays.toString(array));

    for (int column = 0; column < array[0].length; column++) {
      if (isZeroColumn[column]) {
        for(int row = 0; row < array.length; row++) {
          array[row][column] = 0;
        }
      }
    }

    for (int[] row : array) {
      for (int column : row) {
        System.out.printf("%d,", column);
      }
      System.out.println();
    }


  }



}
