package Decorator;

// Utility containg methods for reading user input such as: int, char, double, line
import util.Read;

public class Main {
  public static void main(String[] args) {
    // TextHandler handler = new TextHandler();
    EncryptionDecorator handler = new EncryptionDecorator(new TextHandler());
    char input;
    do {
      System.out.println("1 write to file\t2 print file\t3 clear file\t4 quit");
      input = Read.character();
      switch (input) {
        case '1':
          handler.write(Read.line());
          break;
        case '2':
          handler.read();
          break;
        case '3':
          handler.clear();
          break;
        case '4':
          System.out.println("Quitting program");
          break;
      }
    } while (input != '4');
  }
}