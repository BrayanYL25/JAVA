package pe.isil;

public class Person {
  String name;
  String dni;
  int age;
  
  public Person(String name, String dni, int age) {
    this.name = name;
    this.dni = dni;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return this.name + " " + this.dni + " " + this.age;
  }
}
