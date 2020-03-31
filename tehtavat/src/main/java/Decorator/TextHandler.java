package Decorator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextHandler implements ITextHandler {
  private String PATH;
  private String filename = "secret.txt";

  public TextHandler() {
    PATH = System.getProperty("user.dir") + "\\tehtavat\\src\\main\\java\\Decorator\\" + filename; // :DDDDD
    File temp = new File(PATH);
    if (!temp.exists())
      try {
        temp.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }

  @Override
  public void read() {
    BufferedReader reader;
    try {
      reader = new BufferedReader(new FileReader(PATH));
      String line = reader.readLine();
      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void write(String str) {
    BufferedWriter writer;
    try {
      writer = new BufferedWriter(new FileWriter(PATH, true));
      writer.write(str);
      writer.newLine();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}