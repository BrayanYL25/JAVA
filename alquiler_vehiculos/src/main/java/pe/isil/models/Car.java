package pe.isil.models;

public class Car extends Vehicle { // Clase "Auto"
  int doorsQuantity;
  int days;
  double diaryFee;
  
  public Car(String plateNumber, String model, String mark, int doorsQuantity, double fee, int days){
    super(plateNumber, model, mark);
    this.doorsQuantity = doorsQuantity;
    this.diaryFee = fee;
    this.days = days;
  }

  public int getDoorsQuantity() {
    return doorsQuantity;
  }

  public void setDoorsQuantity(int doorsQuantity) {
    this.doorsQuantity = doorsQuantity;
  }

  public double getDiaryFee() {
    return diaryFee;
  }

  public void setDiaryFee(double diaryFee) {
    this.diaryFee = diaryFee;
  }

  public int getDays() {
    return days;
  }

  public void setDays(int days) {
    this.days = days;
  }

  @Override
  public double calcTotalAmount() {
    return this.days * this.diaryFee;
  }

  @Override
  public String toString() {
      return super.toString() + "\nDoors Quantity: " + doorsQuantity + "\nDiary Fee: " + diaryFee + "\nDays: " + days;
  }

}
