package designPatterns.factoryMethod.framework;

public abstract class Factory {

  public Factory() {
    // TODO 自動生成されたコンストラクター・スタブ
  }

  public final Product create(String owner) {
    Product p = createProduct(owner);
    registerProduct(p);
    return(p);
  }

  protected abstract Product createProduct(String owner);
  protected abstract void registerProduct (Product product);


}
