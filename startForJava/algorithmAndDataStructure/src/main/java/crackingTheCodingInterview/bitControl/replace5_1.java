package crackingTheCodingInterview.bitControl;

import java.nio.ByteBuffer;

public class replace5_1 {

  public static void main(String[] args) {

    int N = 1000000000;
    int M = 10011;
    int i = 2;
    int j = 6;

    updateBits(N, M, i, j);

  }

  private static void updateBits(int n, int m, int i, int j) {

    int allOnes = ~0; // 全てが1のビット列

    int left = allOnes << (j + 1);

    int right = ((1 << i) - 1);

    int mask = left | right;

    int n_cleared = n & mask;
    int m_shifted = m << i;
    int merged = n_cleared | m_shifted; // orでマージ

    System.out.println(allOnes);
    System.out.println(left);
    System.out.println(right);
    System.out.println(mask);
    System.out.println(n_cleared);
    System.out.println(m_shifted);
    System.out.println(merged);
    System.out.println("n:" + Integer.toBinaryString(n));
    System.out.println("m:" + Integer.toBinaryString(m));
    System.out.println("a:" + Integer.toBinaryString(allOnes));
    System.out.println("left:" + Integer.toBinaryString(left));
    System.out.println("righ:" + Integer.toBinaryString(right));
    System.out.println("mask:" + Integer.toBinaryString(mask));
    System.out.println("ncleaa:" + Integer.toBinaryString(n_cleared));
    System.out.println("mshiaa:" + Integer.toBinaryString(m_shifted));
    System.out.println("mergaa:" + Integer.toBinaryString(merged));

  }

}
