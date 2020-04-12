package Memento;

// Originator
public class Arvaaja implements Runnable {
  private Object memento;
  private String nimi;

  public Arvaaja(String nimi) {
    this.nimi = nimi;
  }

  public void setMemento(Object memento) {
    this.memento = memento;
  }

  public String getNimi() {
    return nimi;
  }

  public Object getMemento() {
    return memento;
  }

  @Override
  public void run() {
    try {
      while (true) {
        int luku = arvaaLuku();
        if (Arvuuttaja.getInstance().arvaus(getMemento(), luku)) {
          System.out.println(getNimi() + " arvasi oikein");
          break;
        }
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public int arvaaLuku() {
    return (int) Math.floor(Math.random() * 10);
  }
}
