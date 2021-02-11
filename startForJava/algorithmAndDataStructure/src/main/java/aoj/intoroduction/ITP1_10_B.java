package aoj.intoroduction;

import java.util.Scanner;

/**
 * Triangle
 * 三角関数
 *
 * @author aa572057
 *
 */
public class ITP1_10_B {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    double sidea = scan.nextDouble();
    double sideb = scan.nextDouble();
    double angle = scan.nextDouble();
    double angleRadian = angle * (Math.PI / 180);

    double area = sidea * sideb * Math.sin(angleRadian) * 0.5;
    double length = sidea + sideb + Math.sqrt(Math.pow(sidea, 2) + Math.pow(sideb, 2) - (2d * sidea * sideb * Math.cos(angleRadian)));
    double hight = sideb * Math.sin(angleRadian);

    System.out.printf("%.10f\n", area);
    System.out.printf("%.10f\n", length);
    System.out.printf("%.10f\n", hight);

  }

}
