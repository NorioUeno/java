package aoj.intoroduction;

import java.util.Scanner;

public class ITP1_11_A {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int dice[] = new int[6];
    for (int diceNum = 0; diceNum < 6; diceNum++) {
      dice[diceNum] = scan.nextInt();
    }
    String commands = scan.next();
    String[] command = commands.split("");
//    aaabbbbb


    for(String c : command) {
      switch (c) {
        case "S":
//          System.out.println("s");
          dice = s(dice);
          break;
        case "E":
//          System.out.println("e");
          dice = e(dice);
          break;
        case "W":
//        System.out.println("w");
          dice = w(dice);
          break;
        case "N":
//        System.out.println("n");
          dice = n(dice);
          break;
        default:
          break;
      }
//      System.out.println(dice[0]);
    }
    System.out.println(dice[0]);

  }

  public static int[] s(int[] dice) {
    int tmp[] = dice.clone();
    dice[0] = tmp[4];
    dice[1] = tmp[0];
    dice[2] = tmp[2];
    dice[3] = tmp[3];
    dice[4] = tmp[5];
    dice[5] = tmp[1];
    return dice;
  }

  public static int[] e(int[] dice) {
    int tmp[] = dice.clone();
    dice[0] = tmp[3];
    dice[1] = tmp[1];
    dice[2] = tmp[0];
    dice[3] = tmp[5];
    dice[4] = tmp[4];
    dice[5] = tmp[2];
    return dice;
  }
  public static int[] w(int[] dice) {
    int tmp[] = dice.clone();
    dice[0] = tmp[2];
    dice[1] = tmp[1];
    dice[2] = tmp[5];
    dice[3] = tmp[0];
    dice[4] = tmp[4];
    dice[5] = tmp[3];
    return dice;
  }
  public static int[] n(int[] dice) {
    int tmp[] = dice.clone();
    dice[0] = tmp[1];
    dice[1] = tmp[5];
    dice[2] = tmp[2];
    dice[3] = tmp[3];
    dice[4] = tmp[0];
    dice[5] = tmp[4];
    return dice;
  }

}
