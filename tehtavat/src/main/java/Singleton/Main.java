package Singleton;

// Utility containg methods for reading user input: int, char, double, line
import util.Read;

public class Main {
  public static void main(String[] args) {
    char input;
    do {
      System.out.println("1 write to log\t2 print log\t3 quit");
      input = Read.character();
      switch (input) {
        case '1':
          Logger.getInstance().write(Read.line());
          break;
        case '2':
          Logger.getInstance().read();
          break;
        case '3':
          System.out.println("Quitting program");
          break;
      }
    } while (input != '3');
  }
}