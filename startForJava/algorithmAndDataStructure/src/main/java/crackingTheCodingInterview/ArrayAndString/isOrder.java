package crackingTheCodingInterview.ArrayAndString;

import java.util.Arrays;

public class isOrder {

  public static void main(String[] args) {
    String s1 = "acbd";
    String s2 = "dbac";
    // System.out.println(isOrder(s1, s2));
    System.out.println(permutation(s1, s2));

  }


  private static boolean permutation(String str1, String str2) {
    if (sort(str1).equals(sort(str2)))
      return true;
    return false;
  }

  static String sort(String str) {
    char[] content = str.toCharArray();
    Arrays.sort(content);
    return new String(content);
  }



  static boolean isOrder(String s1, String s2) {

    char[] content1 = s1.toCharArray();
    Arrays.sort(content1);
    char[] content2 = s2.toCharArray();
    Arrays.sort(content2);
    String ss1 = content1.toString();
    String ss2 = content2.toString();

    if (content1.toString().equals(content2.toString()))
      return true;

    return false;
  }



}
