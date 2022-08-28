import ru.netology.Radio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void currentStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

   @Test
    public void nextStation(){
       Radio radio = new Radio();
       radio.setCurrentStation(5);

       radio.nextStation();

       int expected = 6;
       int actual = radio.getCurrentStation();

       assertEquals(expected, actual);
   }
    @Test
    public void prevStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }
    @Test
    public void  increaseVolume (){
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

       int expected = 2;
       int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume (){
        Radio radio = new Radio();
        radio.setCurrentVolume(3);

        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

  }