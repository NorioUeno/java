package practice2;

import java.util.Comparator;

public class Bookcomp implements Comparator<Book>{

  public int compare(Book o1, Book o2) {
    // TODO 自動生成されたメソッド・スタブ
    return o1.getPublishDate().compareTo(o2.getPublishDate());
  }

}
