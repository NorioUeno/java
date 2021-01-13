package aoj.intoroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Finding Missing Cards
 * 1.差集合 ループで
 * 2.差集合 コレクションのmethodで
 *
 * @author aa572057
 *
 */
public class ITP1_6_B {
//  public class Main {

  public static void main(String[] args) {
    List<String> suits = new ArrayList<String>();
    suits.add("S"); // spead
    suits.add("H"); // heart
    suits.add("C"); // club
    suits.add("D"); // diamond
//    suits.forEach(System.out::println);
//    Map<String> cardFull = new HashMap<String>();
    List<String> cardFull = new ArrayList<String>();
    for (int suitsNum = 0; suitsNum < 4; suitsNum++) {
      for (int cardNum = 1; cardNum <= 13; cardNum++) {
        cardFull.add(String.join(" ", suits.get(suitsNum), String.valueOf(cardNum)));
//        System.out.printf("suits %s\n", suits.get(suitsNum));
      }
    }
//    cardFull.forEach(System.out::println);
//    System.out.printf("cardSize %s\n", cardFull.size());

    Scanner scan = new Scanner(System.in);
    Integer cardSize = scan.nextInt();
    List<String> inputCard = new ArrayList<String>();


    for (int cardNum = 0; cardNum < cardSize; cardNum++) {
      StringBuffer sb = new StringBuffer();
      sb.append(scan.next());
      sb.append(" ");
      sb.append(scan.next());
//      System.out.println(String.valueOf(sb));
      inputCard.add(String.valueOf(sb));
    }
//    inputCard.forEach(System.out::println);

    cardFull.removeAll(inputCard);
    cardFull.forEach(System.out::println);



  }

}
