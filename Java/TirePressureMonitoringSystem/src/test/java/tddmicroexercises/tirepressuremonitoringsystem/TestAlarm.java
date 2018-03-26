package tddmicroexercises.tirepressuremonitoringsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestAlarm {

  @Mock
  private SensorRandom sensorRandom;

  @Test
  public void test_alarm_creation() {
    new Alarm(sensorRandom, 10, 20);
  }

  @Test
  public void test_check_gets_next_sensor_value() {
    when(sensorRandom.popNextPressurePsiValue()).thenReturn(11.0);
    final Alarm alarm = new Alarm(sensorRandom, 10, 20);
    alarm.check();
    verify(sensorRandom).popNextPressurePsiValue();
    verifyNoMoreInteractions(sensorRandom);
  }

  @Test
  public void test_low_pressure_sets_alarm() {
    when(sensorRandom.popNextPressurePsiValue()).thenReturn(9.0);
    final Alarm alarm = new Alarm(sensorRandom, 10, 20);
    alarm.check();
    assertThat(alarm.isAlarmOn()).isTrue();
  }

  @Test
  public void test_high_pressure_sets_alarm() {
    when(sensorRandom.popNextPressurePsiValue()).thenReturn(21.0);
    final Alarm alarm = new Alarm(sensorRandom, 10, 20);
    alarm.check();
    assertThat(alarm.isAlarmOn()).isTrue();
  }
}
