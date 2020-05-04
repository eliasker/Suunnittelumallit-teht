package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>(Arrays.asList("eka", "toka", "kolmas", "neljäs", "viides", "kuudes",
        "seitsemäs", "kahdeksas", "yhdeksäs", "kymmenes"));
    test1(arr);
    //test2(arr);
    /*
    test3(arr);
    test4(arr);
    */

  }

  // Kokoelman iterointi kahdella samanaikaisella säikeellä
  // Säikeillä omat iteraattorit
  static void test1(ArrayList<String> arr) {
    System.out.println("Test case 1:");
    ListIterator<String> iterator1 = arr.listIterator();
    ListIterator<String> iterator2 = arr.listIterator();

    ThreadIterator th1 = new ThreadIterator("Säie 1", iterator1);
    ThreadIterator th2 = new ThreadIterator("Säie 2", iterator2);
    th1.start();
    th2.start();
  }

  // Kokoelman iterointi kahdella vuorottelevalla säikeellä
  static void test2(ArrayList<String> arr) {
    System.out.println("Test case 2:");
    ListIterator<String> iterator = arr.listIterator();

    ThreadIterator th1 = new ThreadIterator("Säie 1", iterator);
    ThreadIterator th2 = new ThreadIterator("Säie 2", iterator);
    th1.start();
    th2.start();
  }

  // Kokoelmaan tehdään muutoksia iteroinnin läpikäynnin aikana
  static void test3(ArrayList<String> arr) {
    System.out.println("Test case 3:");
  }

  // TODO
  static void test4(ArrayList<String> arr) {
    System.out.println("Test case 4:");
  }
}