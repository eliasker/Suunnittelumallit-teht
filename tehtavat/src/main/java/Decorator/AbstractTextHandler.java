package Decorator;

import java.util.ArrayList;

public abstract class AbstractTextHandler implements ITextHandler {
  protected TextHandler textHandler;

  public AbstractTextHandler(TextHandler textHandler) {
    this.textHandler = textHandler;
  }

  public void read() {
    textHandler.read();
  }

  public void write(String str) {
    textHandler.write(str);
  }

  public ArrayList<String> getLines() {
    return textHandler.getLines();
  }

  public void clear() {
    textHandler.clear();
  }
}