package crackingTheCodingInterview.stackAndQueue;

import java.util.NoSuchElementException;

public class Queue_0<T> {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

  }

  private static class QueueNode<T>{
    private T data;
    private QueueNode<T> next;
    private QueueNode<T> last;
    private QueueNode<T> first;

    public QueueNode(T data) {
      this.data = data;
    }
    public void add(T data) {
      QueueNode<T> node = new QueueNode<T>(data);
      if(first != null) {
        last.next = node;
      }
      last = node;
      if(first == null) {
        first = last;
      }
    }

    public void remove() {
      if(first == null) throw new NoSuchElementException();
      first = first.next;
      if(first == null) {
        last = null;
      }
    }

    public T peek() {
      if(first == null) throw new NoSuchElementException();
      return first.data;
    }

    public boolean isEmptiy() {
      return first == null;
    }

  }


}
