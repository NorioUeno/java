package aoj.intoroduction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author norioueno
 * mapでする + overrideの検証
 */
public class ALDS1_8_A {

  static Map<Integer, Node> binarySerarchTree = new HashMap<Integer, Node>();
//  static List<Node> binarySerarchTree = new ArrayList<Node>();
  static NodeFactory nodeFactory = new NodeFactory();
  static Node rootNode;
  static Node compareNode;
  static Integer parent;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int operationSize = scan.nextInt();
    String operation;
    int nextParent = -1;
    for(int operationCount = 0 ; operationCount < operationSize; operationCount++ ) {
      operation = scan.next();
      switch (operation){
        case "insert" :
          Node node = nodeFactory.create(scan.nextInt());
          insert(node);
          break;
        case "print" :
          inorder(rootNode);
          System.out.println();
          preorder(rootNode);
          System.out.println();
          break;
          }
    }
  }

  private static void preorder(Node node) {
    if (node == null) {
      return;
    }
//    if(node.id)
    System.out.printf(" %d",node.getId());
//    if(node.getLeft() != -1) preorder(binarySerarchTree.get(node.getLeft()));
//    if(node.getRight() != -1)preorder(binarySerarchTree.get(node.getRight()));
    preorder(binarySerarchTree.get(node.getLeft()));
    preorder(binarySerarchTree.get(node.getRight()));


  }

  private static void inorder(Node node) {
    if (node == null) {
      return;
    }
    inorder(binarySerarchTree.get(node.getLeft()));
    System.out.printf(" %d",node.getId());
    inorder(binarySerarchTree.get(node.getRight()));

  }

  public static void insert(Node node) {
    compareNode = rootNode;
    parent = -1;
    if(binarySerarchTree.size() == 0) {
      node.setParent(-1);
      node.setLeft(-1);
      node.setRight(-1);
      binarySerarchTree.put(node.getId(), node);
      rootNode = node;
    } else {
      int compareLeft = -1;
      int compareRigth = -1;
      compareNode = rootNode;
      parent = rootNode.getId();
      while(compareNode != null) {
        parent = compareNode.getId();
        if(binarySerarchTree.get(compareNode.getId()).getId() > node.getId()) {  // left child of tree
          compareNode = binarySerarchTree.get(compareNode.getLeft());
          compareLeft = node.getId();
          compareRigth = -1;
        } else {
          compareNode = binarySerarchTree.get(compareNode.getRight()); // right child of tree
          compareLeft = -1;
          compareRigth = node.getId();
        }
      }
      node.setParent(parent);
      node.setLeft(-1);
      node.setRight(-1);
      binarySerarchTree.put(node.getId(), node);

      if (compareLeft != -1) binarySerarchTree.get(parent).setLeft(node.getId());
      if (compareRigth != -1) binarySerarchTree.get(parent).setRight(node.getId());
    }
  }

  static class NodeFactory {
    public Node create(int id) {
      return new Node(id);
    }
  }

  static class Node {
    private int id;
    private int parent, left, right, degree,sibling;
    // private int[] children;
    private int depth;
    private String type;
    private int height;

    /**
     * コンストラクタ.
     */
    Node(int id) {
      this.id = id;
    }

    /**
     * ArrayListのindexOfで検索できるようにOverride.
     */
//    @Override
//    public boolean equals(Object o) {
////      Node n = (Integer) o ;
//      if(id == (Integer) o){
//        return true;
//      } else {
//        return false;
//      }
//    }

    public Integer getId() {
      return id;
    }

    public Integer getParent() {
      return parent;
    }

    public Integer getLeft() {
      return left;
    }

    public Integer getRight() {
      return right;
    }

    public void setId(int id) {
      this.id = id;
    }

    public void setParent(Integer parent) {
      this.parent = parent;
    }

    public void setLeft(Integer left) {
      this.left = left;
    }

    // public int[] getChildren() {
    // return children;
    // }

    // public void setChildren(int[] children) {
    // this.children = children;
    // }

    public void setRight(Integer right) {
      this.right = right;
    }

    public int getDepth() {
      return depth;
    }

    public String getType() {
      return type;
    }

    public void setDepth(int depth) {
      this.depth = depth;
    }

    public void setType(String type) {
      this.type = type;
    }

    public int getHeight() {
      return height;
    }

    public void setHeight(int height) {
      this.height = height;
    }

    public int getDegree() {
      return degree;
    }

    public void setDegree(int degree) {
      this.degree = degree;
    }

    public int getSibling() {
      return sibling;
    }

    public void setSibling(int sibling) {
      this.sibling = sibling;
    }
  }

}
