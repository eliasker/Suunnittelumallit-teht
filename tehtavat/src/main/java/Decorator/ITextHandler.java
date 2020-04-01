package Decorator;

import java.util.ArrayList;

public interface ITextHandler {
  public void read();

  public ArrayList<String> getLines();

  public void write(String s);

  public void clear();
}