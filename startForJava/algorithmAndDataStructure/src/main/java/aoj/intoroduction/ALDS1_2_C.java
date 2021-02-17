package aoj.intoroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Stable Sort.
 *
 * @author norioueno
 *
 */
public class ALDS1_2_C {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int inputLength = scan.nextInt();
    ArrayList<String> cards = new ArrayList<String>();
    for (int inputNum = 0; inputNum < inputLength; inputNum++) {
      cards.add(scan.next());
    }
    ArrayList<String> cardsOrigin = new ArrayList<String>(cards);
    bubbleSort(cards);
    stable(cards,cards);
    selectionSort(cardsOrigin);
    stable(cards,cardsOrigin);
  }


  public static void stable (List<String> compareFrom,List<String> compareTo) {
    if (compareFrom.equals(compareTo)) {
      System.out.println("Stable");
    } else {
      System.out.println("Not stable");
    }
  }

  public static void printCard(List<String> array) {
    for (int i = 0 ; i < array.size();i ++) {
      if (i == array.size() - 1) {
        System.out.printf("%s\n", array.get(i));
      } else {
        System.out.printf("%s ", array.get(i));
      }
    }
  }

  public static void selectionSort(List<String> array) {
    int minNum;
    boolean swap;
    String tmp;
    int swapCount = 0;
    for (int arrayNum = 0; arrayNum <= array.size(); arrayNum++) {
      minNum = arrayNum;
      swap = false;
      for (int arrayNumMin = arrayNum; arrayNumMin < array.size(); arrayNumMin++) {
        if (array.get(minNum).charAt(1) > array.get(arrayNumMin).charAt(1)) {
          minNum = arrayNumMin;
          swap = true;
        }
      }
      if (swap) {
        swapCount++;
        tmp = array.get(arrayNum);
        array.set(arrayNum, array.get(minNum));
        // array[arrayNum] = array[minNum];
        // array[minNum] = tmp;
        array.set(minNum, tmp);
//        printCard(array);
      }
    }
    printCard(array);
    // System.out.println(swapCount);;
  }

  public static void bubbleSort(List<String> array) {
    boolean status = true;
    String tmp;
    while (status) {
      status = false;
      for (int arrayNum = 0; arrayNum < array.size() - 1; arrayNum++) {
        if (array.get(arrayNum).charAt(1) > array.get(arrayNum + 1).charAt(1)) {
          tmp = array.get(arrayNum);
          array.set(arrayNum, array.get(arrayNum + 1));
          array.set(arrayNum + 1, tmp);
          status = true;
        }
//        printCard(array);
      }
    }
    printCard(array);
  }

}
