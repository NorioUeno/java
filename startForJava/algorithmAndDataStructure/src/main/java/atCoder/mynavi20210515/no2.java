package atCoder.mynavi20210515;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class no2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    Map<Integer, String> mountain = new HashMap<Integer, String>();
    int max = 0;
    int second = 0;
    int h = 0;
    String mountainName;
    Integer[] arrayHigh = new Integer[N];
    for (int nCount = 0; nCount < N; nCount++) {
      mountainName = scan.next();
      h = scan.nextInt();
      mountain.put(h, mountainName);
      arrayHigh[nCount] = h;

//      int tmp = max;
//      max = Math.max(max, h);
//      if (max != tmp) {
//        second = tmp;
//      } else if(second == 0 && max == tmp) {
//        second = h;
//      }
    }

    Arrays.sort(arrayHigh,Collections.reverseOrder());

    System.out.printf("%s\n", mountain.get(arrayHigh[1]));
//    System.out.printf("%s\n", mountain.get(arrayHigh[arrayHigh.length -2]));



  }

}
