package crackingTheCodingInterview.stackAndQueue;

import javax.swing.tree.TreeNode;

public class Stack_3_3 extends Stack_0 {

  private static int stackLimit = 5;
  private static int stackIndex = 0;
  private static int stackNext = 0;
  private static int stackPrev = 0;

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
  }

  public Stack_3_3() {
    stackIndex = 1;
    stackNext = 1;
    stackPrev = 1;
  }

  public Stack_3_3(int stackIndex, int stackPrev) {
    this.stackIndex = stackIndex;
    this.stackPrev = stackPrev;
  }

  public static class StackNodeWithLimit<T> extends StackNode<T> {
    // private T data;
    // private StackNodeWithLimit<T> next;
    // private StackNodeWithLimit<T> top;

    public StackNodeWithLimit(T data) {
      super(data);
      stackLimit++;
      // this.data = data;
    }

    public StackNodeWithLimit(T data, int stackIndexs, int stackPrevs) {
      super(data);
      stackLimit++;
      stackIndex = stackIndexs;
      stackPrev = stackPrevs;
      stackNext = stackIndexs;
      // this.data = data;
//      TreeNode tn = new TreeNode();
    }

    public void push(T item) {
      if (stackNext == stackIndex) {

        if (stackLimit < stackLimit + 1) {
          // Stack_3_3 s2 = new Stack_3_3(stackIndex + 1, stackIndex);
          stackNext = stackIndex + 1;
          Stack_3_3.StackNodeWithLimit<T> s2 =
              new Stack_3_3.StackNodeWithLimit<T>(item, stackIndex + 1, stackIndex);
          // s2.push(item);
        } else {
          stackLimit++;
          super.push(item);
          // StackNode sn = new StackNode(item);
          // sn.next = top;
          // top = sn;
        }
      }
    }
  }

}
