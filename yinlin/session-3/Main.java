import java.util.Scanner;

class Main {

  public static int sumNumber(int limit) {
    return (limit * (limit + 1) / 2);
  }

  // Crear una función que reciba como parámetro un número entero y retorne
  // verdadero si el numer

  public static boolean isOdd(int num) {
    if (num == 0) {
      return false;
    }
    return num % 2 == 0;
  }

  public static void isOddPrint(int num) {
    if (isOdd(num)) {
      System.out.println("Es par");
    } else {
      System.out.println("No es par");
    }
  }

  public static int bigger(int a, int b) {

    return a > b ? a : b;
  }

  public static String getDay (int day) {
    switch (day) {
      case 1:
        return "Lunes";
      case 2:
        return "Martes";
      case 3:
        return "Miercoles";
      case 4:
        return "Jueves";
      case 5:
        return "Viernes";
      case 6:
        return "Sabado";
      case 7:
        return "Domingo";
      default:
        return "Write a number between 1 and 7";
    }
  }

  // public static void main(String[] args) {
  //   Scanner scan = new Scanner(System.in);

  //   // int input = scan.nextInt();
  //   // int result = sumNumber((int) input);

  //   // System.out.println(result);

  //   // Closing scanner
  //   // scan.close();

  //   // Ejercicio 2
  //   // boolean number = isOdd(9);
  //   // System.out.println(number);

  //   // isOddPrint(10);

  //   // int whatIsBigger = bigger(4, 0);
  //   // System.out.println(whatIsBigger);

  //   int day = scan.nextInt();
  //   String currentDay = getDay(day);

  //   System.out.println(currentDay);
  //   scan.close();
  // }
}