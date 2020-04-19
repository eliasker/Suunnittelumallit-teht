package Builder;

// Konkreettinen builderi 2
public class MikiDiis extends BurgerBuilder {
  private BigMac bigMac;

  public MikiDiis() {
    bigMac = new BigMac();
  }

  @Override
  public void addBun() {
    bigMac.setBun("McBun");
  }

  @Override
  public void addMeat() {
    bigMac.setMeat("McSteak");
  }

  @Override
  public void addCheese() {
    bigMac.setCheese("McCheese");
  }

  @Override
  public void printBurger() {
    System.out.println("Big Mac");
    System.out.println(bigMac.getBun());
    System.out.println(bigMac.getMeat());
    System.out.println(bigMac.getCheese());
  }
}