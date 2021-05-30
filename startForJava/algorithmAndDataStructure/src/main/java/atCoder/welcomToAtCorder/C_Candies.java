package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class C_Candies implements Runnable {

  // public static void main(String[] args) {
  // new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
  // }
  // public void run() {

  public static void main(String[] args) {
    new Thread(null, new C_Candies(), "", 16 * 1024 * 1024).start(); // 16MBスタックを確保して実行
  }

  public void run() {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[][] grid = new int[2][N];
    for (int rCount = 0; rCount < 2; rCount++) {
      for (int nCount = 0; nCount < N; nCount++) {
        grid[rCount][nCount] = scan.nextInt();
      }
    }

    int route = getRoute(grid, 0);

    int sumCandies = 0;
    // top
    for (int nCount = 0; nCount <= route; nCount++) {

      sumCandies += grid[0][nCount];
      // System.out.printf("%d %d\n", grid[0][nCount], sumCandies);

    }
    // bottom
    for (int nCount = route; nCount < N; nCount++) {
      sumCandies += grid[1][nCount];
      // System.out.printf("%d %d\n", grid[1][nCount], sumCandies);
    }

    System.out.printf("%d\n", sumCandies);

  }


  private static int getRoute(int[][] grid, int from) {
    int maxColumn, topRowSum, bottomRowSum;
    // int route
    // find max in top line
    if (from + 1 < grid[0].length) {
      maxColumn = findMax(grid[0], from + 1);
      topRowSum = sumRow(grid[0], from + 1, maxColumn);
      bottomRowSum = sumRow(grid[1], from, maxColumn - 1);
      if (topRowSum >= bottomRowSum) {
        from = getRoute(grid, maxColumn);
      } else {
        return from;
      }
    }
    return from;
  }

  private static int sumRow(int[] gridRow, int from, int to) {
    int sum = 0;
    for (int i = from; i <= to; i++) {
      sum += gridRow[i];
    }

    return sum;
  }

  private static int findMax(int[] gridRow, int from) {
    int max = gridRow[from];
    int maxColumn = from;
    for (int i = from + 1; i < gridRow.length; i++) {
      if (max < gridRow[i]) {
        max = gridRow[i];
        maxColumn = i;
      }
    }
    return maxColumn;
  }

}
