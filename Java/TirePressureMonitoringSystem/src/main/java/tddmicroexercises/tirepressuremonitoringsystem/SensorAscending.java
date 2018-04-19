package tddmicroexercises.tirepressuremonitoringsystem;

class SensorAscending {

  private double psiValue = 10.0;

  double popNextPressurePsiValue() {
    psiValue += 0.5;
    return psiValue;
  }
}
