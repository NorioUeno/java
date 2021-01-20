package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_10_D {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int vectorsLength = scan.nextInt();
    double p1 = 0d;
    double p2 = 0d;
    double p3 = 0d;
    double pInfinity = 0d;
    int[] x = new int[vectorsLength];
    int[] y = new int[vectorsLength];

    for (int xNum = 0; xNum < vectorsLength; xNum++) {
      x[xNum] = scan.nextInt();
    }
    for (int yNum = 0; yNum < vectorsLength; yNum++) {
      y[yNum] = scan.nextInt();
    }

    for (int vectorsNum = 0; vectorsNum < vectorsLength; vectorsNum++) {
      p1 += Math.abs(x[vectorsNum] - y[vectorsNum]);
      p2 += Math.pow(Math.abs(x[vectorsNum] - y[vectorsNum]), 2);
      p3 += Math.pow(Math.abs(x[vectorsNum] - y[vectorsNum]), 3);
      pInfinity = Math.max(Math.abs(x[vectorsNum] - y[vectorsNum]), pInfinity);
    }

    System.out.printf("%.10f\n", p1);
    System.out.printf("%.10f\n", Math.sqrt(p2));
    System.out.printf("%.10f\n", Math.cbrt(p3));
    System.out.printf("%.10f\n", pInfinity);

  }

}
