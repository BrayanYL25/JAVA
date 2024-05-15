public class MathOperations {

  // Dependencias: funcion, constructor, atributo
  public static final double PI = 3.14;

  /*
   * Class methods, clases en mayuscula
   */
  public static int sum(int a, int b) {
    return a + b;
  }


  /**
   * Return the factorial of a number
   * @param num num to get factorial
   * @return the factorial of num
   */
  public static int factorial(int num) {
    if(num <= 1) {
      return num;
    }

    return num * factorial(num - 1);
  }

  public static void printRectanglePerimeter(Rectangle rect) {
    System.out.println(2 * (rect.width + rect.height));
  }
}
