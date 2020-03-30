package Singleton;

public class Timer {
  private int seconds;
  private static Timer INSTANCE = null;

  private Timer() {
  }

  public static Timer getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Timer();
    }
    return INSTANCE;
  }

  public void tick() {
    seconds++;
  }

  public void printTime() {
    System.out.println(seconds);
  }
}