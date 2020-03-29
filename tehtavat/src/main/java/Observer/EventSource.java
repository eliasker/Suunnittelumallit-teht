package Observer;

public class EventSource extends Thread {
  private ClockTimer timer;

  public EventSource(ClockTimer timer) {
    this.timer = timer;
  }

  @Override
  public void run() {
    while (true) {
      try {
        sleep(1000);
        timer.tick();
        if (timer.getHours() > 2)
          break;
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}