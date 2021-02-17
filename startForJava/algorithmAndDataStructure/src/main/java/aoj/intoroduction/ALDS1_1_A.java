package aoj.intoroduction;

import java.util.Scanner;

/**
 * @author norioueno
 *
 */
public class ALDS1_1_A {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int arraylength = scan.nextInt();
    int[] array = new int[arraylength];

    for (int arrayNum = 0; arrayNum < arraylength; arrayNum++) {
      array[arrayNum] = scan.nextInt();
    }
    int[] sortArray = array.clone();
    insertionSort(sortArray);
  }

  public static int[] insertionSort(int[] array) {

    // int[] sortArray = array.clone();
    int key;
    int tmp;

    for (int arrayNum = 0; arrayNum < array.length; arrayNum++) {
      key = array[arrayNum];
      for (int compareNum = arrayNum - 1; compareNum >= 0
          && array[compareNum] > key; compareNum--) {
        tmp = array[compareNum + 1];
        array[compareNum + 1] = array[compareNum];
        array[compareNum] = tmp;
      }
      // key = array[compareNum + 1];
      printArray(array);
    }
    return null;
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i == array.length - 1) {
        System.out.printf("%d\n", array[i]);
      } else {
        System.out.printf("%d ", array[i]);
      }
    }
  }

}
