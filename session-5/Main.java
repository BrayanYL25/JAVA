import java.util.Scanner;

// import modelos.Person;
// import modelos.Cat;
import modelos.Employee;

public class Main {
  public static void main(String[] args) {
    // Person guy = new Person();

    // guy.setName("Mario");
    // guy.setAge(80);;
    // guy.setDni("0039270123");

    // Scanner scan = new Scanner(System.in);
    // System.out.println("Ingrese una fruta: ");
    // String fruit = scan.next();
    // guy.eat(fruit);
    // scan.close();
    // Scanner scan = new Scanner(System.in);
    // System.out.println("Dime el nombre del gato");
    // String name = scan.next();
    // System.out.println("Dime su raza");
    // String race = scan.next();
    // System.out.println("Dime su edad");
    // int age = scan.nextInt();

    // Cat garfield = new Cat(name, race, age);
    // scan.close();

    // garfield.meow();


    Scanner scan = new Scanner(System.in);

    System.out.println("Escriba el nombre del empleado: ");
    String name = scan.nextLine();
    System.out.println("Escriba su cargo: ");
    String position = scan.nextLine();
    System.out.println("Escriba su salario: ");
    float salary = scan.nextFloat();

    Employee employee = new Employee(name, position, salary);

    System.out.println("Quieres subirle el sueldo a tu empleado (si/no)");
    String increaseSalary = scan.next();


    if (increaseSalary.equals("si")) {
      System.out.println("Cuanto le quieres subir el sueldo (porcentage)");
      int percentage = scan.nextInt();
      employee.increseSalary(percentage);

      System.out.println("Sueldo subido");
      System.out.println(employee.getSalary());
    } else {
      System.out.println("Algo ocurrio");
    }


    scan.close();

  }
}
