package crackingTheCodingInterview.treeAndGraph;

import java.util.Arrays;
import java.util.Random;

public class OrderBuild_4_7 {

  public static void main(String[] args) {

    Random random = new Random();
    
    Graph buildOrderGraph = new Graph(6);
    buildOrderGraph.nodes[0] = new Node("a");
    buildOrderGraph.nodes[1] = new Node("b");
    buildOrderGraph.nodes[2] = new Node("c");
    buildOrderGraph.nodes[3] = new Node("d");
    buildOrderGraph.nodes[4] = new Node("e");
    buildOrderGraph.nodes[5] = new Node("f");
    // Node b = new Node("b");
    // Node c = new Node("c");
    // Node d = new Node("d");
    // Node e = new Node("e");
    // Node f = new Node("f");

    buildOrderGraph.nodes[0].input[0] = buildOrderGraph.nodes[3];
    buildOrderGraph.nodes[5].input[0] = buildOrderGraph.nodes[1];
    buildOrderGraph.nodes[1].input[0] = buildOrderGraph.nodes[3];
    buildOrderGraph.nodes[5].input[1] = buildOrderGraph.nodes[0];
    buildOrderGraph.nodes[2].input[1] = buildOrderGraph.nodes[3];
    // a.input[0] = d;
    // f.input[0] = b;
    // b.input[0] = d;
    // f.input[1] = a;
    // c.input[1] = d;

    boolean isNotAllBuild = true;
    while (isNotAllBuild) {
      isNotAllBuild = false;
      for (Node n : buildOrderGraph.nodes) {
        boolean isInputEmpty = false;
        for (int nCount = 0; nCount < n.input.length; nCount++) {
          if (n.input[nCount] != null) {
            isNotAllBuild = true;
            isInputEmpty = true;
            continue;
          }
        }
        if (isInputEmpty) {
          continue;
        } else {
          System.out.println("buid : " + n.name);
          Arrays.fill(n.input, null);
        }
      }
    }
  }

  static class Graph {
    int nodeSize;
    Node[] nodes;

    Graph(int nodeSize) {
      this.nodes = new Node[nodeSize];
      this.nodeSize = nodeSize;
    }
  }

  static class Node {
    String name;
    Node[] input = new Node[10];
    // Node[] output;
    boolean isBuild = false;

    Node(String name) {
      this.name = name;
    }
  }

}
