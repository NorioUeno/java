package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_3_B {
//public class Main

  public static void main(String[] args) {

    // InputStreamReaderより
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      String line = br.readLine();
      String[] input = line.split(" ");
//      System.out.println("br:" + br.readLine());
      for (int i = 0; i < input.length; i++) {
        if (input[i].equals("0")) {
          continue;
        }
        System.out.printf("Case %d : %d \n", i + 1, Integer.valueOf(input[i]));
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
