package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm {
  private final double LowPressureThreshold = 17;
  private final double HighPressureThreshold = 21;

  // Sensor should also be able to use new SensorAscending
  Sensor sensor = new Sensor();

  boolean alarmOn = false;

  public void check() {
    double psiPressureValue = sensor.popNextPressurePsiValue();

    if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue) {
      alarmOn = true;
    }
  }

  public boolean isAlarmOn() {
    return alarmOn;
  }
}
