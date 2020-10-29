package practice.training.no19_taxPatternTest;

public class ConsumptionTax {

  private final int taxRate;

//  constructor singlton
  private ConsumptionTax(int taxRate) {
    this.taxRate = taxRate;
  }

  public static ConsumptionTax getInstance(int taxRate) {
    return new ConsumptionTax(taxRate);
  }

  public int apply(int price) {

    double tax = 1d + (taxRate / 100d);
    double totalPrice = (double)price * tax;

    System.out.println("price:" + price);
    System.out.println("taxRate" + taxRate +
        " tax:" + tax + " totalPrice:" + totalPrice);
    System.out.println("return:" + Math.round(totalPrice));

    return (int) Math.round(totalPrice);
//    return (int) totalPrice;

  }

}
