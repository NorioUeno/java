package atCoder.kyopro90;

import java.util.Scanner;

public class CrossSum_004 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int W = scan.nextInt();
    int[] HSum = new int[H];
    int[] WSum = new int[W];
    int[][] A = new int[H][W];
    for(int HCount = 0; HCount < H; HCount++) {
      for(int WCount = 0; WCount < W; WCount++) {
        A[HCount][WCount] = scan.nextInt();
        HSum[HCount] += A[HCount][WCount];
        WSum[WCount] += A[HCount][WCount];
      }
    }

    int[][] Ans = new int[H][W];

    for(int HCount = 0; HCount < H; HCount++) {
      for(int WCount = 0; WCount < W; WCount++) {
//        System.out.printf("%d ",HSum[HCount] + WSum[WCount] -A[HCount][WCount]);
        Ans[HCount ][WCount ] = HSum[HCount] + WSum[WCount] -A[HCount][WCount];
      }
    }

    for(int[] h : Ans) {
      for(int w : h) {
        System.out.printf("%d ",w);
      }
      System.out.printf("\n");
    }





  }

}
