package Proxy;

public class ProxyImage implements Image {
  private final String filename;
  private int filesize; // bytes
  private String timestamp;
  private RealImage image;

  public ProxyImage(String filename, int filesize, String timestamp) {
    this.filename = filename;
    this.filesize = filesize;
    this.timestamp = timestamp;
  }

  @Override
  public void displayImage() {
    if (image == null) {
      image = new RealImage(filename, filesize, timestamp);
    }
    image.displayImage();
  }

  /*
   * @Override public void showData() { if (image == null) { image = new
   * RealImage(filename, filesize, timestamp); } image.showData(); }
   */

  @Override
  public void showData() {
    System.out.println("Filename: " + filename);
    System.out.println("Filesize: " + getFilesize());
    System.out.println("Taken: " + timestamp);
  }

  public String getFilename() {
    return filename;
  }

  // png -kuva, jossa 1 musta pikseli on kooltaan 100-120 tavua
  // Windows Explorer näyttää kuvan olevan 1KB -kokoinen
  // Alle kilotavun koot pyöristetään yhteen
  // Yli 1000KB:n koot ilmoitetaan megoina
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