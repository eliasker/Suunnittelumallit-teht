package Singleton;

import java.io.File;
import java.io.IOException;

public class Logger {
  private String PATH;
  private static Logger INSTANCE;

  private Logger() {
    String filename = "logs.txt";
    PATH = System.getProperty("user.dir") + "\\tehtavat\\src\\main\\java\\Singleton";
    String filePath = PATH + "\\" + filename;
    System.out.println("to:" + filePath);
    File temp = new File(filePath);
    if (temp.exists()) {
      System.out.println("Found logs.txt -file");
    } else {
      System.out.println("Couldn't find path to resource, creating new log file");
      try {
        temp.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public static Logger getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Logger();
    }
    return INSTANCE;
  }

  public void write(String log) {
    System.out.println("Writing " + log);
  }

  public void read() {
    System.out.println("Reading log");
  }
}