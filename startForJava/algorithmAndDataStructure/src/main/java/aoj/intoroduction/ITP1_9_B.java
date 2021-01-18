package aoj.intoroduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Shuffle
 *
 * @author aa572057
 *
 */
public class ITP1_9_B {
//  public class Main {

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String cardOrigirnal;
    ArrayList<String> shuffleedCardChar = new ArrayList<String>();
    ArrayList<String> tmp = new ArrayList<String>();
    int shuffledSize = 0; // as same as m in problem

    while (scan.hasNext()) {
      cardOrigirnal = scan.next();
      shuffleedCardChar.clear();
      tmp.clear();
      if(cardOrigirnal.equals("-")) {
        break;
      }
      for (String cardOrigirnalChar : cardOrigirnal.split("")) {
        shuffleedCardChar.add(cardOrigirnalChar);
        tmp.add(cardOrigirnalChar);
      }
//      shuffleedCardChar.forEach(System.out::print);
//      System.out.println("");
      shuffledSize = scan.nextInt();
      int cardLength = shuffleedCardChar.size();

//      shufflesdSize loop
      for (int shuffledNum = 0; shuffledNum < shuffledSize; shuffledNum++) {
        int shuffleWith = scan.nextInt();

//        bottom loop
        for (int bottomNum = 0; bottomNum < shuffleWith; bottomNum++) {
          tmp.set(shuffleedCardChar.size() - shuffleWith + bottomNum, shuffleedCardChar.get(bottomNum));
        }
//        tmp.forEach(System.out::print);
//        System.out.println(":bottomDone");
////        top loop
        for (int topNum = 0; topNum < cardLength - shuffleWith; topNum++) {
          tmp.set(topNum, shuffleedCardChar.get(topNum + shuffleWith));
        }
//        tmp.forEach(System.out::print);
//        System.out.println(":topDone--");
//        shuffleedCardChar = (ArrayList<String>) tmp.clone();
//        shuffleedCardChar.addAll(tmp);
        Collections.copy(shuffleedCardChar,tmp);

      }
      shuffleedCardChar.forEach(System.out::print);
      System.out.println("");
    }
  }
}
