package pe.isil;

import pe.isil.models.Vehicle;
import pe.isil.models.Car;
import pe.isil.models.Van;
import pe.isil.models.Booking;

public class Main {
    public static void main(String[] args) {
        // Crea la primera reserva
        System.out.println("\n1ra Reverva: ");
        // Crea un auto
        Vehicle car = new Car("A2Y-12D", "Accent", "Nissan", 4, 100);
        // Crea la reserva
        Booking firstBooking = new Booking(car, 5);
        // Imprime los datos de la reserva
        firstBooking.getBookingInfo();

        // Crea la segunda reserva
        System.out.println("\n2da Reserva: ");
        // Crea una van
        Vehicle van = new Van("1JL1-2NS", "Hiace", "Toyota", 500, 150);
        // Crea la reserva
        Booking secondBooking = new Booking(van, 5);
        // Imprime los datos de la reserva
        secondBooking.getBookingInfo();

        // Crea la tercera reserva
        System.out.println("\n3ra Reverva: ");
        // Crea un auto
        Vehicle lambo = new Car("AUY-J1K", "Murcielago", "Lamborghini", 2, 1000);
        // Crea la reserva
        Booking thirdBooking = new Booking(lambo, 5);
        // Imprime los datos de la reserva
        thirdBooking.getBookingInfo();
    }
}