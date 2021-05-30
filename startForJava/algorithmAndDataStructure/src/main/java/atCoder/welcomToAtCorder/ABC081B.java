package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class ABC081B {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] array = new int[n];
    for (int nCount = 0; nCount < n; nCount++) {
      array[nCount] = scan.nextInt();
    }

    boolean isDivisible = true;
    int count = 0;
    loop : while (isDivisible) {
      int valueCount=0;
      for (int value : array) {
        if (value % 2 != 0) {
          isDivisible = false;
          break loop;
        } else {
          array[valueCount] = value/2;
        }
        valueCount++;
      }

      count++;
    }
    System.out.println(count);


  }

}
