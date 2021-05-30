package crackingTheCodingInterview.ArrayAndString;

public class isUniqueChar {

  public static void main(String[] args) {

    String str = "String";
    System.out.println(isUniqueChars(str));
  }

  static boolean isUniqueChars(String str) {
    if(str.length() > 128) return false;

    boolean[] char_set = new boolean[128];
    for(int strCount = 0 ; strCount < str.length(); strCount++) {
      int val = str.charAt(strCount);
      System.out.println("val:" + val);
      if (char_set[val]) return false;
      char_set[val] = true;
    }
    return true;
  }

}
