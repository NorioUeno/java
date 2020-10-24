package practice.training.no19_1FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  private static List<String> list;

  public static List<String> createFizzBuzzList(int limit) {

    list = new ArrayList<String>();

    for (int i = 1; i <= limit; i++) {

      if (i % 3 == 0 && i % 5 == 0) {
        list.add("FizzBuzz");
      } else {
        if (0 == i % 3) {
          list.add("Fizz");
        } else if (0 == i % 5) {
          list.add("Buzz");
        } else {
          list.add(Integer.toString(i)); // cast int to String
        }
      }
      System.out.println("i:" + i + " list:" + list.get(i - 1));
    }

    return list;
  }

}
