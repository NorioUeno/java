package practice.section7TestFixture;

public class Book {
  private String title;
  private int price;
//  private Author author;
//  private Map<String, Object> author;

////  スタティックメンバーインナークラス <- 普通は禁止。innerクラスを作る理由と矛盾するから
//  static class Author {
//
//    private String lastname;
//    private String firstname;
//    public String getLastname() {
//      return lastname;
//    }
//    public void setLastname(String lastname) {
//      this.lastname = lastname;
//    }
//    public String getFirstname() {
//      return firstname;
//    }
//    public void setFirstname(String firstname) {
//      this.firstname = firstname;
//    }
//  }


  public int getTotalPraice() {
    return price;
  }
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
//  public Map<String, Object> getAuthor() {
//    return author;
//  }
//  public void setAuthor(Map<String, Object> author) {
//    this.author = author;
//  }

//  public Author getAuthor() {
//    return author;
//  }
//
//  public void setAuthor(Author author) {
//    this.author = author;
//  }


  @Override
  public String toString() {
    return "title : " +title +" price : " + price + " author : " ;
  }


}
