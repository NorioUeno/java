package crackingTheCodingInterview.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class deleteDups_1 {
  static int[] array = {2, 22, 21, 33, 3};
  static int SENTINEL = 100000;

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<Integer>();
    list.add(2);
    list.add(30);
    list.add(1);
    list.add(10);
    list.add(2222);

    mergeSort(0, array.length);
    System.out.println(Arrays.toString(array));
  }

  private static void mergeSort(int left, int right) {
    int mid = (left + right) / 2;
    if (left + 1 < right) {
      mergeSort(left, mid);
      mergeSort(mid, right);
      merge(left, mid, right);
    }
  }

  private static void merge(int left, int mid, int right) {
    int[] leftArray = new int[SENTINEL];
    int[] rightArray = new int[SENTINEL];
    int leftC = mid - left;
    int rightC = right - mid;
    for (int i = 0; i < leftC; i++) {
      leftArray[i] = array[left + i];
    }
    for (int i = 0; i < rightC; i++) {
      rightArray[i] = array[mid + i];
    }
    int leftCount = 0;
    int rigthCount = 0;
    for(int k = left; k < right; k++) {
      if(leftArray[leftCount] < rightArray[rigthCount]) {
        array[k] = leftArray[leftCount++];
      } else {
        array[k] = rightArray[rigthCount++];
      }
    }

  }
}
