package pe.isil;

import pe.isil.models.Correo;
import pe.isil.models.Dispositivo;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo = new Dispositivo();

        dispositivo.setMensajeria(new Correo());
        dispositivo.enviarMensaje("hi", "jorgepolaris12345@gmail.com");
    }
}