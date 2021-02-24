package aoj.intoroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author norioueno
 * mapでする + overrideの検証
 */
public class ALDS1_8_A {

  static List<Node> binarySerarchTree = new ArrayList<Node>();
  static NodeFactory nodeFactory = new NodeFactory();

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int operationSize = scan.nextInt();
    String operation;
    for(int operationCount = 0 ; operationCount < operationSize; operationCount++ ) {
      operation = scan.next();
      switch (operation){
        case "insert" :
          insert(scan.nextInt());
          break;
        case "print" :
          System.out.println("aa");
          break;      }
    }
  }

  public static void insert(int nodeId) {
    Node node = nodeFactory.create(nodeId);
    if(binarySerarchTree.size() == 0) {
      node.setParent(-1);
      node.setLeft(-1);
      node.setRight(-1);
      binarySerarchTree.add(node);
    } else {
      System.out.println(
      binarySerarchTree.get(binarySerarchTree.indexOf(node)).getParent()
      );

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
    @Override
    public boolean equals(Object o) {
      Node n = (Node) o ;
      if(id == n.getId()){
        return true;
      } else {
        return false;
      }
    }

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
