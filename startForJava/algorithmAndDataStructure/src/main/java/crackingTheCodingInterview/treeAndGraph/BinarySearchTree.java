package crackingTheCodingInterview.treeAndGraph;

import java.util.Scanner;

public class BinarySearchTree {

  static int nodeCount = 0;

  public static void main(String[] args) {
    Node[] brnarySearchTree = new Node[100];
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for (int nCount = 0; nCount < n; nCount++) {
      switch (scan.next()) {
        case "insert":
          brnarySearchTree[nodeCount] = new Node(scan.nextInt());
          insert(brnarySearchTree, brnarySearchTree[0], brnarySearchTree[nodeCount]);
          nodeCount++;
          break;
        case "print":
          preOrder(brnarySearchTree, brnarySearchTree[0]);
          System.out.println("");
          inOrder(brnarySearchTree, brnarySearchTree[0]);
          break;
        case "find":
          int key = scan.nextInt();
          System.out.println((find(brnarySearchTree, brnarySearchTree[0], key) != null));
          break;
        case "delete":
          int delkey = scan.nextInt();
          System.out.println("delete!");
          delete(brnarySearchTree, delkey);
          break;
      }
    }
  }

  private static void delete(Node[] brnarySearchTree, int delkey) {
    Node delNode = find(brnarySearchTree, brnarySearchTree[0], delkey);
    if (delNode.left == null && delNode.right == null) {
      if(delNode.parent.left == delNode) delNode.parent.left = null;
      if(delNode.parent.right == delNode) delNode.parent.right = null;
    } else if (delNode.left != null || delNode.right != null) {
      if(delNode.left != null) {
        if(delNode.parent.left.key == delNode.key) delNode.parent.left = delNode.left;
        if(delNode.parent.right.key == delNode.key) delNode.parent.right = delNode.left;
        delNode.left.parent = delNode.parent;
      } else {
        if(delNode.parent.left.equals(delNode)) delNode.parent.left = delNode.right;
        if(delNode.parent.right.key == delNode.key) delNode.parent.right = delNode.right;
        delNode.right.parent = delNode.parent;
      }
    } else {
      Node changeNode = getMin(brnarySearchTree,delNode);
      if (changeNode.right != null) {
        changeNode.parent.left = changeNode.right;
        changeNode.right.parent = changeNode.parent;
      }
      delNode.key = changeNode.key;
    }
  }

  private static Node getMin(Node[] brnarySearchTree, Node delNode) {
    Node min = delNode;
    while(min.left != null) {
      min = min.left;
    }
    return min;
  }

  private static Node find(Node[] brnarySearchTree, Node node, int key) {
    // System.out.println("aaa");
    if (node == null) {
      return null;
    } else if (node.key == key) {
      return node;
    } else {
      if (node.key <= key) {
        return find(brnarySearchTree, node.right, key);
      } else {
        return find(brnarySearchTree, node.left, key);
      }
    }
  }

  private static void inOrder(Node[] brnarySearchTree, Node node) {
    // TODO 自動生成されたメソッド・スタブ
    if (node == null) {
      return;
    }
    inOrder(brnarySearchTree, node.left);
    System.out.printf("%d ", node.key);
    inOrder(brnarySearchTree, node.right);
  }

  private static void preOrder(Node[] brnarySearchTree, Node node) {
    if (node == null) {
      return;
    }
    System.out.printf("%d ", node.key);
    preOrder(brnarySearchTree, node.left);
    preOrder(brnarySearchTree, node.right);

  }

  private static void insert(Node[] brnarySearchTree, Node compareFrom, Node compareTo) {

    // 枝に到達
    if (compareFrom == null) {
      return;
    }
    // root
    if (compareFrom.key == compareTo.key) {
      compareTo.root = true;
      return;
    }

    if (compareFrom.key <= compareTo.key) {
      insert(brnarySearchTree, compareFrom.right, compareTo);
      if (compareFrom.right == null)
        compareFrom.right = compareTo;
    } else {
      insert(brnarySearchTree, compareFrom.left, compareTo);
      if (compareFrom.left == null)
        compareFrom.left = compareTo;
    }
    if (compareFrom.parent == null)
      compareTo.parent = compareFrom;
  }


  static public class Node {
    int id;
    int key;
    Node parent, left, right;
    boolean root = false;

    public Node(int key) {
      this.key = key;
    }
  }

}
