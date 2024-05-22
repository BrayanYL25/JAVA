import java.util.ArrayList;

import models.Student;

public class Main {
  public static void main(String[] args) {
    Student student = new Student("Brayan Yin Lin", new ArrayList<String>(), 0);

    System.out.println(student.getCourseList());
    student.addCourse("Programacion Web I");
    student.addCourse("Soluciones IoT");
    System.out.println(student.getCourseList());

  }
}
