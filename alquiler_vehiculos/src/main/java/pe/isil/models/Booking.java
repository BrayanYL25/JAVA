package pe.isil.models;

public class Booking {
  Vehicle vehicle;
  int days;

  public Booking(Vehicle vehicle, int days) {
    this.vehicle = vehicle;
    this.days = days;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public double calcTotalAmountForBooking() {
    return vehicle.calcTotalAmount(days);
  }

  public void getBookingInfo() {
    System.out.println(vehicle.toString() + "\nDays: " + days + "\nTotal Amount: " +  calcTotalAmountForBooking());
  }
}
