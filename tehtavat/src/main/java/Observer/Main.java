package Observer;

public class Main {
  public static void main(String[] args) {
    ClockTimer timer = new ClockTimer();
    DigitalClock dg = new DigitalClock(timer);
    EventSource eventSource = new EventSource(timer);
    new Thread(eventSource).start();
  }
}