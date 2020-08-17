/**
 *
 */
package designPatterns.iterator;

import java.util.ArrayList;

/**
 * @author aa572057
 *
 */
public class BookShelf implements Aggregate {

  private Book[] books;
  private ArrayList<Book> bka;
  private int last = 0;

  /**
   *
   */
  public BookShelf(int maxsize) {
    // TODO 自動生成されたコンストラクター・スタブ
    this.books = new Book[maxsize];
  }
  public BookShelf(int initialsize, boolean array) {
    this.bka = new ArrayList(initialsize);


  }

  public Book getBookAt(int index) {
//    return books[index];
    return (Book)bka.get(index);
  }

  public void appendBook(Book book) {
//    this.books[last] = book;
//    last++;
    bka.add(book);
  }
  public int getLength() {
    // return last;
    return bka.size();
  }

  @Override
  public Iterator iterator() {
    // TODO 自動生成されたメソッド・スタブ
    return new BookShelfIterator(this);
  }

}
