package designPatterns.Bridge;

public class CounttDisplay extends Display{

  public CounttDisplay(DisplayImpl impl) {
    super(impl);
  }

  public void multiDisplay(int times) {
    open();
    for(int i=0; i< times; i++) {
      print();
    }
    close();
  }
}
