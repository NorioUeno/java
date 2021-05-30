package crackingTheCodingInterview.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import crackingTheCodingInterview.list.deleteDot_2_3.ListNode;

public class deleteDot_2_3 {
  public static void main(String[] args) {

    List<Integer> list = new LinkedList<Integer>();
    list.add(2);
    list.add(30);
    list.add(1);
    list.add(10);
    list.add(2222);
    ListNode ln = new ListNode(3);
    ln.appendToTail(30);
    ln.appendToTail(2);
    ln.appendToTail(32);
    ln.appendToTail(22);

    deleteDot(ln, 3);

  }

//  2-3
  private static void deleteDot(ListNode ln, int deleteNode) {

    if (ln.next== null) {
      return;
    }else {
      while(ln.next != null) {
        if (ln.next.data == deleteNode) {
          ln.next.data = ln.next.next.data;
        }
      }
    }

  }

//  static class ListNodeFactory{
//    static int productId = 0;
//    public static ListNode create(int data) {
//      productId++;
//      if (productId == 0) {
//        return new ListNode(data);
//      } else {
//        ListNode.
//      }
//
//    }
//
//  }

  static class ListNode {
    int data;
    ListNode prev;
    ListNode next;

    ListNode(int data) {
      this.data = data;
    }

    public void appendToTail(int data) {
      ListNode end = new ListNode(data);
       ListNode n = this;
       while(n.next != null) {
         n = n.next;
       }
       n.next= end;
    }
  }


}
