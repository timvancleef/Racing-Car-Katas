package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm {
  private final double lowPressureThreshold;
  private final double highPressureThreshold;
  private final Sensor sensor;

  private boolean alarmOn = false;

  Alarm(Sensor sensor, double lowPressureThreshold, double highPressureThreshold) {
    this.lowPressureThreshold = lowPressureThreshold;
    this.highPressureThreshold = highPressureThreshold;
    this.sensor = sensor;
  }

  public void check() {
    final double psiPressureValue = sensor.popNextPressurePsiValue();

    if (psiPressureValue < lowPressureThreshold || psiPressureValue > highPressureThreshold) {
      alarmOn = true;
    }
  }

  public boolean isAlarmOn() {
    return alarmOn;
  }
}
