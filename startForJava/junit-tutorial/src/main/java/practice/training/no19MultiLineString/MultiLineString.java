package practice.training.no19MultiLineString;

public class MultiLineString {

  private final static String BR = System.getProperty("line.separator");

//  public static String join(String[] string) {
  public static String join(String... lines) {

    StringBuffer sb = new StringBuffer();

    for (String s : lines) {
      sb.append(s);
      sb.append(getBR());
    }
    System.out.println(sb.toString());

    return sb.toString();
  }

  public static String getBR() {
    return BR;
  }

}
