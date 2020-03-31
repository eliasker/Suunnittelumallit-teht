package Decorator;

public class EncryptedTextHandler extends AbstractTextHandler {
  public EncryptedTextHandler(TextHandler textHandler) {
    super(textHandler);
  }

  @Override
  public void read() {
    String strFromFile = "this text is encrypted";
    String decryptedStr = decrypt(strFromFile);
    System.out.println("read");
  }

  @Override
  public void write(String str) {
    System.out.println("write");
  }

  private void encrypt(String str) {
    System.out.println("encrypting: " + str);
  }

  private String decrypt(String str) {
    System.out.println("decrypting: " + str);
    return str;
  }
}