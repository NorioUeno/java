package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_4_C {
//  public class Main {

  public static void main(String[] args) {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;
    try {
      while((line = br.readLine())!=null) {
        String[] inputData = line.split(" ");
        Integer a = Integer.valueOf(inputData[0]);
        String op = inputData[1];
        Integer b = Integer.valueOf(inputData[2]);

        if (op.equals("+")) {
          System.out.printf("%d\n", a + b);
        }
        if (op.equals("-")) {
          System.out.printf("%d\n", a - b);
        }
        if (op.equals("/")) {
          System.out.printf("%d\n", a / b);
        }
        if (op.equals("*")) {
          System.out.printf("%d\n", a * b);
        }
        if (op.equals("?")) {
          break;
//          System.out.printf("%d\n", a + b);
        }
      }

//    System.out.printf("%d %s %d\n", a, op, b);

    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
