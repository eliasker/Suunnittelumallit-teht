package Memento;

// Originator
public class Arvaaja {
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
}
