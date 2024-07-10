package pe.isil.models;

public abstract class Vehicle implements Rentable { // Clase abstracta "Vehiculo"
  String plateNumber;
  String model;
  String mark;

  public Vehicle(String plateNumber, String model, String mark) {
    this.plateNumber = plateNumber;
    this.model = model;
    this.mark = mark;
  }

  public String getPlateNumber() {
    return plateNumber;
  }

  public void setPlateNumber(String plateNumber) {
    this.plateNumber = plateNumber;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }
  
  @Override
  public String toString() {
    return "Plate number: " + plateNumber + "\nModel: " + model + "\nMark: " + mark;
  }
}
