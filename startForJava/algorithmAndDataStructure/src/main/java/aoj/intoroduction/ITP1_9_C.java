package aoj.intoroduction;

import java.util.Scanner;

/**
 * Card Game
 *
 * @author aa572057
 *
 */
public class ITP1_9_C {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int turns = scan.nextInt();
    int taroPoint = 0;
    int hanakoPoint = 0;

    for (int turnsNum = 0; turnsNum < turns; turnsNum++) {
      String taroCard = scan.next();
      String hanakoCard = scan.next();

      int cardLengthMax = Integer.max(taroCard.length(), hanakoCard.length());
//      System.out.printf("%s %s\n", taroCard, hanakoCard);

      for (int cardNum = 0; cardNum < cardLengthMax; cardNum++) {

        if (taroCard.charAt(cardNum) < hanakoCard.charAt(cardNum)) {
          hanakoPoint += 3;
//          System.out.printf("hanako win!\n");
          break;
        } else if (taroCard.charAt(cardNum) > hanakoCard.charAt(cardNum)) {
          taroPoint += 3;
//          System.out.printf("Taro win!\n");
          break;
        } else if (taroCard.charAt(cardNum) == hanakoCard.charAt(cardNum)) {

          if (cardNum == cardLengthMax - 1 && taroCard.length() == hanakoCard.length()) {
            hanakoPoint += 1;
            taroPoint += 1;
            break;
//          System.out.printf("same!\n");
          } else if (cardNum != cardLengthMax - 1 && taroCard.length() != hanakoCard.length()) {
            if (taroCard.length() - 1 == cardNum) {
              hanakoPoint += 3;
              break;
            } else if (hanakoCard.length() - 1 == cardNum) {
              taroPoint += 3;
              break;
            }
          }
        }
      }
//      System.out.printf("%d %d\n", taroPoint, hanakoPoint);
    }

    System.out.printf("%d %d\n", taroPoint, hanakoPoint);

  }

}
