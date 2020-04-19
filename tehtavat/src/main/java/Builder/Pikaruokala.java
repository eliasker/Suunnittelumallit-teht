package Builder;

// Director
public class Pikaruokala {
  private BurgerBuilder builder;

  public Pikaruokala(BurgerBuilder builder) {
    this.builder = builder;
  }

  public void printBurger() {
    builder.printBurger();
  }

  public void constructBurger() {
    builder.addBun();
    builder.addMeat();
    builder.addCheese();
  }
}