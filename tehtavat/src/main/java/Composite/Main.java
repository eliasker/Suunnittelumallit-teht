package Composite;

public class Main {
  public static void main(String[] args) {
    Koostekomponentti kotelo = new Koostekomponentti("kotelo", 50);
    Koostekomponentti emolevy = new Koostekomponentti("emolevy", 100);
    kotelo.add(emolevy);
    Osa prosessori = new Osa("prosessori", 500);

    Osa muisti = new Osa("muisti", 200);
    emolevy.add(prosessori);
    emolevy.add(muisti);

    Osa hilavitkutin = new Osa("hilavitkutin", 10000);
    kotelo.add(hilavitkutin);
    Osa tarra = new Osa("tarra", 1);
    kotelo.add(tarra);

    System.out.println("Yhteenlaskettu hinta: " + kotelo.getHinta());
  }
}