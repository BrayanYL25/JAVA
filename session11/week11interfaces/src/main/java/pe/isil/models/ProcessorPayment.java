package pe.isil.models;

public class ProcessorPayment {
  IPayment payment;

  public ProcessorPayment(IPayment payment) {
    this.payment = payment;
  }

  public IPayment getPayment() {
    return payment;
  }

  public void setPayment(IPayment payment) {
    this.payment = payment;
  }

  public void processPayment(double amount) {
    payment.processPayment(amount);
  }
}
