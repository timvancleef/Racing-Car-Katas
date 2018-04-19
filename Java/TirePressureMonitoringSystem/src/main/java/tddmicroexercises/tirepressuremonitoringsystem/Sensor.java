package tddmicroexercises.tirepressuremonitoringsystem;

import java.util.Random;

class Sensor {
  private static final double OFFSET = 16;

  double popNextPressurePsiValue() {
    return OFFSET + samplePressure();
  }

  private static double samplePressure() {
    Random basicRandomNumbersGenerator = new Random();
    return 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
  }
}
