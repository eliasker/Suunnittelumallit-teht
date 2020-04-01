package Decorator;

// Utility jolla voi lukea käyttäjän syöteitä, vaihtoehdot: int, char, double tai rivi
import util.Read;

// Konsolikäyttöliittymä tiedostoon kirjoittamiselle 
// Operaatiot: Read from, Write to, Clear file & Quit 
// Read & write voi valita käyttääkö normaalia vai dekoroitua kirjoittajaa
public class Main {
  public static void main(String[] args) {
    // Konkreettinen komponentti
    TextHandler basicHandler = new TextHandler();
    // Konkreettinen dekoraattori 
    EncryptionDecorator encryptionHandler = new EncryptionDecorator(new TextHandler());
    char input;
    do {
      System.out.println("1 write to file\t2 print file\t3 clear file\t4 quit");
      input = Read.character();
      switch (input) {
        case '1':
          System.out.println("1 normal\t2 encrypted");
          input = Read.character();
          if (input == '1') {
            System.out.println("No encryption:");
            basicHandler.write(Read.line());
          }
          if (input == '2') {
            System.out.println("Encrypting:");
            encryptionHandler.write(Read.line());
          }
          break;
        case '2':
          System.out.println("1 normal\t2 encrypted");
          input = Read.character();
          if (input == '1')
            basicHandler.read();
          else if (input == '2')
            encryptionHandler.read();
          break;
        case '3':
          basicHandler.clear();
          System.out.println("File cleared");
          break;
        case '4':
          System.out.println("Quitting program");
          break;
      }
    } while (input != '4');
  }
}