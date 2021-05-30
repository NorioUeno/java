package aoj.intoroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Rooted Trees.
 *
 * @author norioueno
 *
 */
public class ALDS1_7_A {

  private static final int BIG_NUM  = 2000000000;
  private static final int MOD  = 1000000007;
  static ArrayList<Node> nodes;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int nodeSize = scan.nextInt();
    int nodeId;
    int childSize;
    int[] childs;
    Integer nodeLeft;
    int[] nodeRigths = new int[nodeSize];
    Integer[] nodeParents = new Integer[nodeSize];
    Arrays.fill(nodeParents , -1); //初期値セット
    Arrays.fill(nodeRigths , -1); //初期値セット
    NodeFactory nodeFactory = new NodeFactory();
    nodes = new ArrayList<Node>();

    for (int nodeCount = 0; nodeCount < nodeSize; nodeCount++) {
      nodeId = scan.nextInt();
      nodes.add(nodeId,nodeFactory.create(nodeId));
      childSize = scan.nextInt();
      childs = new int[childSize];
      nodeLeft = -1;

      if (childSize != 0) {
        childs = new int[childSize];
        for (int childCount = 0; childCount < childSize; childCount++) {
          childs[childCount] = scan.nextInt();
          nodeParents[childs[childCount]] = nodeId;
          if(childCount != 0) {
            nodeRigths[childs[childCount -1]] = childs[childCount];
            nodeLeft = childs[0];
          } else {
//            nodeRigths[childs[childCount]] = -999;
          }
        }
      }
      nodes.get(nodeCount).setChildren(childs);
      nodes.get(nodeCount).setLeft(nodeLeft);
//      nodes[nodeCount].setLeft(nodeLeft);
    }
    for (Node n : nodes) {
      n.setParent(nodeParents[n.getId()]);
      n.setRight(nodeRigths[n.getId()]);
      if (nodeParents[n.getId()] == -1) {
        n.setType("root");
      } else if (n.getLeft() == -1) {
        n.setType("leaf");
      } else {
        n.setType("internal node");
      }
    }

    callCalceDepthRecursively(nodes.get(0), 0);


    for (Node n : nodes) {
//      n.setParent(nodeParents[n.getId()]);
//      n.setRight(nodeRigths[n.getId()]);
      System.out.printf("node %d: "
          + "parent = %d, "
//          + "left = %d, "
//          + "right = %d, "
          + "depth = %d, "
          + "%s, [",
          n.getId()
          , n.getParent()
//          , n.getLeft()
//          , n.getRight()
          , n.getDepth()
          , n.getType());
//      System.out.printf("node %d: parent = %d, depth = %d, nodeType, [", n.getId(), n.getParent(), 1);
      // System.out.println("★" + n.getChildren());
      if (n.getChildren().length == 0) {
        System.out.printf("]\n");
      } else {
        for (int childCount = 0; childCount < n.getChildren().length; childCount++) {
          if (childCount != n.getChildren().length - 1) {
            System.out.printf("%d, ", n.getChildren()[childCount]);
          } else {
            System.out.printf("%d]\n", n.getChildren()[childCount]);
          }
        }
      }
    }
  }

  public static void callCalceDepthRecursively(Node node, int depth) {
    node.setDepth(calcDepth(node, depth));
    if (node.getRight() != -1) {
      callCalceDepthRecursively(nodes.get(node.getRight()),depth);
    }
    if(node.getLeft() != -1) {
      callCalceDepthRecursively(nodes.get(node.getLeft()),depth);
    }
  }

  public static int calcDepth(Node node, int depth) {
    while(node.getParent() != -1) {
      node = nodes.get(node.getParent());
      depth++;
    }
    return depth;
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
    private Integer parent, left, right;
    private int[] children;
    private int depth;
    private String type;

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

    public int[] getChildren() {
      return children;
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

    public void setChildren(int[] children) {
      this.children = children;
    }

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
  }

}
