package Decorator;

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

  public void clear() {
    textHandler.clear();
  }
}