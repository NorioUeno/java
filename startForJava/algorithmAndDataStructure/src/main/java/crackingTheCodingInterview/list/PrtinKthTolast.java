package crackingTheCodingInterview.list;

import java.util.LinkedList;

public class PrtinKthTolast {

  public static void main(String[] args) {

    LinkedList<String> ll = new LinkedList<String>();
    ll.add("0d");
    ll.add("1d");
    ll.add("2d");
    ll.add("3d");
    ll.add("4d");
    ll.add("5d");
    ll.add("6d");
    ll.add("7d");
    int k = 3;

    printKthNodeToLast(ll, 0, 0, k);
  }
//作成中
  private static int printKthNodeToLast(LinkedList<String> ll, int pointer, int count, int k) {

    if (ll.size() <= pointer) {
      return count;
    }
    System.out.println("ll[pointer]: " + ll.get(pointer) + " count :" + count + "pointer : " + pointer);
    count = printKthNodeToLast(ll,++pointer,count,k) + 1;

    System.out.println( " count :" + count + "pointer : " + pointer);


    if(count == k) {
      System.out.println("Kです : " + ll.get(pointer -1));
      return pointer;
    }
    return count;
  }

}
