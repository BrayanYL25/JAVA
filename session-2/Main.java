public class Main {
  public static void main(String[] args) {
    //  Invocacion a un metodo non-static
    // Student elBuenJorge = new Student(18, "Brayan Yin Lin", "76950977");
    // elBuenJorge.getName();
    // elBuenJorge.name = "El Buen Jorge";
    // elBuenJorge.getName();

    // //  New student
    // Student sanMaryse = new Student(19, "San Maryse", "4655715");
    // sanMaryse.getName();

    // //  Invocacion a un metodo static
    // System.out.println(Math.addNumbers(5, 3));


    // showMessage(); 

    Test.getAllSizes(2, 6);
    System.out.println(
      Test.allEqual(2, 3, 4, 4)
    );
  }
  public static void showMessage () {
    Example.getMessage();
  }
}
