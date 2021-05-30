package crackingTheCodingInterview.ArrayAndString;

public class Urlify {

  public static void main(String[] args) {
    String str = "ueno norio";
    urlify(str, str.length());

    replaceSpace(str, str.length());
  }



  private static void replaceSpace(String str, int length) {
    char[] content = str.toCharArray();
    int spaceCount = 0, index = 0;
    for (char c : content) {
      if (c == ' ')
        spaceCount++;
    }
    index = length + spaceCount * 2;
    char[] newContent = new char[index];
    for (int lengthCount = length - 1; lengthCount >= 0; lengthCount--) {
      if (content[lengthCount] == ' ') {
        newContent[index - 1] = '0';
        newContent[index - 2] = '2';
        newContent[index - 3] = '%';
        index -= 3;
      } else {
        newContent[index - 1] = content[lengthCount];
        index--;
      }
    }

//    System.out.println(Arrays.toString(newContent));
    for (char c : newContent) {
      System.out.print(c);
      Character.getNumericValue(c);
    }

  }



  private static void urlify(String str, int length) {
    char[] content = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int strCount = 0; strCount < length; strCount++) {
      if (content[strCount] == ' ') {
        sb.append("%20");
      } else {
        sb.append(content[strCount]);
      }
    }
    System.out.println(sb);
  }


}
