package practice;

public abstract class IntangilbleAsset extends Asset {

  public IntangilbleAsset() {
    super();
    classification = "不動産";
    System.out.println("classification:" + classification);

  }

  public int assetcount() {
//    super.Asestnum = 1;
    return super.Asestnum = 1;
  }

}
