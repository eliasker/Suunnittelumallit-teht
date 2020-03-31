package Decorator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextHandler implements ITextHandler {
  public TextHandler() {
  }

  @Override
  public void read() {
    BufferedReader reader;
    try {
      String path = FileManager.getInstance().getPath();
      reader = new BufferedReader(new FileReader(path));
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
      String path = FileManager.getInstance().getPath();
      writer = new BufferedWriter(new FileWriter(path, true));
      writer.write(str);
      writer.newLine();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void clear() {
    BufferedWriter writer;
    try {
      String path = FileManager.getInstance().getPath();
      writer = new BufferedWriter(new FileWriter(path));
      writer.write("");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}