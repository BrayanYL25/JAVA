package pe.isil.models;

public class PayPalPayment implements IPayment{
  String mail;

    public PayPalPayment(String mail) {
    this.mail = mail;
  }

  @Override
  public void processPayment(double amount) {
    System.out.println("Pago procesado con paypal: " + amount);
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  
}
