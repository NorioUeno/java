package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_4_A {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Integer a = scan.nextInt();
    Integer b = scan.nextInt();

    Integer d = a / b;
    Integer r = a % b;
    double f = (double) a / (double) b;
    float f2 = (float) a / (float) b;

//    少数の計算及び表示
//    System.out.printf("%d %d %f %5.2f \n", d, r, f, f);
//    System.out.printf("%d %d %.8f %.8f \n", d, r, f,f2);
    System.out.printf("%d %d %.8f\n", d, r, f,f2);

  }

}
