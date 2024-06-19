package pe.isil.models;

public class Sms implements Mensajeria {

  @Override
  public void enviarMensaje(String mensaje, String destino) {
    System.out.println("SMS enviado a " + destino + " con el mensaje " + mensaje);
  }
  
}
