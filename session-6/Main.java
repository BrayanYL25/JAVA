import modelos.Employee;

class Main {
  public static void main(String[] args) {
    int res = MathOperations.factorial(5);
    System.out.println(res);

    Rectangle rect = new Rectangle(10, 2);

    System.out.println(rect.getPerimeter());
    MathOperations.printRectanglePerimeter(rect);

    Employee pepito = new Employee(1, "Pepe", "Juan", 12000, false);

    pepito.setSalary(7000);

    Employee.getMinSalary();


    System.out.println(Employee.getMinSalary());
    System.out.println(pepito.getSalary());
  }
}