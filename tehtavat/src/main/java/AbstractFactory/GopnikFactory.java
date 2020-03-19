package AbstractFactory;

/**
 * Factory making Adidas -clothes
 */
public class GopnikFactory extends AbstractClothesFactory {
  @Override
  Cloth getCloth(String clothType) {
    Cloth cloth = new Cloth(clothType, "adidas");
    System.out.println("Putting on: " + cloth.toString());
    return cloth;
  }
}
