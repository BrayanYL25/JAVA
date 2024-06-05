package pe.isil.models;

public class Athele {
  int tshirtNumber;
  String name;
  double record;
  double carerTime;

  public Athele(String name, int tshirtNumber, double carerTime) {
    this.name = name;
    this.tshirtNumber = tshirtNumber;
    this.carerTime = carerTime;
    this.record = 0;
  }

  public int getTshirtNumber() {
    return tshirtNumber;
  }

  public void setTshirtNumber(int tshirtNumber) {
    this.tshirtNumber = tshirtNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getRecord() {
    return record;
  }

  public void setRecord(double record) {
    this.record = record;
  }

  public double getCarerTime() {
    return carerTime;
  }

  public void setCarerTime(double carerTime) {
    this.carerTime = carerTime;
  }

  public String toString() {
    return this.tshirtNumber + " - " + this.name + " - " + this.record + " - " + this.carerTime;
  }
}
