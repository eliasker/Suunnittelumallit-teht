package Decorator;

import java.io.File;
import java.io.IOException;

public class FileManager {
  private String PATH;
  private static FileManager INSTANCE;
  private String filename = "secret.txt";

  private FileManager() {
    this.PATH = System.getProperty("user.dir") + "\\tehtavat\\src\\main\\java\\Decorator\\" + filename; // :DDDDD

    File temp = new File(PATH);
    if (!temp.exists())
      try {
        temp.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
  }

  public static FileManager getInstance() {
    if (INSTANCE == null)
      INSTANCE = new FileManager();
    return INSTANCE;
  }

  public String getPath() {
    return this.PATH;
  }
}