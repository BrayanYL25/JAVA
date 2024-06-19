package pe.isil;

import pe.isil.models.Figure;
import pe.isil.models.Rectangle;
import pe.isil.models.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure figura = new Rectangle(10, 8);
        figura.calcArea();


        Figure figuraTwo = new Triangle(5, 2);
        figuraTwo.calcArea();
    }
}