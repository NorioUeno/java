package aoj.intoroduction;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Queue.
 *
 * @author norioueno
 *
 */
public class ALDS1_3_B {

  // static ArrayDeque<ArrayList<String>> queue;
  static ArrayDeque<Job> queue;
  static int processTime = 0;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int queueSize = scan.nextInt();
    int taskQuantum = scan.nextInt();
    // ArrayList<String> tasks = new ArrayList<String>();
    queue = new ArrayDeque<Job>();

    // System.out.println("aaa");

    for (int queueNum = 0; queueNum < queueSize; queueNum++) {
      // tasks.add(scan.next(), scan.nextInt());
      // ArrayList<String> tasks = new ArrayList<String>();
      // tasks.add(scan.next());
      // tasks.add(scan.next());

//      System.out.println("create Job!");
      Job job = new Job(scan.next(), scan.nextInt());
      // classを作る
      // ArrayList<String> tmp = (ArrayList<String>) tasks.clone();
      // queue.offer(tasks.clone());
      // tasks.clear();
      queue.offer(job);
    }

    // for (ArrayList<String> que : queue) {
    // task(taskQuantum, processTime, que);
    // queue.forEach(System.out::println);
    // }

    while (queue.size() != 0) {
       task(taskQuantum, queue.poll());
//       queue.forEach(System.out::println);
    }

    // tasks.forEach(null);
    // System.out.println("-----");


  }

  // public static void task(int quantum, ArrayList<String> queueTask) {
  public static void task(int quantum, Job job) {

    // int subtract = Integer.parseInt(queueTask.get(1)) - quantum;
    int subtract = job.getTime() - quantum;

    if (subtract > 0) {
      // System.out.println("offer ");
//      queueTask.set(1, String.valueOf(subtract));
      job.setTime(subtract);
      processTime += quantum;
      // queue.remove();
      queue.offer(job);
    } else {
      // System.out.println("done");
      // queue.remove();
//      processTime += Integer.parseInt(queueTask.get(1));
      processTime += job.getTime();
      System.out.printf("%s %d\n", job.getName(), processTime);
    }
  }

  static class Job {

    String name;
    int time;

    Job(String name, int time) {
      this.name = name;
      this.time = time;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getTime() {
      return time;
    }

    public void setTime(int time) {
      this.time = time;
    }



  }


}
