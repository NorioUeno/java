package atCoder.mynavi20210515;

import java.util.Arrays;
import java.util.Scanner;

public class no3_SecretNumber {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String[] charS = S.split("");

    int secretCount = 0;
    boolean[] secretBoolean = new boolean[10];
    for (int secretNum = 0; secretNum < 10000; secretNum++) {
      Arrays.fill(secretBoolean, false);
      int secret = 10000 + secretNum;
      // System.out.printf("%d %s \n", secret, String.valueOf(secret).substring(0, 1));
      // System.out.printf("%d %s \n", secret, String.valueOf(secret).substring(1, 2));
      // System.out.printf("%d %s \n", secret, String.valueOf(secret).substring(2, 3));
      // System.out.printf("%d %s \n", secret, String.valueOf(secret).substring(3, 4));
      // System.out.printf("%d %s \n", secret, String.valueOf(secret).substring(4, 5));
      // System.out.printf("%d %s \n",secret, String.valueOf(secret).charAt(5));
      secretBoolean[Integer.parseInt(String.valueOf(secret).substring(1, 2))] = true;
      secretBoolean[Integer.parseInt(String.valueOf(secret).substring(2, 3))] = true;
      secretBoolean[Integer.parseInt(String.valueOf(secret).substring(3, 4))] = true;
      secretBoolean[Integer.parseInt(String.valueOf(secret).substring(4, 5))] = true;

      boolean isSecret = true;
      for (int sCount = 0; sCount < 10; sCount++) {
        if (charS[sCount].equals("o") && (secretBoolean[sCount])) {
          isSecret = true;
        } else if (charS[sCount].equals("?")) {
        } else if (charS[sCount].equals("x") && (!secretBoolean[sCount])) {
          isSecret = true;
        } else {
          isSecret = false;
          break;
        }
      }
      if (isSecret) {
        secretCount++;
      }
//      System.out.printf("%d %s\n",secret,isSecret);
    }

    System.out.printf("%d\n",secretCount);
    // for (boolean a : secretBoolean) {
    // System.out.println(a);
    // }
    //
    // for (String cS : charS) {
    // System.out.printf("%s \n", cS);
    // }
    //
    //
    // int i = 1000;
    // System.out.printf("%d %.0f \n", i /= 10, Math.pow(3, 4));
  }

}
