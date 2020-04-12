package Memento;

public class Main {
  public static void main(String[] args) {
    Arvaaja testi = new Arvaaja("testi");

    Arvuuttaja.getInstance().liityPeliin(testi);
    for (int i = 0; i < 10; i++) {
      if (Arvuuttaja.getInstance().arvaus(testi.getMemento()))
        System.out.println("oikein");
    }
  }
}