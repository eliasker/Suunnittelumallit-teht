package Prototype;

public class Main {
  public static void main(String[] args) {
    Clock clock = new Clock();

    for (int i = 0; i < 1000; i++) {
      clock.minutePassed();
        System.out.println(clock.getTime());
    }
  }
}