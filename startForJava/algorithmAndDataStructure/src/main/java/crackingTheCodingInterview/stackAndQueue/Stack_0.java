package crackingTheCodingInterview.stackAndQueue;

import java.util.EmptyStackException;

public class Stack_0 {

  public static void main(String[] args) {




  }

  public static class StackNode<T>{
    private T data;
    private StackNode<T> next;
    private StackNode<T> top;

    public StackNode(T data) {
      this.data = data;
    }

    public T pop() {
      if(top == null) throw new EmptyStackException();
      T item = top.data;
      top = top.next;
      return item;
    }

    public void push(T item) {
      StackNode sn = new StackNode(item);
      sn.next = top;
      top = sn;
    }

    public T peek() {
      if(top == null) throw new EmptyStackException();
      return top.data;
    }

    public boolean isEmpty() {
//      if(top == null) return true;
//      return false;
      return top == null;

    }

  }

}
