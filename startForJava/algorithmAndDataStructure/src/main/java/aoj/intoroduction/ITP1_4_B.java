package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_4_B {
//  public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    double r = scan.nextDouble();

    double area = Math.pow(r, 2) * Math.PI;
    double circumference = 2 * r * Math.PI;

    System.out.printf("%.8f %.8f\n", area, circumference);
//    String.format(format, args)


  }

}
