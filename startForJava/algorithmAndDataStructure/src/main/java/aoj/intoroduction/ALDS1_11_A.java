package aoj.intoroduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Graph.
 */
public class ALDS1_11_A {

  static List<Vertex> Graph = new ArrayList<Vertex>();
  Vertex[] V;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[][] adj = new int[n + 1][n + 1];
    int digree = 0;
    Vertex[] V = new Vertex[n + 1];
    int vId = 0;

    String aa = "aa";
    aa.substring(n);
    for (int nCount = 1; nCount < n + 1; nCount++) {
      vId = scan.nextInt();
      digree = scan.nextInt();
      if (digree != 0) {
        for (int digreeCount = 0; digreeCount < digree; digreeCount++) {
          adj[vId][scan.nextInt()] = 1;
        }
      }
      // V[nCount] = new Vertex(scan.nextInt());
      // digree = scan.nextInt();
      // if (digree != 0) {
      // V[nCount].setDigree(scan.nextInt());
      // for (int digreeCount = 0; digreeCount < digree; digreeCount++) {
      // }
      // }
    }

    for (int adjConntR = 1; adjConntR < n+1; adjConntR++) {
      for (int adjConntC = 1; adjConntC < n+1; adjConntC++) {
        if(adjConntC == n) {
          System.out.printf("%d", adj[adjConntR][adjConntC]);
        }else {
          System.out.printf("%d ", adj[adjConntR][adjConntC]);
        }
      }

      System.out.println();
    }
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
