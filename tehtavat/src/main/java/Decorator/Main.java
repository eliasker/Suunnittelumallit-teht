package Decorator;

// Utility containg methods for reading user input such as: int, char, double, line
import util.Read;

public class Main {
  public static void main(String[] args) {
    TextHandler basicHandler = new TextHandler();
    EncryptionDecorator encryptionHandler = new EncryptionDecorator(new TextHandler());
    char input;
    do {
      System.out.println("1 write to file\t2 print file\t3 clear file\t4 quit");
      input = Read.character();
      switch (input) {
        case '1':
          System.out.println("Modes: 1 normal\t2 encrypted");
          input = Read.character();
          if (input == '1') {
            System.out.println("Write:");
            basicHandler.write(Read.line());
          }
          if (input == '2') {
            System.out.println("Encrypt:");
            encryptionHandler.write(Read.line());
          }
          break;
        case '2':
          System.out.println("Modes: 1 normal\t2 encrypted");
          input = Read.character();
          if (input == '1')
            basicHandler.read();
          else if (input == '2')
            encryptionHandler.read();
          break;
        case '3':
          basicHandler.clear();
          break;
        case '4':
          System.out.println("Quitting program");
          break;
      }
    } while (input != '4');
  }
}