package practice.section5TestRunner;

public interface ItemStock {

  /**
   * @param item
   * @param num
   */
  void add(String item, int num);


  /**
   * 商品を指定して、商品の在庫数を返す
   * @param item 商品名
   * @return 在庫数、登録されていない場合は0
   */
  int size (String item);


  /**
   * 商品の在庫が残っている場合にtrueを返す
   * @param item
   * @return
   */
  boolean contains(String item);

}
