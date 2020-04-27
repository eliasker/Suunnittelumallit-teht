package Prototype;

public class Clock {
  private Pointer minutes;
  private Pointer hours;

  public Clock() {
    this.minutes = new Pointer();
    this.hours = new Pointer();
  }

  public void minutePassed() {
    if (minutes.getNumber() < 59) {
      minutes.increaseNumber();
    } else {
      minutes.resetNumber();
      hourPassed();
    }
  }

  public void hourPassed() {
    if (hours.getNumber() < 12) {
      hours.increaseNumber();
    } else {
      hours.resetNumber();
    }
  }

  public String getTime() {
    return hours.getNumber() + ":" + minutes.getNumber();
  }
}