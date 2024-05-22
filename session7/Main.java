import models.BankAccount;

public class Main {

  public static void log(String x) {
    System.out.println(x);
  }

  public static void main(String[] args) {
    BankAccount account = new BankAccount("Jorge Quevedo", 76950977, 10);

    log(account.getName());    
  }
}
