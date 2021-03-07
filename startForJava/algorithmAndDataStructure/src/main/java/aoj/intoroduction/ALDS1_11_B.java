package aoj.intoroduction;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Depth First Search
 */
public class ALDS1_11_B {
  static Stack<Vertex> S = new Stack<Vertex>();
  static Vertex[] V;
  static String[] color;
  static int[] d;
  static int[] f;
  static int time = 0;
  static int[][] adj;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int digree = 0;
    int vId = 0;
    V = new Vertex[n + 1];
    adj = new int[n + 1][n + 1];
    color = new String[n + 1]; // white,gray,black
    Arrays.fill(color, "WHITE");
    d = new int[n + 1];
    f = new int[n + 1];


    for (int nCount = 1; nCount < n + 1; nCount++) {
      vId = scan.nextInt();
      digree = scan.nextInt();
      V[nCount] = new Vertex(vId);
      if (digree != 0) {
        for (int digreeCount = 0; digreeCount < digree; digreeCount++) {
          adj[vId][scan.nextInt()] = 1;
        }
      }
    }
    dfs(1);

    for (int nCount = 1; nCount < n + 1; nCount++) {
      System.out.printf("%d %d %d\n", V[nCount].getID(), d[nCount], f[nCount]);
    }
  }

  /**
   * deep First serach.
   *
   * @param i
   */
  private static void dfs(int i) {
    S.push(V[i]);
    color[i] = "GRAY";
    d[i] = ++time;
    int next;
    int max = 0;

    while (!S.isEmpty()) {
      i = S.peek().getID();
//      System.out.println("dfs i:" + i);
      next = next(i);
      if (next != 0 && max == 0) {
        if (color[next].equals("WHITE")) {
//          System.out.println("next:" + next);
          color[next] = "GRAY";
          d[next] = ++time;
          S.push(V[next]);
        }
      } else {
        i = S.pop().getID();
//        System.out.println("else i:" + i);
        color[i] = "BLACK";
        f[i] = ++time;
//        max = 1;
      }

    }

  }

  private static int next(int i) {
    int nextVertex = 0;
    for (int abjCountC = 1; abjCountC < adj.length; abjCountC++) {
//      System.out.println("next i:" + abjCountC);
      if (adj[i][abjCountC] != 0 && !color[abjCountC].equals("BLACK")) {
        return abjCountC; // vID
      }
    }
    return nextVertex;
  }

  static class Vertex {
    private int ID;
    private int digree;
    private int[] adj;

    Vertex(int ID) {
      this.ID = ID;
    }

    public int getID() {
      return ID;
    }

    public int getDigree() {
      return digree;
    }

    public void setID(int iD) {
      ID = iD;
    }

    public void setDigree(int digree) {
      this.digree = digree;
    }
  }


}
