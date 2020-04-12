package Memento;

public class Main {
  public static void main(String[] args) {
    int pelaajia = 5;
    String[] nimet = {"Make", "Mikko", "Makedius", "Mirja", "Marko", "Marketta"};
    Thread[] pelaajat = new Thread[pelaajia];

    for (int i = 0; i < pelaajia; i++) {
      Arvaaja a = new Arvaaja(nimet[i]);
      Arvuuttaja.getInstance().liityPeliin(a);
      pelaajat[i] = new Thread(a);
    }

    for (Thread t : pelaajat) {
      t.start();
    }
  }
}