package practice2;

public class CountUpThred extends Thread{

  @Override
  public void run() {
    for (int i=0;i<10;i++) {
      System.out.print(i);
      System.out.print(System.getProperty("line.separator"));
    }

    CounterThread ct = new CounterThread();
    ct.add(1);
    ct.mul(2);

  }



}
