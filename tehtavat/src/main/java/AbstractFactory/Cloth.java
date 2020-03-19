package AbstractFactory;

public class Cloth {
  private String type;
  private String brand;

  /**
   * @param type of cloth, hat or shoes for example
   * @param brand of that cloth, comes from a specified factory so all clothes are matching
   */
  public Cloth(String type, String brand) {
    this.type = type;
    this.brand = brand;
  }

  public String getType() {
    return type;
  }

  public String getBrand() {
    return brand;
  }

  public String toString() {
    return getBrand() + " " + getType();
  }
}