package FactoryMethod;

public class Opettaja3 extends AterioivaOtus {

  public Juoma createJuoma() {
    return new Käsidesi();
  };
}
