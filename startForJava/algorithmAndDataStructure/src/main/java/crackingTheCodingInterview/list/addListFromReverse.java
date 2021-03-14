package crackingTheCodingInterview.list;


public class addListFromReverse {

  public static void main(String[] args) {

    Node list1 = new Node(7);
    list1.appendToTail(1);
    list1.appendToTail(6);

    Node list2 = new Node(5);
    list2.appendToTail(9);
    list2.appendToTail(2);

    int list1Int = parseIntFromList(list1);
    int list2Int = parseIntFromList(list2);
    System.out.println(list1Int);
    System.out.println(list2Int);

    int newInt = list1Int + list2Int;
    Node newList = new Node();
    parseListFromInt(newList,newInt);



  }

  private static void parseListFromInt(Node newList,int newInt) {
//      String[] newInt2 = String.valueOf(newInt).split("");
      if(String.valueOf(newInt).length() > 1) {
        parseListFromInt(newList,Integer.parseInt(String.valueOf(newInt).substring(1, String.valueOf(newInt).length())));
      }
      newList.appendToTail(newInt);
  }

  private static int parseIntFromList(Node list1) {
    StringBuilder sb = new StringBuilder();
    if (list1.next != null) {
      sb.append(parseIntFromList(list1.next));
    }
    sb.append(list1.data);
    return Integer.parseInt(sb.toString());
  }

  static class Node {
    int data;
    Node prev;
    Node next;

    Node() {
    }
    Node(int data) {
      this.data = data;
    }

    public void appendToTail(int data) {
      Node end = new Node(data);
      Node n = this;
      while (n.next != null) {
        n = n.next;
      }
      n.next = end;
    }
  }

}
