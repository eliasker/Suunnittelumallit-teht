package Observer;

public class Main {
  public static void main(String[] args) {

    ClockTimer timer = new ClockTimer();

    for (int i = 0; i < 20000; i++) {
      timer.tick();
      if (i % 250 == 0)
        System.out.println("Time is: " + timer.getTime());
    }
    System.out.println("Final time is: " + timer.getTime());

  }
}