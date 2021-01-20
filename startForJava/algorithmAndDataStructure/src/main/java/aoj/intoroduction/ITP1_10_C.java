package aoj.intoroduction;

import java.util.Arrays;
import java.util.Scanner;

public class ITP1_10_C {
//  public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    while (scan.hasNext()) {
      int n = scan.nextInt();
      if (n == 0) {
        break;
      }
//      Integer[] examinations = new Integer[n];
      int[] examinations = new int[n];
      for (int nNum = 0; nNum < n; nNum++) {
        examinations[nNum] = scan.nextInt();
      }
//      streamAPI(Java8より)を用いた合計の算出 プリミティブ
//      Arrays.stream(examinations).sum();

//    streanAPIを用いた合計算出 integer
//      int sum = Arrays.stream(examinations).mapToInt(Integer::intValue).sum();
      double average = Arrays.stream(examinations).average().orElse(Double.NaN);
      double deviation = 0d;
//      System.out.println(average);
      for(int nNum = 0; nNum < n; nNum++) {
        deviation  += Math.pow((examinations[nNum] - average),2);
      }

      deviation /= n;
      System.out.printf("%.10f\n",Math.sqrt(deviation));
    }

  }

}
