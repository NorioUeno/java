package designPatterns.Observer;

public class IncrementalNumberGenerator extends NumberGenerator{

  private int startNum;
  private int endNum;
  private int incrementNum;
  private int number;

  public IncrementalNumberGenerator (int startNum, int endNum,int incrementNum) {
    this.startNum=startNum;
    this.endNum=endNum;
    this.incrementNum=incrementNum;
    this.number=startNum;
  }

  @Override
  public int getNumber() {
    return number;
  }

  @Override
  public void execute() {
    for (int i = startNum ; i < endNum ; i += incrementNum) {
      notifyObservers();
      number += incrementNum;
    }


  }

}
