package FactoryMethod;

//import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    AterioivaOtus opettaja = new Opettaja();
    AterioivaOtus opettaja2 = new Opettaja2();
    AterioivaOtus opettaja3 = new Opettaja3();

    /*
     * ArrayList<AterioivaOtus> opettajat = new ArrayList<AterioivaOtus>();
     * opettajat.add(opettaja); opettajat.add(opettaja2); opettajat.add(opettaja3);
     * for (AterioivaOtus o : opettajat) o.aterioi();
     */
    AterioivaOtus opettajat[] = { opettaja, opettaja2, opettaja3 };
    for (AterioivaOtus o : opettajat) o.aterioi();
  }
}
