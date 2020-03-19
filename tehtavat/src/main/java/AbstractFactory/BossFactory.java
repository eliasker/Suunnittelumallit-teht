package AbstractFactory;

/**
 * Factory making Boss -clothes
 */
public class BossFactory extends AbstractClothesFactory {
  @Override
  Cloth getCloth(String clothType) {
    Cloth cloth = new Cloth(clothType, "BOSS");
    System.out.println("Putting on: " + cloth.toString());
    return cloth;
  }
}
