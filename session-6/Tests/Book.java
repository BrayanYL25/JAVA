public class Book {
  String title;
  String author;
  String genre;
  double price;

  public Book(String title, String author, String genre, double price) {
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.price = price;
  }

  // boiler place
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
