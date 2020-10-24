package practice.training.no3Counter;

public class Counter {

  private int count;

  public Counter() {
    this.count = 0;
  }

  public int increment() {

    return ++count;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

}
