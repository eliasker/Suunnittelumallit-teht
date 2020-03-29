package Observer;

import java.util.Observable;

/**
 * ClockTimer on konkreettinen subjekti, joka sisältää ajan muuttujat (tarkkailtava tila).
 * tick() -metodi päivittää aika yhdellä sekunilla ja ilmoittaa tarkkailijoille tilan muutoksesta.
 * timeToString() -metodi palauttaa ajan merkkijonona hh:mm:ss -muodossa.
 */
public class ClockTimer extends Observable {
  private int seconds;
  private int minutes;
  private int hours;

  public ClockTimer() {

  }

  public int getSeconds() {
    return seconds;
  }

  public int getMinutes() {
    return minutes;
  }

  public int getHours() {
    return hours;
  }

  public void tick() {
    if (seconds != 59)
      seconds++;
    else {
      seconds = 0;
      if (minutes != 59)
        minutes++;
      else {
        minutes = 0;
        hours++;
      }
    }
    setChanged();
    notifyObservers(timeToString());
  }
  
  public String timeToString() {
    String secondsString = seconds < 10 ? "0" + getSeconds() : "" + getSeconds();
    String minutesString = minutes < 10 ? "0" + getMinutes() : "" + getMinutes();
    String hoursString = hours < 10 ? "0" + getHours() : "" + getHours();
    return hoursString + ":" + minutesString + ":" + secondsString;
  }
}