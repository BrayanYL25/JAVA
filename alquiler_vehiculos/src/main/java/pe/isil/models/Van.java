package pe.isil.models;

public class Van extends Vehicle {  // Clase "Camioneta"
  double loadingCapacity;
  double diaryFee;
  // int days;
  
  public Van(String plateNumber, String model, String mark, double loadingCapacity, double diaryFee) {
    super(plateNumber, model, mark);
    this.loadingCapacity = loadingCapacity;
    this.diaryFee = diaryFee;
    // , int days
    // this.days = days;
  }

  public double getLoadingCapacity() {
    return loadingCapacity;
  }

  public void setLoadingCapacity(double loadingCapacity) {
    this.loadingCapacity = loadingCapacity;
  }

  public double getDiaryFee() {
    return diaryFee;
  }

  public void setDiaryFee(double diaryFee) {
    this.diaryFee = diaryFee;
  }

  // public int getDays() {
  //   return days;
  // }

  // public void setDays(int days) {
  //   this.days = days;
  // }

  @Override
  public double calcTotalAmount(int days) {
    return days * this.diaryFee;
  }

  @Override
  public String toString() {
    return super.toString() + "\nLoading Capacity: " + loadingCapacity + "\nDiary Fee: " + diaryFee; // + "\nDays: " + days
  }
}
