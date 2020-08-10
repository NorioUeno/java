package designPatterns.prototype;

public class MessageBox extends Product {

  private char decochar;

  public MessageBox(char decochar) {
    this.decochar = decochar;
  }

  @Override
  public void use(String s) {

    int length = s.getBytes().length;
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
    }
    System.out.println("");
    System.out.println(decochar + " " + s + " " + decochar);
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
    }
    System.out.println("");
  }

//  @Override
//  public Product createClone() {
//
//    Product p = null;
//    try {
//      p = (Product) clone(); // 自分自身の複製を行うメソッド cloneableを継承しないと使えないが、本classのスーパークラスがcloneableを継承しているため利用可能
//    } catch (CloneNotSupportedException e) {
//      e.printStackTrace();
//    }
//    return p;
//  }

}
