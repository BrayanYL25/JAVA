import java.util.ArrayList;

public class Library {
  ArrayList<Book> books = new ArrayList<>();

  public Library(ArrayList<Book> books) {
    this.books.addAll(books);
  }

  public Library() {
    books = new ArrayList<Book>();
  }

  public void addBook(Book book) {
    this.books.add(book);
  }

  public void removeBook(Book book) {
    this.books.remove(book);
  }

  public int booksQuantity() {
    return books.size();
  }

  public Book getBook(int position) {
    return books.get(position);
  }

  public ArrayList<Book> getBooks() {
    return books;
  }
}
