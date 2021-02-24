package aoj.intoroduction;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Binary Trees
 *
 */
public class ALDS1_7_B {

  static Node[] nodes;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nodeSize = scan.nextInt();
    nodes = new Node[nodeSize];
    int[] parents = new int[nodeSize];
    int[] siblings = new int[nodeSize];
    Arrays.fill(parents, -1);
    Arrays.fill(siblings, -1);
    NodeFactory nodeFactory = new NodeFactory();
    int nodeId, left, right;
    for (int nodeCount = 0; nodeCount < nodeSize; nodeCount++) {
      nodeId = scan.nextInt();
      nodes[nodeId] = nodeFactory.create(nodeId);
      left = scan.nextInt();
      right = scan.nextInt();

      nodes[nodeId].setLeft(left);
      nodes[nodeId].setRight(right);

      if(left == -1 && right == -1) {
        nodes[nodeId].setDegree(0);
      } else if (left == -1 && right != -1){
        nodes[nodeId].setDegree(1);
        parents[right] = nodeId;
        siblings[right] = left;
      } else if (left != -1 && right == -1){
        nodes[nodeId].setDegree(1);
        parents[left] = nodeId;
        siblings[left] = right;
      } else {
        nodes[nodeId].setDegree(2);
        parents[left] = nodeId;
        parents[right] = nodeId;
        siblings[left] = right;
        siblings[right] = left;
      }
    }

    for (int nodeCount = 0; nodeCount < nodeSize; nodeCount++) {
      nodes[nodeCount].setParent(parents[nodeCount]);
      nodes[nodeCount].setSibling(siblings[nodeCount]);
//      nodes[nodeCount].setDepth(getDepth(nodes[nodeCount], 0));
//      nodes[nodeCount].setType(getType(nodes[nodeCount]));
//      nodes[nodeCount].setHeight(getHeight(nodes[nodeCount], 0));
//      printNode(nodes[nodeCount]);
    }

    for (int nodeCount = 0; nodeCount < nodeSize; nodeCount++) {
//      nodes[nodeCount].setParent(parents[nodeCount]);
//      nodes[nodeCount].setSibling(siblings[nodeCount]);
      nodes[nodeCount].setDepth(getDepth(nodes[nodeCount], 0));
      nodes[nodeCount].setType(getType(nodes[nodeCount]));
      nodes[nodeCount].setHeight(getHeight(nodes[nodeCount], 0));
      printNode(nodes[nodeCount]);
    }

  }
  public static int getHeight(Node node, int depth) {
    int leftDepth = depth;
    int rightDepth = depth;
    if(node.getLeft() != -1) {
      leftDepth = getHeight(nodes[node.getLeft()], ++leftDepth);
    }
    if(node.getRight() != -1) {
      depth++;
      rightDepth = getHeight(nodes[node.getRight()], ++rightDepth);
    }
    return Math.max(leftDepth, rightDepth);
  }
  public static String getType(Node node) {
    if(node.getParent() == -1) {
      return "root";
    } else if (node.getDegree() != 0) {
      return "internal node";
    } else {
      return "leaf";
    }
  }

  public static int getDepth(Node node, int depth) {
//    int depth = 0;

    if (node.getParent() != -1) {
      return getDepth(nodes[node.getParent()],++depth);
    }
    return depth;
  }

  public static void printNode(Node node) {
    System.out.printf(
        "node %d: parent = %d, sibling = %d, degree = %d, depth = %d, height = %d, %s\n",
        node.getId(), node.getParent(), node.getSibling(), node.getDegree(), node.getDepth(),
        node.getHeight(), node.getType());
  }


  static class NodeFactory {
    public Node create(int id) {
      return new Node(id);
    }
  }

  /**
   * @author norioueno
   *
   */
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
