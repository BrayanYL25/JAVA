package pe.isil.models;

public class Switch {
  LightBulb lightBulb;

  public Switch(LightBulb lightBulb) {
    this.lightBulb = lightBulb;
  }

  public void operate() {
    lightBulb.turnOn();
  }
}
