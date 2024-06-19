package pe.isil.models;

public class CardPayment implements IPayment {
  String cardNumber;
  String cardHolder;

  public CardPayment(String cardNumber, String cardHolder) {
    this.cardNumber = cardNumber;
    this.cardHolder = cardHolder;
  }

  @Override
  public void processPayment(double amount) {
    System.out.println("Se procesa el monto: " + amount);      
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
  }
  
  
}
