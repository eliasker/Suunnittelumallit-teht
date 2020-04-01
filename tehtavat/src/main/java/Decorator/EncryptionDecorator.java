package Decorator;

import java.util.ArrayList;

/**
 * 
 */
public class EncryptionDecorator extends AbstractTextHandler {
  private char currentChar;
  private int KEY = 13;

  public EncryptionDecorator(TextHandler textHandler) {
    super(textHandler);
  }

  @Override
  public void read() {
    // String strFromFile = "this text is encrypted";
    // String decryptedStr = decrypt(strFromFile);
    // System.out.println("read");

  }

  @Override
  public void write(String str) {
    String encryptedStr = encrypt(str);
    System.out.println("Encrypting " + str + " to: " + encryptedStr);
    super.write(encryptedStr);
  }

  // Jokaisella ASCII -merkillä on on numeerinen vastinen (ASCII table)
  // Kirjainta vastaavaan desimaalilukuun lisäätään avain (int KEY).
  // Summa muunnetaan characteriksi ja tallennetaan palautettavaan merkkijonoon
  // Merkkien alaraja 32 on välilyönti ja yläraja 126 '~' -merkki
  // Metodi tekee jokaiselle merkkijonon merkille saman operaation
  private String encrypt(String str) {
    String encryptedStr = "";
    int MIN = 32;
    int MAX = 126;
    for (int i = 0; i < str.length(); i++) {
      currentChar = str.charAt(i);
      currentChar += KEY;
      if (currentChar > MAX)
        currentChar = (char) (MIN + (currentChar - MAX - 1));
      encryptedStr += currentChar;
    }
    return encryptedStr;
  }

  private ArrayList<String> decrypt(ArrayList<String> lines) {
    ArrayList<String> decryptedLines = new ArrayList<>();
    for (String line : lines) {
      // TODO: decrypt
      decryptedLines.add(line);
    }

    return decryptedLines;
  }

  @Override
  public void clear() {
    System.out.println("file cleared");
  }

  @Override
  public ArrayList<String> getLines() {
    return super.getLines();
  }

}