package Composite;

import java.util.ArrayList;

public class Koostekomponentti implements Laitteenosa {
  private final ArrayList<Laitteenosa> osat = new ArrayList<>();
  private String nimi;
  private int hinta;

  public Koostekomponentti(String nimi, int hinta) {
    this.nimi = nimi;
    this.hinta = hinta;
  }

  public void add(Laitteenosa osa) {
    osat.add(osa);
  }

  @Override
  public int getHinta() {
    int osienHinta = 0;
    for (Laitteenosa o : osat) {
      osienHinta += o.getHinta();
    }
    return osienHinta + this.hinta;
  }

  @Override
  public String getNimi() {
    return nimi;
  }

}