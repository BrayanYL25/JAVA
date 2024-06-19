package pe.isil;

import pe.isil.models.CardPayment;
import pe.isil.models.IPayment;
import pe.isil.models.PayPalPayment;
import pe.isil.models.ProcessorPayment;

public class Main {
    public static void main(String[] args) {
        IPayment cardpayment = new CardPayment("1234567", "Jorque Quevedo KLK");
        IPayment cardpaypal = new PayPalPayment("jorgepolaris12345@gmail.co");

        cardpayment.processPayment(1000);
        cardpaypal.processPayment(12354);

        ProcessorPayment processorPayment = new ProcessorPayment(cardpayment);
        processorPayment.processPayment(10000);

        processorPayment.setPayment(cardpaypal);
        processorPayment.processPayment(123789);

    }
}