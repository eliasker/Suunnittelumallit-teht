package Prototype;

public class Main {
  public static void main(String[] args) {
    // Luodaan prototyyppi
    Clock original = new Clock();
    // Kloonataan prototyyppi
    Clock clone = (Clock) original.clone();
    // Vertailun vuoksi luodaan toinen prototyyppi
    Clock clock2 = new Clock();
    int LIMIT = 2000;

    
    //test1(original, clone, clock2, LIMIT);
    test2(original, clone, clock2, LIMIT);
    //test3(original, clone, clock2, LIMIT);
  }

  static void test1(Clock original, Clock clone, Clock clock2, int LIMIT) {
    System.out.println("\nTesti 1: aika etenee vain prototyypeissä");
    for (int i = 0; i < LIMIT; i++) {
      original.minutePassed();
      clock2.minutePassed();
    }
    System.out
        .println("original: " + original.getTime() + " clone: " + clone.getTime() + " clock2: " + clock2.getTime());
  }

  static void test2(Clock original, Clock clone, Clock clock2, int LIMIT) {
    System.out.println("\nTesti 2: aika etenee vain kloonissa");
    for (int i = 0; i < LIMIT; i++) {
      clone.minutePassed();
    }
    System.out
        .println("original: " + original.getTime() + " clone: " + clone.getTime() + " clock2: " + clock2.getTime());
  }

  static void test3(Clock original, Clock clone, Clock clock2, int LIMIT) {
    System.out.println("\nTesti 3: aika etenee kaikissa");
    for (int i = 0; i < LIMIT; i++) {
      original.minutePassed();
      clone.minutePassed();
      clock2.minutePassed();
    }
    System.out
        .println("original: " + original.getTime() + " clone: " + clone.getTime() + " clock2: " + clock2.getTime());
  }
}