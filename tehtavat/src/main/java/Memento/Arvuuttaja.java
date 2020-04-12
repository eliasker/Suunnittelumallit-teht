package Memento;

// Caretaker.
// Pyörittää peliä, jossa useita asiakkaita säikeinä.
// Asiakas välittää itsensä parametrinä, jolloin tälle arvotaan luku.
// Lukua arvatessa asiakas välittää itsensä ja arvauksen (Memento).
// Arvuuttaja palauttaa true / false.
public class Arvuuttaja {
  private static Arvuuttaja INSTANCE = null;

  private Arvuuttaja() {
  }

  static synchronized Arvuuttaja getInstance() {
    if (INSTANCE == null)
      INSTANCE = new Arvuuttaja();
    return INSTANCE;
  }

  public void liityPeliin(Arvaaja arvaaja) {
    System.out.println(arvaaja.getNimi() + " liittyi peliin");
    arvaaja.setMemento(new Memento(arvaaja.getNimi(), getUusiLuku()));
  }

  public boolean arvaus(Object obj) {
    Memento memento = (Memento) obj;
    int arvattuLuku = getUusiLuku();
    System.out.println(memento.getNimi() + " arvasi: " + arvattuLuku);
    return memento.getArvattava() == getUusiLuku();
  }

  public int getUusiLuku() {
    return (int) Math.floor(Math.random() * 10);
  }

  private class Memento {
    private String nimi;
    private int arvattavaLuku;

    public Memento(String nimi, int luku) {
      this.nimi = nimi;
      this.arvattavaLuku = luku;
    }

    public int getArvattava() {
      return arvattavaLuku;
    }

    public String getNimi() {
      return nimi;
    }
  }
}