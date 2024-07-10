package pe.isil.models;

public class Circle implements Shape{
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double calcArea() {
    return Math.PI * Math.pow(getRadius(), 2);
  }
}
