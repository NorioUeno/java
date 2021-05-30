package atCoder.welcomToAtCorder;

import java.util.Scanner;

public class ABC049C_Hakucyumu {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();

    String[] T = new String[4];
    T[0] = "dream";
    T[1] = "dreamer";
    T[2] = "erase";
    T[3] = "eraser";

    if (S.matches("(dream|dreamer|erase|eraser){1,}")) {
      System.out.printf("YES\n");
    } else {
      System.out.printf("NO\n");
    }

//    S = S.replaceAll(T[3], "");
//    S = S.replaceAll(T[2], "");
//    S = S.replaceAll(T[1], "");
//    S = S.replaceAll(T[0], "");
//
//    if(S.equals("")) {
//      System.out.println("YES");
//    } else {
//      System.out.println("NO");
    }

}


