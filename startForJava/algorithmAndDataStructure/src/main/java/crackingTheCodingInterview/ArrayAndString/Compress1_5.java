package crackingTheCodingInterview.ArrayAndString;

public class Compress1_5 {

  public static void main(String[] args) {
    String str = "aabcccccaaa";
    compressStr(str);
    String str1 = "abcdevfsag";
    compressStr(str1);

  }

  private static void compressStr(String str) {
    int consective = 0;
    StringBuilder sb = new StringBuilder();
    for(int strCount = 0; strCount < str.length(); strCount++) {
      consective++;
      if(strCount + 1 >= str.length() ||
          str.charAt(strCount) != str.charAt(strCount + 1 )) {
        sb.append(str.charAt(strCount));
        sb.append(consective);
        consective = 0;
      }
    }
    System.out.println(str.length() < sb.length() ? str :sb);
//    return str.length() < sb.length() ? str :sb;
  }

}
