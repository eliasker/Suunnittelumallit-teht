package Decorator;

/**
 * Konkreettinen
 */
public class EncryptionDecorator extends AbstractTextHandler {
  private TextHandler textHandler;
  private char currentChar;
  private int KEY = 13;

  public EncryptionDecorator(TextHandler textHandler) {
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
    String encryptedStr = encrypt(str);
    System.out.println(encryptedStr);
  }

  private String encrypt(String str) {
    String encryptedStr = "";
    System.out.println("encrypting: " + str);
    for (int i = 0; i < str.length(); i++) {
      currentChar = str.charAt(i);

      if (currentChar >= 'a' && currentChar <= 'z') {
        currentChar = (char) (currentChar + KEY);
        if (currentChar > 'z') {
          currentChar = (char) (currentChar - 'z' + 'a' - 1);
        }
        encryptedStr += currentChar;
      } else if (currentChar >= 'A' && currentChar <= 'Z') {
        currentChar = (char) (currentChar + KEY);
        if (currentChar > 'Z') {
          currentChar = (char) (currentChar - 'Z' + 'A' - 1);
        }
        encryptedStr += currentChar;
      } else {
        encryptedStr += currentChar;
      }
    }
    return encryptedStr;
  }

  private String decrypt(String str) {
    System.out.println("decrypting: " + str);
    return str;
  }

  @Override
  public void clear() {
    System.out.println("clearing");
  }
}