package Prototype;

public class Clock implements Cloneable {
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

  @Override
  public Object clone() {
    Clock clone= null;

    try {
      clone = (Clock) super.clone();
    } catch (CloneNotSupportedException e) {
      System.out.println("Exception cloning");
      clone = new Clock();
    }

    return clone;
  }
}