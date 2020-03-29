package Observer;

import java.util.Observable;
import java.util.Observer;

// DigitalClock on konkreettinen tarkkailija, joka tarkkailee konkreettista subjektia (ClockTimer). 
// DigitalClock liitetään tarkkailemaan yhden ClockTimerin tilan muutoksia.
// Tilan päivittyessä uusi tila tulostetaan update() -metodilla
public class DigitalClock implements Observer {
  private ClockTimer timer;

  public DigitalClock(ClockTimer clockTimer) {
    timer = clockTimer;
    timer.addObserver(this);
  }

  /***
   * Tulostaa parametrina tulovan merkkijonon, mikäli o on tarkkailtava ClockTimer
   * @param o tarkkailtava objekti
   * @param arg o.notifyObserver() -metodista saatava argumentti. Tässä tapauksessa aika ilmoitettuna hh:mm:ss
   */
  @Override
  public void update(Observable o, Object arg) {
    if (o == timer)
      System.out.println((String) arg);
  }
}