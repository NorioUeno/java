package designPatterns.factoryMethod.idcard;

import designPatterns.factoryMethod.framework.Product;

public class IDCard extends Product {

  private String owner;
  private int cardNumber;

  // アクセス修飾子が無いのは、このpackageからしか、IDCardを作成しないようにするため＝factory経由で作成するための制約をかけている
  IDCard(String owner, int cardNumber) {
    System.out.println(owner + "のカードを作ります。cardNumber: " + cardNumber);
    this.owner = owner;
    this.cardNumber = cardNumber;
  }

  @Override
  public void use() {
    System.out.print(owner + "のカードを使います。");
    System.out.println("カードnum : " + cardNumber );
  }

  public String getOwner() {
    return this.owner;
  }

  public int getCardNumber() {
    return this.cardNumber;
  }

}
