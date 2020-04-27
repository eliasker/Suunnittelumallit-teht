package Prototype;

public class Main {
  public static void main(String[] args) {
    Clock clock = new Clock();
    Clock clone = (Clock) clock.clone();
    Clock clock2 = new Clock();
    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0) {
        clock.minutePassed();
        clock2.minutePassed();
      } else
        clone.minutePassed();
      if (i % 16 == 0) {
        System.out.println("original time: " + clock.getTime());
        System.out.println("clone cl time: " + clone.getTime());
        System.out.println("clock2 time" + clock2.getTime());
      }
    }
  }
}