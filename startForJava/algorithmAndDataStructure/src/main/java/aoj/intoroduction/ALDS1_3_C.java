package aoj.intoroduction;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ALDS1_3_C {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String command;
    String key;
//    LinkedList<String> list = new LinkedList<String>();
    Deque<String> list = new ArrayDeque<String>();
    int commandNum = 0;
    StringBuilder ans = new StringBuilder();

    // for (int commandNum = 0; commandNum < n; commandNum++) {
    while (n != commandNum) {
      command = scan.next();
      switch (command) {
        case "insert":
          key = scan.next();
          list.addFirst(key);
          commandNum++;
          break;
        case "delete":
          key = scan.next();
          list.remove(key);
          commandNum++;
          break;
        case "deleteFirst":
          list.removeFirst();
          commandNum++;
          break;
        case "deleteLast":
          list.removeLast();
          commandNum++;
          break;
      }
    }

    if(!list.isEmpty()) {
      ans.append(list.pollFirst());
    }
    while(!list.isEmpty()) {
      ans.append(" ").append(list.pollFirst());
    }
    System.out.println(ans.toString());

    //    for (int listNum = list.size(); listNum > 0; listNum--) {
//      if (listNum != 1) {
//        System.out.printf("%s ", list.pollFirst());
//      } else {
//        System.out.printf("%s\n", list.pollFirst());
//      }
      // for(int listNum = list.size() ; listNum > 0 ;listNum--) {
      // if(listNum != 0) {
      // System.out.printf("%s ",list.get(listNum -1 ));
      // } else {
      // System.out.printf("%s\n",list.get(listNum -1 ));
      // }

  }
}
