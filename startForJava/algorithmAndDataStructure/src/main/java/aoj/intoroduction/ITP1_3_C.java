package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class ITP1_3_C {
//  class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String line;
    Map<Integer, String[]> list = new HashMap<Integer, String[]>();
    Integer hashkey = 0;
    List<Integer> sortKey = new ArrayList<Integer>();

    try {
      while ((line = bf.readLine()) != null) {
        String[] set = line.split(" ");
        if (set[0].equals("0") && set[1].equals("0")) {
          break;
        }
        list.put(hashkey, set);
        sortKey.add(Integer.valueOf(set[0]));
        hashkey += 1;
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

    System.out.println("====");
    for (Integer inputSet : list.keySet()) {
      String input[] = list.get(inputSet);

      System.out.println("hashkey:" +sortKey[inputSet] );
      System.out.printf("%s %s %s \n", inputSet, input[0], input[1]);
//      System.out.printf("%s %s \n", inputSet[0], inputSet[1]);
    }


  }

  public static <T> void sort(List<T> sortKey) {

  }


}
