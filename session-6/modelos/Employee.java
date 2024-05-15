package modelos;

public class Employee {
  //  Atributos de instancia
  int id;
  double salary;
  String firstName;
  String lastName;
  boolean hasChildren;

  /*
   * Class fields
   */

   static double minSalary = 1025;

   public Employee(int id, String firstName, String lastName, double salary, boolean hasChildren) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.hasChildren = hasChildren;
   }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public static double getMinSalary() {
    return minSalary;
  }

  public static void setMinSalary(double minSalary) {
    Employee.minSalary = minSalary;
  }

  public boolean getHasChildren() {
    return this.hasChildren;
  }

  public void setHasChildren(boolean hasChildren) {
    this.hasChildren = hasChildren;
  }
   
  public void hasBonus() {
    //Estructuras selectivas / condicionales
    if (hasChildren) {
      System.out.println("Tienes un bono");
    } else {
      System.out.println("No tienes  bono");
    }
  }
}
