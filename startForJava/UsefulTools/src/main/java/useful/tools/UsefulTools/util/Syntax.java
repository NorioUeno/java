package useful.tools.UsefulTools.util;

import java.util.Arrays;
import java.util.Collections;

public class Syntax {

  public void array() {
    Integer[] array = new Integer[3];
    Integer[] array2 = { 21, 11, 232 };
    String[] stringArray = { "a", "b", "c" };

//  arraySort
//  昇順
    Arrays.sort(array2);
    for (int j = 0; j < array2.length; j++) {
      System.out.print(array2[j] + ",");
    }
//  降順
    Arrays.sort(array2, Collections.reverseOrder());
    for (int j = 0; j < array2.length; j++) {
      System.out.print(array2[j] + ",");
    }

  }

}
