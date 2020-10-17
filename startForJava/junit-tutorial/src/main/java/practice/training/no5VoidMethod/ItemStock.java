package practice.training.no5VoidMethod;

import java.util.ArrayList;
import java.util.List;

public class ItemStock {

  private int num;
  private int count;

  private List<Item> items;

  public ItemStock() {
    this.setNum(0);
    items = new ArrayList<Item>();
  }

  public void add(Item item) {
    setCount(getCount() + 1);
    items.add(item);
  }

  public int getNum() {
    return num;
  }

  public int getNum(Item item) {
//    return items.indexOf(item) + 1;
//    int count
    System.out.println(num);
    for (Item i : items) {
      if (i.equals(item))
        ++num;
      System.out.println("item: " + i.name + "num:" + num);
    }
//    items.forEach(Item i -> System.out.println(i.name));

    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

}
