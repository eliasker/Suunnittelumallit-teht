package Proxy;

public class RealImage implements Image {
  private final String filename;
  private final int filesize; // bytes
  private final String timestamp;

  public RealImage(String filename, int filesize, String timestamp) {
    this.filename = filename;
    this.filesize = filesize;
    this.timestamp = timestamp;
    loadImageFromDisk();
  }

  private void loadImageFromDisk() {
    System.out.println("Loading " + filename);
  }

  @Override
  public void displayImage() {
    System.out.println("Displaying " + filename);
  }

  @Override
  public void showData() {
    System.out.println("Filename: " + filename);
    System.out.println("Filesize: " + filesize);
    System.out.println("Taken: " + timestamp);
  }

  public String getFilename() {
    return filename;
  }

  // png -kuva, jossa 1 musta pikseli on kooltaan 100-120 tavua
  // Windows Explorer näyttää kuvan olevan 1KB -kokoinen
  // Alle kilotavun koot pyöristetään yhteen
  // 1000 KB on MB
  public String getFilesize() {
    if (filesize < 1000) {
      return "1 KB";
    }
    int kilobytes = (int) Math.floor(1.0 * filesize / 1000);
    return (kilobytes > 1000) ? (int) Math.floor(1.0 * kilobytes / 1000) + " MB" : kilobytes + " KB";
  }

  public String getTimestamp() {
    return timestamp;
  }
}