package pe.isil.models;

public class Rectangle extends Figure {
  double height;

  public Rectangle(double side, double height) {
    super(side);
    this.height = height;
  }

  @Override
  public void calcArea() {
    System.out.println("Area: " + this.getSide() * this.getHeight());
  }

  @Override
  public void calcPerimeter() {
    System.out.println("Perimetro: " + 2 * (this.getSide() + this.getHeight()));
  }


  public double getHeight() {
    return height;
  }


  public void setHeight(double height) {
    this.height = height;
  }
}
