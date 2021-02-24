package aoj.intoroduction;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ALDS1_4_C {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String command;
    Set<String> dictionary = new HashSet<String>();
    for (int commandNum = 0; commandNum < n; commandNum++) {
      command = scan.next();
      switch(command) {
        case "insert" :
          dictionary.add(scan.next());
          break;
        case "find" :
          if(dictionary.contains(scan.next()))
            System.out.println("yes");
          else
            System.out.println("no");
          break;
      }
    }
  }
}
