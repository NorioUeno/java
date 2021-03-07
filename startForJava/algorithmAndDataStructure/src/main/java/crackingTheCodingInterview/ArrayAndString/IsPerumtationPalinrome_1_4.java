package crackingTheCodingInterview.ArrayAndString;

public class IsPerumtationPalinrome_1_4 {

  public static void main(String[] args) {
    String str1 = "Tact coa";
    String str2 = "aaaa";
    System.out.println(isPerumtationOfPalindrome(str1));

  }
  public static boolean isPerumtationOfPalindrome(String phrase) {
    int[] table = buildCharFrequencyTable(phrase);
    return checkMaxOneOdd(table);
  }
  private static boolean checkMaxOneOdd(int[] table) {
    boolean foundOdd = false;
    for(int count : table) {
      if(count % 2 == 1) {
        if(foundOdd) {
          return false;
        }
        foundOdd = true;
      }
    }
    return false;
  }
  private static int[] buildCharFrequencyTable(String phrase) {
    int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') +1];
    for(char c : phrase.toCharArray()) {
      int x = getCharNumber(c);
      if(x != -1) {
        table[x]++;
      }
    }
    return table;
  }
  private static int getCharNumber(char c) {
    int a = Character.getNumericValue('a');
    int z = Character.getNumericValue('z');
    int aa = Character.getNumericValue('@');
    int bb = Character.getNumericValue(' ');
    int val = Character.getNumericValue(c);
    if(a <= val && val <= z) {
      return val - a;
    }
    return -1;
  }

}
