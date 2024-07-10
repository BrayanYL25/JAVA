package pe.isil.models;

public class Booking {
  Vehicle vehicle;

  public Booking(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public double calcTotalAmountForBooking() {
    return vehicle.calcTotalAmount();
  }

  public void getBookingInfo() {
    System.out.println(vehicle.toString() + "\nTotal Amount: " +  calcTotalAmountForBooking());
  }
}
