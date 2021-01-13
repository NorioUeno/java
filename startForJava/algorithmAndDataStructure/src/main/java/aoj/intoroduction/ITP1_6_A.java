package aoj.intoroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Reversing Numbers
 *
 * @author aa572057
 *
 */
public class ITP1_6_A {
//  public class Main{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int arraySize = scan.nextInt();
    List<Integer> inputArray = new ArrayList<Integer>();
    for (int arrayNum = 0; arrayNum < arraySize; arrayNum++) {
      inputArray.add(scan.nextInt());
    }
    scan.close();
    reverseSort(inputArray);

//    describe
    for (int arrayNum = 0; arrayNum < arraySize; arrayNum++) {

      if(arrayNum == arraySize -1) {
        System.out.printf("%d", inputArray.get(arrayNum));
      }else {
        System.out.printf("%d ", inputArray.get(arrayNum));
      }
    }

//    System.out.printf("========\n");
//    for (Integer i : inputArray) {
//      System.out.printf("%d ", i);
//    }


  }

  public static void reverseSort(List<Integer> array) {

    boolean judge = true;
    while (judge) {
      judge = false;

      for (int arrayNum = 0; arrayNum < array.size() - 1; arrayNum++) {
        if (array.get(arrayNum) < array.get(arrayNum + 1)) {
          int tmp = array.get(arrayNum);
          array.set(arrayNum, array.get(arrayNum + 1));
          array.set(arrayNum + 1, tmp);
          judge = true;
        }
      }
    }
//    return array;

  }

}
