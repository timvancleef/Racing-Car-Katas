package tddmicroexercises.tirepressuremonitoringsystem;

import java.util.Random;

// The reading of the pressure value from the sensor is simulated in this implementation.
// Because the focus of the exercise is on the other class.

public class SensorRandom implements Sensor {
  private static final double OFFSET = 16;

  public double popNextPressurePsiValue() {
    return OFFSET + samplePressure();
  }

  private static double samplePressure() {
    Random basicRandomNumbersGenerator = new Random();
    return 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
  }
}
