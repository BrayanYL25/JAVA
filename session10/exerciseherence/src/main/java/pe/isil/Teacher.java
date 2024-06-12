package pe.isil;

public class Teacher extends Person {
  String specialization;

  public Teacher(String name, String dni, int age , String specialization) {
    super(name, dni, age);
    this.specialization = specialization;
  }

  public String getSpecialization() {
    return specialization;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }
  
}
