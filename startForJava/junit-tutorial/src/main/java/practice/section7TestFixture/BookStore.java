package practice.section7TestFixture;

public class BookStore {

  private int bookConut;
  private int totalPrice;

  public void addToCart(Book book, int num) {
    bookConut =+ num;
    setTotalPrice(+ book.getPrice());
  }

  public int getBookConut() {
    return bookConut;
  }


  public void setBookConut(int bookConut) {
    this.bookConut = bookConut;
  }

  public int getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(int totalPrice) {
    this.totalPrice = totalPrice;
  }
}
