package practice;

public abstract class TangibleAsset extends Asset{

  protected String name;
  protected int price;
  protected String color;


  public void use() {
    System.out.println("asset use");
  }

  public void drop() {
    System.out.println("asset drop");
  }

  //抽象method
  public abstract String getColor();
  public abstract String getName();
  public abstract int getPrice();
//  public abstract void consume();

}
