package practice.training.no19_4Range;

public class Range {

  public final double min;
  public final double max;

//  constractor
  public Range(double min, double max) {
    this.min = min;
    this.max = max;
  }

  public boolean contains(double checkValue) {

    if (min <= checkValue && checkValue <= max) {
      System.out.println("true");
      return true;
    }

    System.out.println("false");

    return false;
  }

}
