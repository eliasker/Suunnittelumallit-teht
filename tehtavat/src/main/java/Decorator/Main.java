package Decorator;

// Utility containg methods for reading user input such as: int, char, double, line
import util.Read;

public class Main {
  public static void main(String[] args) {
    TextHandler textHandler = new TextHandler();
    char input;
    do {
      System.out.println("1 write to file\t2 print file\t3 quit");
      input = Read.character();
      switch (input) {
        case '1':
          textHandler.write(Read.line());
          break;
        case '2':
          textHandler.read();
          break;
        case '3':
          System.out.println("Quitting program");
          break;
      }
    } while (input != '3');

  }
}