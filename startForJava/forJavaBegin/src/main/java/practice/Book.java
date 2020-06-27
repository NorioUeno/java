package practice;

/**
 * @author aa572057
 *
 */
public class Book extends TangibleAsset {

  private String isbn;

//  コンストラクタ
  public Book(String name, int price, String color, String isbn) {
    this.name = name;
    this.price = price;
    this.color = color;
    this.isbn = isbn;

  }

// getter/setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

}
