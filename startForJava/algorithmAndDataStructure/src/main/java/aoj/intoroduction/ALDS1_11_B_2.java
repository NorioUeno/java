package aoj.intoroduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class ALDS1_11_B_2 {

  static Stack<Vertex> stack = new Stack<Vertex>();
  static int time = 0;

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int vLength = scan.nextInt();

    int vertexId;
    int depth;
    Vertex[] graph = new Vertex[vLength];

    for (int vCount = 0; vCount < vLength; vCount++) {
      vertexId = scan.nextInt();
      depth = scan.nextInt();
      int[] adjacentList = null;
      if (depth != 0) {
        adjacentList = new int[depth];
      }
      for (int depthCount = 0; depthCount < depth; depthCount++) {
        adjacentList[depthCount] = scan.nextInt();
      }
      graph[vCount] = new Vertex(vertexId, adjacentList);
    }

    int lengthFrom0 = 0;
    dfs(graph, graph[0], 0);

    for (Vertex v : graph) {
      System.out.printf("%d %d %d %d\n", v.vertexId, v.discoverTime, v.finishTime, v.length);
    }
  }

  private static void dfs(Vertex[] graph, Vertex startVertex, int length) {

    stack.push(startVertex);
    startVertex.color = "gray";
    startVertex.discoverTime = ++time;
    startVertex.length = length;
    // System.out.printf("%d %s %d\n", startVertex.vertexId,
    // stack.peek().color,startVertex.discoverTime);

    if (startVertex.adjacentList != null) {
      for (int adj : startVertex.adjacentList) {
        if (graph[adj - 1].color == "white") {
          dfs(graph, graph[adj - 1],startVertex.length + 1);
        }
      }
    }

    Vertex vp = stack.pop();
    startVertex.finishTime = ++time;
    startVertex.color = "black";
    // System.out.printf("%d %s\n", vp.vertexId, vp.color);

    for (Vertex v : graph) {
      if (v.color == "white" && stack.empty()) {
        dfs(graph, v, -999999);
      }
    }
  }
}


class Vertex {
  int vertexId;
  int[] adjacentList;
  String color;
  int discoverTime;
  int finishTime;
  int length;

  Vertex() {

  }

  Vertex(int vertexId, int[] adjacentList) {
    this.vertexId = vertexId;
    this.adjacentList = adjacentList;
    this.color = "white";
    this.length = 0;
  }

}

