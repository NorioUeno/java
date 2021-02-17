package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Stack;

/**
 * Stack.
 *
 * @author norioueno
 */
public class ALDS1_3_A {

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<Integer>();
    String[] input = br.readLine().split(" ");

    for (int inputNum = 0; inputNum < input.length; inputNum++) {
      if (checkOperator(input[inputNum])) {
//        System.out.println("calc:" + input[inputNum]);

        if (input[inputNum].equals("+")) {
          stack.push(Math.addExact(stack.pop(), stack.pop()));

        } else if(input[inputNum].equals("-")) {
          BigDecimal x = new BigDecimal(stack.pop());
          BigDecimal y = new BigDecimal(stack.pop());

//          stack.push(Math.subtractExact(stack.pop(), stack.pop()));
          stack.push(y.subtract(x).intValue());

        } else if(input[inputNum].equals("*")) {
          stack.push(Math.multiplyExact(stack.pop(), stack.pop()));

        } else if(input[inputNum].equals("/")) {
          stack.push(Math.floorDiv(stack.pop(), stack.pop()));
        }
      } else {
//        System.out.println("push:" + input[inputNum]);
        stack.push(Integer.valueOf(input[inputNum]));
      }
      if (inputNum == input.length - 1) {
        System.out.println(stack.pop());
      }
    }
  }

  public static boolean checkOperator(String input) {
    if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
      return true;
    }
    return false;
  }
}
