package pe.isil.models;

public class Correo implements Mensajeria {

  @Override
  public void enviarMensaje(String mensaje, String destino) {
    System.out.println("Correo enviado a " + destino + " con el mensaje " + mensaje);
  }
  
}
