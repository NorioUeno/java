package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class B_Minesweeper {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int W = scan.nextInt();
    String[][] Char = new String[H][W];
    for (int HCount = 0; HCount < H; HCount++) {
      Char[HCount][0] = scan.next();
      Char[HCount] = Char[HCount][0].split("");
    }

    for(String[] aa : Char ) {
      for(String bb : aa) {
        System.out.print(bb);
      }
      System.out.println();
    }

  }

}
