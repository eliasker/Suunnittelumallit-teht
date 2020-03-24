package Composite;

public class Osa implements Laitteenosa {
  private String nimi;
  private int hinta;

  public Osa(String nimi, int hinta) {
    this.nimi = nimi;
    this.hinta = hinta;
  }

  @Override
  public int getHinta() {
    return this.hinta;
  }

  @Override
  public String getNimi() {
    return this.nimi;
  }

}
