package designPatterns.factoryMethod.idcard;

import java.util.ArrayList;
import java.util.List;
import designPatterns.factoryMethod.framework.Factory;
import designPatterns.factoryMethod.framework.Product;

public class IDCardFactory extends Factory {

  private List owners = new ArrayList();
  private List cardNumbers = new ArrayList();
  private int cardNum = 0;

  public IDCardFactory() {
    // TODO 自動生成されたコンストラクター・スタブ
  }

  @Override
  protected Product createProduct(String owner) {
    this.cardNum++;
    return new IDCard(owner, this.cardNum);
  }

  @Override
  protected void registerProduct(Product product) {
    owners.add(((IDCard) product).getOwner());
  }

  public List getOwners() {
    return owners;
  }

  public List cardNumbers() {
    return cardNumbers;
  }

}
