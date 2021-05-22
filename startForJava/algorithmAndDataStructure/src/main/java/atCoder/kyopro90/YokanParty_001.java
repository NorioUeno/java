package atCoder.kyopro90;

import java.util.Scanner;

public class YokanParty_001 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int L = scan.nextInt();
    int K = scan.nextInt();
    int[] A = new int[N];
    for (int nCount = 0; nCount < N; nCount++) {
      A[nCount] = scan.nextInt();
    }
    int score = 0;

    // 1.二分探索
//    分割可能か？ループじゃないやろ、再帰というか、二分探索なんでwhile
    for(int LCount = 0; LCount < L; LCount++) {
      int right = 0;
      int left =L;
    }
    for (int ACount = 0; ACount < N; ACount++) {

    }


  }

}
