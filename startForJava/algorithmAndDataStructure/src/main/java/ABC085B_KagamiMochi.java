import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ABC085B_KagamiMochi {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] mochi = new int[N];
    for (int nCount = 0; nCount < N; nCount++) {
      mochi[nCount] = scan.nextInt();
    }

    System.out.printf("%d\n", getkagamiMochi(mochi));

  }

  public static int getkagamiMochi(int[] mochi) {
    Arrays.sort(mochi);
    int prev = 0;
    int stageNum = 0;
    for (int mochiCount = mochi.length - 1; mochiCount >= 0; mochiCount--) {
      if (prev == 0) {
        prev = mochi[mochiCount];
        stageNum++;
      } else if (prev == mochi[mochiCount]) {
        continue;
      } else if (prev > mochi[mochiCount]) {
        stageNum++;
        prev = mochi[mochiCount];
      } else {
        break;
      }
    }
    return stageNum;
  }

}
