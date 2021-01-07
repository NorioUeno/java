package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_3_B {

  // public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      Scanner scan = new Scanner(System.in);
    int i = 1;
    int tmp;
    while ((tmp = Integer.valueOf(br.readLine())) != 0) {
//      while ((tmp = scan.nextInt()) != 0) {
      System.out.printf("Case %d: %d\n", i, tmp);
      i += 1;
    }
  }

}
