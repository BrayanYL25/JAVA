package models;
public class BankAccount {
  String name;
  int accountNumber;
  double balance;

  public BankAccount(String name, int accountNumber) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = 0;
  }

  public BankAccount(String name, int accountNumber, double balance) {
    this.name = name;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;

      System.out.println("El monto depositado es " + this.balance);
    } else {
      System.out.println("El monto depositado debe ser positivo");
    }
  }

  public void withdrawal(double amount) {
    if(amount < 0) {
      System.out.println("No se puede realizar la operacion");
      System.out.println("Monto de retiro invalido");
      return;
    }

    if(this.balance < amount) {
      System.out.println("No se puede realizar la operacion");
      System.out.println("Saldo insufiente...");
      return;
    }

    this.balance -= amount;

    System.out.println("Retiro: " + amount);
    System.out.println("Saldo de cuenta: " + this.balance);
  }
}
