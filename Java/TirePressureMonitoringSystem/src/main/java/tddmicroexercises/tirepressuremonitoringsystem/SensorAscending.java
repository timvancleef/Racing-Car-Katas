package tddmicroexercises.tirepressuremonitoringsystem;

public class SensorAscending {

  private double psiValue = 10.0;

  public double popNextPressurePsiValue() {
    psiValue += 0.5;
    return psiValue;
  }
}
