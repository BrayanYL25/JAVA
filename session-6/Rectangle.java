public class Rectangle {
  int height;
  int width;

  public Rectangle(int height, int width) {
    this.height = height;
    this.width = width;
  }

  public Rectangle() {
    this.height = 1;
    this.width = 1;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getArea() {
    return this.width * this.height;
  }

  public int getPerimeter() {
    return 2 * (width + height);
  }
}
