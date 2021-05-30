package atCoder.edgingContest2021;

import java.util.Scanner;

public class A_threeDice {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    int reveseA = 7 - a;
    int reveseB = 7 - b;
    int reveseC = 7 - c;

    System.out.printf("%d\n", reveseA + reveseB + reveseC);

  }

}
