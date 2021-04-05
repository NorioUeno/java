package crackingTheCodingInterview.treeAndGraph;

import java.util.Scanner;

/**
 * @author norioueno
 * 巡回 inOrder/preOrder/postOrder
 */
public class BinaryTree {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    Node root = null;

    // nodeをn個作成
    Node[] node = new Node[n];
    for (int nodeCount = 0; nodeCount < n; nodeCount++) {
      node[nodeCount] = new Node(nodeCount);
    }

    // nodeの要素を追加
    for (int nodeCount = 0; nodeCount < n; nodeCount++) {
      int targetNode = scan.nextInt();
      if (targetNode != -1) {
        int left = scan.nextInt();
        if (left != -1) {
          node[targetNode].left = node[left];
          node[left].parent = node[targetNode];
        }
        int right = scan.nextInt();
        if (right != -1) {
          node[targetNode].right = node[right];
          node[right].parent = node[targetNode];
        }
      }
    }

    // rootを定義
    for (int nodeCount = 0; nodeCount < n; nodeCount++) {
      if (node[nodeCount].parent == null) {
        node[nodeCount].root = true;
        root = node[nodeCount];
      }
    }

    // print
//    for (Node nodeCount : node) {
//      System.out.printf("no:%d left:%d right:%d \n", nodeCount.no, nodeCount.left.no,
//          nodeCount.right.no);
//    }
    System.out.println("getDepth : " + getDepth(node[2],0));

    preOrder(node,root);
    System.out.printf("\n");
    inOrder(node,root);
    System.out.printf("\n");
    postOrder(node,root);
  }

  private static void inOrder(Node[] node ,Node n) {
    if(n == null) {
      return;
    }
    inOrder(node, n.left);
    System.out.printf("%d ", n.no);
    inOrder(node, n.right);
  }
  private static void postOrder(Node[] node ,Node n) {
    if(n == null) {
      return;
    }
    postOrder(node, n.left);
    postOrder(node, n.right);
    System.out.printf("%d ", n.no);
  }

  private static void preOrder(Node[] node ,Node n) {
    if(n == null) {
      return;
    }
    System.out.printf("%d ", n.no);
    preOrder(node, n.left);
    preOrder(node, n.right);
  }

  static public int getDepth(Node n, int depth) {
    if(n.root) {
      return depth;
    }
    depth = getDepth(n.parent, ++depth);
    return depth;
  }

  static public Node getSibilling(Node n) {
    if(n.parent == null) {
      return null;
    } else if(n.parent.left == n && n.parent.right != null) {
      return n.parent.right;
    } else if (n.parent.left != n && n.parent.left != null) {
      return n.parent.left;
    } else {
      return null;
    }
  }

  static public class Node {
    String name;
    Node parent, left, right;
    Node[] children; // 0:left 1:right
    int no;
    boolean root = false;

    public Node(int no) {
      this.no = no;
    }
  }

}
