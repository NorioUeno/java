package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_3_D {
//  public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Integer a = scan.nextInt();
    Integer b = scan.nextInt();
    Integer c = scan.nextInt();
    scan.close();

    Integer divisors = 0;

    for (Integer divisorsCandidates = a; divisorsCandidates <= b; divisorsCandidates++) {
      if (c % divisorsCandidates == 0) {
        divisors += 1;
      }
    }
    System.out.println(divisors);

  }

}
