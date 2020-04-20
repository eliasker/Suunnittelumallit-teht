package Adapter;

public class Main {
  public static void main(String[] args) {
    // Lähde tarjoaa päivämääriä merkkijonoina dd/MM/yyyy -muodossa
    DateStringProvider source = new DateSource("2025", "11", "10"); // konstruktori(vuosi kuukausi päivä)
    System.out.println("Alkuperäinen päivämäärä: " + source.getDate());

    // Asiakas haluaa päivämäärät Date -tyyppisinä
    DateObjectProvider adapter = new DateAdapter(source);
    System.out.println("Muutettu päivämäärä: " + adapter.getDate());
  }
}