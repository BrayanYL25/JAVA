package pe.isil.models;

public class Triangle extends Figure {
  double height;

  public Triangle(double side, double height) {
    super(side);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public void calcArea() {
    System.out.println("Area: " + (getSide() * getHeight())/2);
  }

  @Override
  public void calcPerimeter() {
    System.out.println("Perimeter: " + getSide() * 3);
  }
}
