package practice.training.no6MultiThred;

import java.util.concurrent.Executors;

public class BackgroundTask{

  private final Runnable task;

  public BackgroundTask (Runnable task) {
    this.task=task;
  }

  public void invoke() {
//    System.out.println("aaa");
    Executors.newSingleThreadExecutor().execute(task);
  }



}
