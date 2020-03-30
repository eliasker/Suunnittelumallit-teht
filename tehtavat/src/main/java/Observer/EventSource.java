package Observer;

public class EventSource extends Thread {
  private ClockTimer timer;
  private int DELAY;

  public EventSource(ClockTimer timer) {
    this.timer = timer;
    this.DELAY = 1000;
  }

  @Override
  public void run() {
    while (true) {
      try {
        sleep(DELAY);
        timer.tick();
        if (timer.getSeconds() > 9 && DELAY == 1000) {
          System.out.println("Ajan rakenne on muuttunut.");
          sleep(DELAY);
          DELAY = 10;
        }
        if (timer.getHours() > 2) {
          break;
        }
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}