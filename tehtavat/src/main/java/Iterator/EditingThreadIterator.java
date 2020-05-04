package Iterator;

import java.util.ListIterator;

public class EditingThreadIterator extends Thread {
  private ListIterator<String> iter;
  private String name;

  public EditingThreadIterator(String name, ListIterator<String> iter) {
    this.name = name;
    this.iter = iter;
  }

  @Override
  public void run() {
    int i = 0;
    while (iter.hasNext()) {
      System.out.println(name + ": " + iter.next());
      if (i < 1) {
        System.out.println("Lisätään arvo");
        iter.add("lisätty arvo " + i);
        i++;
      }
    }
  }
}