package modelos;

public class Cat {
  String name;
  String race;
  int age;
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void meow() {
    System.out.println(name + " is meowing");
  }

  public Cat(String name, String race, int age) {
    this.name = name;
    this.race = race;
    this.age = age;
  }


  
}
