package models;

import java.util.ArrayList;

public class Student {
  private String name;
  private ArrayList<String> courseList;
  private int age;  

  public Student(String name, ArrayList<String> courseList, int age) {
    this.name = name;
    this.courseList = courseList;
    this.age = age;
  }

  public void addCourse(String curso) {
    this.courseList.add(curso);
  }

  public void removeCourse(String curso) {
    this.courseList.remove(curso);
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<String> getCourseList() {
    return courseList;
  }

  public void setCourseList(ArrayList<String> courseList) {
    this.courseList = courseList;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

