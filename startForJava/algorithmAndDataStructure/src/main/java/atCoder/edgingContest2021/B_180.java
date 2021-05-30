package atCoder.edgingContest2021;

import java.util.Scanner;
import java.util.Stack;

public class B_180 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String[] splitS = S.split("");
    Stack<String> stack = new Stack<String>();

    for (String s : splitS) {
      stack.add(s);
    }
    while(!stack.empty()) {
      change180(stack.pop());
    }


  }

  private static void change180(String pop) {
    if(pop.equals("6")) {
      System.out.print("9");
    } else if(pop.equals("9")) {
      System.out.print("6");
    } else {
      System.out.print(pop);
    }

  }

}
