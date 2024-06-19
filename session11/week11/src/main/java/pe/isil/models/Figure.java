package pe.isil.models;

public abstract class Figure {
  double side;

  public Figure(double side) {
    this.side = side;
  }

  public abstract void calcArea();
  public abstract void calcPerimeter();

  public double getSide() {
    return side;
  }

  public void setSide(double side) {
    this.side = side;
  }

  public void showFigure() {
    System.out.println("Figura: ");
  }
}
