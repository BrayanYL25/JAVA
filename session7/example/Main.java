import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Operaciones númericas");
    System.out.println("Ingrese dos números: ");

    Scanner scan = new Scanner(System.in);
    double number1 = scan.nextDouble();
    double number2 = scan.nextDouble();

    double max = Math.max(number1, number2);
    double min = Math.min(number1, number2);
    System.out.println("El número mayor es: " + max);
    System.out.println("El número mayor es: " + min);


    double minimus = Math.decrementExact((int) max);
    double maximus = Math.incrementExact((int) min);

    System.out.println(minimus);
    System.out.println(maximus);
    scan.close();

  }
}