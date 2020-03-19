package AbstractFactory;

/**
 * Abstract class for factories making clothing
 */
public abstract class AbstractClothesFactory {
  abstract Cloth getCloth(String clothType);
}