public class Student {
  int age;
  String name;
  String dni;

  public Student(int age, String name, String dni) {
    this.age = age;
    this.name = name;
    this.dni = dni;
  }

  public void study() {
    System.out.println("The stundent is studying");
  }

  public void getName() {
    System.out.println(name);
  }
}
