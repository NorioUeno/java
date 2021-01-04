package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_1_C {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int length = scan.nextInt();
    int breadth = scan.nextInt();

    int area = length * breadth;
    int perimeter = (length + breadth) * 2;

    System.out.println(area + " " + perimeter);
  }

}
