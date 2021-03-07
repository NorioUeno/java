package crackingTheCodingInterview.ArrayAndString;


public class OneEditAway_1_5 {


  public static void main(String[] args) {
    String str1 = "palb";
    String str2 = "ple";
    String s1 = str1.length() > str2.length() ? str1 : str2;
    String s2 = str1.length() < str2.length() ? str1 : str2;

    System.out.println(oneEditAway(str1, str2));

  }

  private static boolean oneEditAway(String str1, String str2) {
    int diff = str1.length() - str2.length();
    boolean isOneEditAway;
    if(diff == 0) {
      isOneEditAway = replace(str1,str2);
    } else if (diff < 0) {
      isOneEditAway = delete(str1,str2);
    } else {

      isOneEditAway = insert(str1,str2);
    }
    return isOneEditAway;
  }

  private static boolean insert(String str1, String str2) {
    int strCompareCount = 0;
    int str1Count = 0;
    int str2Count = 0;
    while (str1Count < str1.length() && str2Count < str2.length()) {
      if (str1.charAt(str1Count) != str2.charAt(str2Count)) {
        str1Count++;
        strCompareCount++;
        continue;
      }
      str1Count++;
      str2Count++;
    }
    if(strCompareCount > 1) {
      return false;
    } else {
      return true;
    }
  }

  private static boolean delete(String str1, String str2) {
    // TODO 自動生成されたメソッド・スタブ
    return false;
  }

  private static boolean replace(String str1, String str2) {
    // TODO 自動生成されたメソッド・スタブ
    return false;
  }


}
