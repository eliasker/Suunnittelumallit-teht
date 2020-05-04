package Iterator;

import java.util.ListIterator;

public class ThreadIterator extends Thread {
  private ListIterator<String> iter;
  private String name;

  public ThreadIterator(String name, ListIterator<String> iter) {
    this.name = name;
    this.iter = iter;
  }

  @Override
  public void run() {
    while (iter.hasNext()) {
      System.out.println(name + ": " + iter.next());
    }
  }
  
}