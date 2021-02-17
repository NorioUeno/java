package aoj.intoroduction;

import java.util.Scanner;

/**
 * dice 2.
 *
 * @author aa572057
 *
 */
public class ITP1_11_B {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int dice[] = new int[6];
    for (int diceNum = 0; diceNum < 6; diceNum++) {
      dice[diceNum] = scan.nextInt();
    }
    String rollingPattern = "SSSSWSSSWSSSESSSESSSWSSS";
//    String rollingPattern = "NNNNWNNNWNNNENNNENNNWNNN";
    int[] diceOrg = dice.clone();
    int q = scan.nextInt();
    for (int qNum = 0; qNum < q; qNum++) {
      int topFig = scan.nextInt();
      int frontFig = scan.nextInt();
//       System.out.println("Start topFig:" + topFig + " frontFig " + frontFig );
      // String rolling;
      for (int rollingPatternLength = 0; rollingPatternLength < rollingPattern
          .length(); rollingPatternLength++) {
        // System.out.println("rollingPatternLength :" + rollingPatternLength);
        // System.out.println(rollingPattern.charAt(rollingPatternLength));
        switch (String.valueOf(rollingPattern.charAt(rollingPatternLength))) {
          case "S":
            dice = s(dice);
//            printDice("S", dice);
            break;
          case "E":
            dice = e(dice);
//            printDice("E", dice);
            break;
          case "W":
            dice = w(dice);
//            printDice("W", dice);
            break;
          case "N":
            dice = n(dice);
//            printDice("N", dice);
            break;
          default:
            break;
        }
        if (dice[0] == topFig && dice[1] == frontFig) {
          System.out.println(dice[2]);
          dice = diceOrg.clone();
          break;
        }

      }
    }
  }

  public static void printDice(String rolling, int[] dice) {
    System.out.print(rolling + ":");
    for (int diceNum : dice) {
      System.out.print(diceNum);
    }
    System.out.println();
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

  // innner classテスト ロジックには関係なし
  static class Dice {
    int[] num;

    Dice() {
      num = new int[6];
    }

    public int[] setGetNum(int figiure0, int figiure1, int figiure2, int figiure3, int figiure4,
        int figiure5) {
      String variable = "figiure";
      for (int diceNum = 0; diceNum < 6; diceNum++) {
        num[diceNum] = figiure1;
      }
      return num;
    }

  }
}
