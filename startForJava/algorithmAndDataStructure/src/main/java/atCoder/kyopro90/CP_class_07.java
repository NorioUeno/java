package atCoder.kyopro90;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CP_class_07 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    List<Integer> A = new ArrayList<Integer>();
    for (int nCount = 0; nCount < N; nCount++) {
      A.add(scan.nextInt());
    }
    int Q = scan.nextInt();
    ArrayList<Integer> B = new ArrayList<Integer>();
    for (int qCount = 0; qCount < Q; qCount++) {
      B.add(scan.nextInt());
    }
    ArrayList<Integer> Boriginal = new ArrayList<Integer>(B);
    Collections.sort(A);
    // Collections.sort(B);

    Integer[] complainOfB = new Integer[Q];
    for (Integer b : B) {
      complainOfB[B.indexOf(b)] = Math.abs(binarySearch(b, A) - b);
    }
    int sum = 0;
    int cCount = 0;
    for (int c : complainOfB) {
      System.out.printf("%d\n", c, B.get(cCount));
      cCount++;
    }
  }

  private static Integer binarySearch(Integer b, List<Integer> A) {
    Integer left = 0;
    Integer right = A.size();
    Integer mid = 0;
    while (right > left ) {
      mid = (left + right) / 2;
      if (b.equals(A.get(mid))) {
        return b;
      } else if (b > A.get(mid)) {
        left = mid + 1 ;
      } else {
        right = mid;
      }
    }

    if (mid - 1 < 0) {
      return A.get(0);
    } else if (b.equals(A.get(mid)) || b.equals(A.get(mid - 1))) {
      return b;
    } else if (A.get(mid + 1) -b < b - A.get(mid)) {
      return A.get(mid + 1 );
    } else if (b - A.get(mid - 1) > A.get(mid) - b) {
      return A.get(mid);
    } else {
      return A.get(mid - 1);
    }

    // System.out.printf("A : %d, mid %d, b %d\n", A.get(mid), mid, b);

    // return A.get(mid - 1 < 0 ? 0 : mid - 1);
  }

}
