package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_7_B {

  public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;

    try {
      while ((line = br.readLine()) != null) {

        String[] input = line.split("[\\s]+");
        Integer n = Integer.valueOf(input[0]);
        Integer x = Integer.valueOf(input[1]);
        if(n == 0 && x == 0) {
          break;
        }

        int wayCount = 0;
        for (int first = 1; first <= n - 2; first++) {
          for (int second = first + 1; second <= n - 1; second++) {
            for (int third = second + 1; third <= n; third++) {
              if (x == first + second + third) {
                wayCount += 1;
//                System.out.printf("count=%d sum=%d first=%d second=%d third=%d \n",wayCount, first + second + third, first, second, third);

                continue;
              }
            }
          }
        }
        System.out.printf("%d\n",wayCount);

      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
