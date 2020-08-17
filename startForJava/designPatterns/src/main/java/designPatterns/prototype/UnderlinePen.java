package designPatterns.prototype;

public class UnderlinePen extends Product{

  private char ulchar;

  public UnderlinePen(char ulchar) {
    this.ulchar = ulchar;
  }

  @Override
  public void use(String s) {
    int length = s.getBytes().length;
    System.out.println("¥ " + s + " ¥");
    System.out.print("  ");
    for (int i = 0; i < length; i++) {
      System.out.print(ulchar);
    }
    System.out.println("");
  }

//  @Override
//  public Product createClone() {
//    Product p=null;
//    try {
//      p=(Product)clone(); //自分自身の複製を行うメソッド cloneableを継承しないと使えないが、本classのスーパークラスがcloneableを継承しているため利用可能
//    }catch (CloneNotSupportedException e) {
//      e.printStackTrace();
//    }
//    return p;
//  }


}
