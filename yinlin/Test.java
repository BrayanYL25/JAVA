public class Test {

  public static int getArea(int width, int height) {
    return width * height;
  }

  public static int getPerimeter(int width, int height) {
    return (width * 2) + (height * 2);
  }

  public static void getAllSizes(int width, int height) {
    System.out.println("The area is: " + getArea(width, height));
    System.out.println("The Perimeter is: " + getPerimeter(width, height));
  }

  public static boolean allEqual (int a, int b, int c, int d) {
    return a == b && b == c && d == a;
  }
}
