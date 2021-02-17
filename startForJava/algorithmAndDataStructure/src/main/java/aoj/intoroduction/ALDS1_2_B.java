package aoj.intoroduction;

import java.util.Scanner;

public class ALDS1_2_B {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int arraylength = scan.nextInt();
    int[] array = new int[arraylength];

    for (int arrayNum = 0; arrayNum < arraylength; arrayNum++) {
      array[arrayNum] = scan.nextInt();
    }

    selectionSort(array);

  }

  public static void selectionSort(int[] array) {
    int minNum;
    boolean swap;
    int tmp;
    int swapCount = 0;
    for (int arrayNum = 0; arrayNum <= array.length; arrayNum++) {
      minNum = arrayNum;
      swap = false;
      for (int arrayNumMin = arrayNum; arrayNumMin < array.length; arrayNumMin++) {
        if (array[minNum] > array[arrayNumMin]) {
          minNum = arrayNumMin;
          swap = true;
        }
      }
      if (swap) {
        swapCount++;
        tmp = array[arrayNum];
        array[arrayNum] = array[minNum];
        array[minNum] = tmp;
//        printArray(array);
      }
    }
    printArray(array);
    System.out.println(swapCount);;
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
