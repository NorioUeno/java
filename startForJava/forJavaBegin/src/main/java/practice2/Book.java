package practice2;

import java.util.Date;

public class Book implements Comparable<Book>, Cloneable {

  private String title;
  private Date publishDate;
  private String comment;

  @Override
  public boolean equals(Object o) {

    if (this == o) {
      return true;
    }
    if (o == null) {
      return false;
    }
    if (!(o instanceof Book)) {
      return false;
    }
    Book b = (Book) o;
    if (!this.title.equals(b.title)) {
      return false;
    }
    if (!this.publishDate.equals(b.publishDate)) {
      return false;
    }

    return true;

  }

  public int compareTo(Book o) {
    return this.publishDate.compareTo(o.publishDate);
  }

  public Book clone() {
    Book result = new Book();
    result.comment = this.comment;
    result.publishDate = this.publishDate;
    result.title = this.title;

    return result;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

//  public int compare(Book o1, Book o2) {
//    // TODO 自動生成されたメソッド・スタブ
//    return o1.getPublishDate().compareTo(o2.getPublishDate());
//  }

}
