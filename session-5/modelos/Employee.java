package modelos;

public class Employee {
  String name;
  String position; // Cargo
  float salary;

  public Employee(String name, String position, float salary) {
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }


  /*
   * @param int percentage of increase: e.g. -> 20
   * @return void
   */
  public void increseSalary(float percentage) {
    float newSalary = getSalary() * (1 + (percentage/100));
    setSalary(newSalary);
  }
}
