package Iterator;

import java.util.ListIterator;

public class EditingThreadIterator implements Runnable {
  private ListIterator<String> iter;
  private String name;

  public EditingThreadIterator(String name, ListIterator<String> iter) {
    this.name = name;
    this.iter = iter;
  }

  @Override
  public void run() {
    try {
      int i = 0;
      while (iter.hasNext()) {
        System.out.println(name + ": " + iter.next());
        // iter.add lisää arvon next() -metodilla saatavan jälkeen
        if (i == 4) {
          System.out.println("Lisätään arvo");
          iter.add("lisätty arvo " + i);
          System.out.println(iter.previous());
        }
        i++;
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}