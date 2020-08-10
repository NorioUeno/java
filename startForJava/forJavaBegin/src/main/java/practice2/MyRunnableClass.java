package practice2;

public class MyRunnableClass implements Runnable {

  @Override
  public void run() {
    // TODO 自動生成されたメソッド・スタブ
    for(int i=0;i <5 ;i++) {
      System.out.println("Runnable i:" + i);
    }

  }

}
