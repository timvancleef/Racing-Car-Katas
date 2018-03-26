package tddmicroexercises.tirepressuremonitoringsystem;

public class SensorAscending implements Sensor {

  private double seed = 9.0;

  public double popNextPressurePsiValue() {
    seed += 0.5;
    return seed;
  }
}
