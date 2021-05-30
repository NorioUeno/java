package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class B_TrainingCamp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long power = 1;

    for(int nCount = 1 ; nCount <= N; nCount++) {
      power = (power * nCount) % 1000000007;
//      power = Math(power, nCount) % 1000000007;
    }
    System.out.printf("%d\n",power);


  }

}
