package pe.isil.models;

public class Dispositivo {
  Mensajeria mensajeria;

  

  public void enviarMensaje(String mensaje, String destino) {
    mensajeria.enviarMensaje(mensaje, destino);
  }



  public Mensajeria getMensajeria() {
    return mensajeria;
  }



  public void setMensajeria(Mensajeria mensajeria) {
    this.mensajeria = mensajeria;
  }
}
