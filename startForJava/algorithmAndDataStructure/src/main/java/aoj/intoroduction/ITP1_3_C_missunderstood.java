package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ITP1_3_C_missunderstood {
//  class Main {

  public static void main(String[] args) {

//    Scanner scan = new Scanner(System.in);
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String line;
    Map<Integer, Integer> list = new HashMap<Integer, Integer>();
    List<Integer> sortKey = new ArrayList<Integer>();

    try {
      while ((line = bf.readLine()) != null) {
        String[] set = line.split(" ");
        if (set[0].equals("0") && set[1].equals("0")) {
          break;
        }
        list.put(Integer.valueOf(set[0]),Integer.valueOf(set[1]));
        sortKey.add(Integer.valueOf(set[0]));
//        System.out.print(hashkey + ":" + Integer.valueOf(set[0]));
//        System.out.println(hashkey + ":" + Integer.valueOf(set[1]));
//        System.out.print(hashkey + ":" + set[0]);
//        System.out.println(hashkey + ":" + set[1]);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    sort(sortKey);
//    System.out.println("Sort:" + sortKey.get(0));

//    System.out.println("====");
    for (Integer inputSet : sortKey) {
//      String input[] = list.get(inputSet);
//      System.out.println("hashkey:" + sortKey[inputSet]);
      System.out.printf("%s %s \n", inputSet, list.get(inputSet));
//      System.out.printf("%s %s \n", inputSet[0], inputSet[1]);
    }
  }

  /**
   * バブルソート
   *
   * @param ArrayList<T>
   * @param sortKey
   */
  public static List<Integer> sort(List<Integer> sortKey) {
//    System.out.println("-- befere sort --");
//    System.out.println(sortKey.get(0));
//    System.out.println(sortKey.get(1));
//    System.out.println(sortKey.get(2));
//    System.out.println(sortKey.size());
    Boolean sortJudge = true;
    while (sortJudge) {
      sortJudge = false;
//      System.out.println("-- process sort");
      for (int arrayIndex = 0; arrayIndex < sortKey.size() - 1; arrayIndex++) {
//        System.out.println("0:" + sortKey.get(arrayIndex) );
//        System.out.println("1:" + sortKey.get(arrayIndex+1) );
        if (sortKey.get(arrayIndex) > sortKey.get(arrayIndex + 1)) {
          Integer tmp = sortKey.get(arrayIndex);
          sortKey.set(arrayIndex, sortKey.get(arrayIndex + 1));
          sortKey.set(arrayIndex + 1, tmp);
          sortJudge = true;
        }
      }
    }
//    System.out.println("-- after sort --");
//    System.out.println(sortKey.get(0));
//    System.out.println(sortKey.get(1));
//    System.out.println(sortKey.get(2));
    return sortKey;

  }

}
