package Decorator;

import java.util.ArrayList;

// Concrete decorator, lisäominaisuudet komponenttiin
// Tässä tapauksessa tiedostoon kirjoitus/luku, with a twist:
// Caesarin salakirjoitus ASCII -merkeillä
public class EncryptionDecorator extends AbstractTextHandler {
  private int KEY = 100; // Salauksen avain
  private int MIN = 32; // ASCII ' ' -merkkiä vastaava desimaaliluku
  private int MAX = 126; // ASCII '~' -merkkiä vastaava desimaaliluku
  private int curr; // Apumuuttuja merkkiä vastaavalle desimaaliluvulle

  public EncryptionDecorator(TextHandler textHandler) {
    super(textHandler);
  }

  // Kutsuu parent -classin getLines(), hakee luettavat rivit tiedostosta
  @Override
  public ArrayList<String> getLines() {
    return super.getLines();
  }

  @Override
  public void read() {
    for (String encryptedLine : getLines()) {
      System.out.println("decrypted line: " + decrypt(encryptedLine));
    }
  }

  // Lähettää merkkijonon salattavaksi Jonka jälkeen kutsuu vanhemman
  // tiedostoonkirjoitus metodia
  @Override
  public void write(String str) {
    String encryptedStr = encrypt(str);
    System.out.println("Encrypting " + str + " to: " + encryptedStr);
    super.write(encryptedStr);
  }

  // Jokaisella ASCII -merkillä on on numeerinen vastinen (ks. ASCII table)
  // Kirjainta vastaavaan desimaalilukuun lisäätään avain (int KEY).
  // Summaa vastaava uusi merkki tallennetaan salattun merkkijonoon
  // Käytössä luvut MIN ja MAX väliltä, jos SUM > MAX --> käytetään ylijäämää
  // Metodi tekee jokaiselle merkkijonon merkille saman operaation
  // SUM > MAX laskussa tarvitaan -1 ensimmäiseen alkioon pääsyksi
  private String encrypt(String str) {
    String encryptedStr = "";
    for (int i = 0; i < str.length(); i++) {
      curr = str.charAt(i) + KEY;
      if (curr > MAX)
        curr = curr - MAX + MIN - 1;
      encryptedStr += (char) curr;
    }
    return encryptedStr;
  }

  // Sama kuin yllä, mutta toisinpäin :D
  private String decrypt(String encryptedString) {
    String decryptedString = "";
    for (int i = 0; i < encryptedString.length(); i++) {
      curr = encryptedString.charAt(i) - KEY;
      if (curr < MIN)
        curr = MAX - MIN + curr + 1;
      decryptedString += (char) curr;
    }
    return decryptedString;
  }

  @Override
  public void clear() {
    super.clear();
  }
}