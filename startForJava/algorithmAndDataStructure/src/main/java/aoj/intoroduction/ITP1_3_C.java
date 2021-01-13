package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_3_C {
//public class Main {

  public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;

    try {
      while ((line = br.readLine()) != null) {
        String[] inputSet = line.split(" ");
        if (inputSet[0].equals("0") && inputSet[1].equals("0")) {
          break;
        }
        if (Integer.valueOf(inputSet[0]) < Integer.valueOf(inputSet[1])) {
          System.out.printf("%s %s\n", inputSet[0], inputSet[1]);
        } else {
          System.out.printf("%s %s\n", inputSet[1], inputSet[0]);
//          outputArrayList.put(inputSet[1], inputSet[0]);
        }
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }


  }

}
