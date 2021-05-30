package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class C_GridRepainting_2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int W = scan.nextInt();
    String[][] Char = new String[H][W];

    for (int HCount = 0; HCount < H; HCount++) {
      Char[HCount][0] = scan.next();
      Char[HCount] = Char[HCount][0].split("");
    }

    for (int HCount = 0; HCount < H; HCount++) {
      for (int WCount = 0; WCount < W; WCount++) {
        if (Char[HCount][WCount].equals("#")) {
          if (!hasAjacentBlack(Char, HCount, WCount, H, W)) {
            System.out.println("No");
            return;
          }
        }
      }
    }
    System.out.println("Yes");
  }

  private static boolean hasAjacentBlack(String[][] c, int hCount, int wCount, int H, int W) {
    boolean hasAjacentBlack = true;
//    Left
    if (hCount - 1 >= 0) {
      if (c[hCount - 1][wCount].equals("#")) {
        return true;
      }
    }
//    right
    if (hCount + 1 < H) {
      if (c[hCount + 1][wCount].equals("#")) {
        return true;
      }
    }
//    top
    if (wCount - 1 >= 0 ) {
      if (c[hCount][wCount - 1].equals("#")) {
        return true;
      }
    }
//    bottom
    if (wCount + 1 < W) {
      if (c[hCount][wCount + 1].equals("#")) {
        return true;
      }
    }
    return false;

  }


}
