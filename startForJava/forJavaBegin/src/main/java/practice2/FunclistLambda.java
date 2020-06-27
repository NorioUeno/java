package practice2;

public class FunclistLambda {

  public static boolean isOdd(int x) {
    return (x % 2 == 1);
  }

  public static String addNamePrefix(boolean male, String name) {
    if (male == true) {
      return "Mr." + name;
    } else {
      return "Ms." + name;
    }
  }

  public int sub(int a, int b) {
    return a-b;
  }
}
