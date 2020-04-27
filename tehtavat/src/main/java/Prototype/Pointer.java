package Prototype;

public class Pointer {
  private int number;

  public Pointer() {
    this.number = 0;
  }

  public void increaseNumber() {
    number++;
  }

  public void resetNumber() {
    number = 0;
  }

  public int getNumber() {
    return number;
  }
}