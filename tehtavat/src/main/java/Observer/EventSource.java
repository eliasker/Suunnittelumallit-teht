package Observer;

public class EventSource extends Thread {
  private ClockTimer timer;
  private int DELAY;
  private boolean changedDelay;

  public EventSource(ClockTimer timer) {
    this.timer = timer;
    DELAY = 1000;
    changedDelay = false;
  }

  @Override
  public void run() {
    while (!changedDelay) {
      try {
        sleep(DELAY);
        timer.tick();
        if (timer.getSeconds() > 10 && changedDelay == false) {
          System.out.println("Ajan rakenne on muuttunut.");
          sleep(DELAY);
          changedDelay = true;
          DELAY = 10;
          break;
        }
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    while (changedDelay) {
      try {
        sleep(DELAY);
        timer.tick();
        if (timer.getHours() >= 2)
          break;
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}