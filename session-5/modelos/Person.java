package modelos;
public class Person {
  private String name;
  private String dni;
  private int age;

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

  public void eat(String food) {
    System.out.println(name + " is eating " + food);
  }

  public void sleep() {
    System.out.println(name + " is sleeping");
  }

  public void walk() {
    System.out.println(name + " is walking");
  }

}
