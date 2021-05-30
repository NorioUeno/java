package atCoder.mynavi20210515;

import java.util.Scanner;

public class no01 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float[] a = new float[3];
    for (int aCount = 0; aCount < 3; aCount++) {
      a[aCount] = scan.nextFloat();
    }
    float[][] subtraction = new float[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        subtraction[i][j] = a[i] - a[j];
      }
    }

    if(subtraction[0][1] == subtraction[1][2]) {
      System.out.println("Yes");
    }
    else if(subtraction[0][2] == subtraction[2][1]) {
      System.out.println("Yes");
    }
    else if(subtraction[1][0] == subtraction[0][2]) {
      System.out.println("Yes");
    }
    else if(subtraction[1][2] == subtraction[2][0]) {
      System.out.println("Yes");
    }
    else if(subtraction[2][0] == subtraction[0][1]) {
      System.out.println("Yes");
    }
    else if(subtraction[2][1] == subtraction[1][0]) {
      System.out.println("Yes");
    }

    else {
      System.out.println("No");
    }
  }

}
