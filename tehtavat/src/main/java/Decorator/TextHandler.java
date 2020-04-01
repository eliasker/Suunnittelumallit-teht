package Decorator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Konkreettinen komponentti
public class TextHandler implements ITextHandler {
  public TextHandler() {
  }

  // Tulostaa tiedoston rivit
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

  // Kirjoittaa uuden rivin tiedostoon.
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

  // Korvaa tiedoston tekstin tyhjällä merkillä
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

  // Palauttaa listan tiedostosta luetuista riveistä
  @Override
  public ArrayList<String> getLines() {
    ArrayList<String> lines = new ArrayList<>();
    BufferedReader reader;
    try {
      String path = FileManager.getInstance().getPath();
      reader = new BufferedReader(new FileReader(path));
      String line = reader.readLine();
      while (line != null) {
        lines.add(line);
        line = reader.readLine();
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }
}