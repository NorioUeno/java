package crackingTheCodingInterview.treeAndGraph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Graph_BFS_DFS {

  static Stack<Node> stack = new Stack<Node>();
  static Queue<Node> queue = new ArrayDeque<Node>();

  public static void main(String[] args) {
    Graph graph = new Graph();
    graph.nodes = new Node[7];
    graph.nodes[0] = new Node(0, 1);
    graph.nodes[1] = new Node(1, 1);
    graph.nodes[2] = new Node(2, 2);
    graph.nodes[3] = new Node(3, 1);
    graph.nodes[4] = new Node(4, 1);
    graph.nodes[5] = new Node(5, 1);
    graph.nodes[6] = new Node(6, 1);

    graph.nodes[0].children[0] = graph.nodes[1];
    graph.nodes[1].children[0] = graph.nodes[2];
    graph.nodes[2].children[0] = graph.nodes[0];
    graph.nodes[2].children[1] = graph.nodes[3];
    graph.nodes[3].children[0] = graph.nodes[2];
    graph.nodes[4].children[0] = graph.nodes[6];
    graph.nodes[5].children[0] = graph.nodes[4];
    graph.nodes[6].children[0] = graph.nodes[5];

    // searchBFS(graph, graph.nodes[0]);
//    for (Node n : graph.nodes) {
//      if (n.visited == false) {
//        searchBFS(n);
//      }
//    }
    System.out.println("==BFS==");
    for (Node n : graph.nodes) {
      if (n.visited == false) {
        searchDFS(n);
      }
    }

  }

  private static void searchDFS(Node node) {
    if (node == null)
      return;
    node.visited = true;
    queue.add(node);

    while (!queue.isEmpty()) {
      Node r = queue.poll();
      System.out.println(r.name);
      for (Node n : r.children) {
        if (n.visited == false) {
          searchDFS(n);
        }
      }
    }

  }

  private static void searchBFS(Node node) {
    if (node == null)
      return;
    stack.push(node);
    node.visited = true;
    int min = -1;

    for (Node n : node.children) {
      if (n.visited == false) {
        searchBFS(n);
      }
    }
    System.out.println(stack.pop().name);
  }

  static class Graph {
    public Node[] nodes;
  }

  static class Node {
    public int name;
    public Node[] children;
    public boolean visited;

    Node(int name, int children) {
      this.name = name;
      this.children = new Node[children];
    }

  }


}
