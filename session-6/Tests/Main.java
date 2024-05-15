import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    ArrayList<Book> books = new ArrayList<>(Arrays.asList(new Book("The picture of Dorian Gray", "Oscar Wilde", "Gothic", 10)));

    Library library = new Library(books);
    System.out.println(library.getBook(0).title);

    System.out.println(library.booksQuantity());
  }
}