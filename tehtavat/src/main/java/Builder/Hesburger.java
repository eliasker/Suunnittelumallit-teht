package Builder;

// Konkreettinen builderi 1
public class Hesburger extends BurgerBuilder {
  private StringBuilder burger;

  public Hesburger() {
    this.burger = new StringBuilder("Hesburger\nKerroshampurilainen: ");
  }

  @Override
  public void addBun() {
    burger.append("\nSämbylä");
  }

  @Override
  public void addMeat() {
    burger.append("\nPihvi");
  }

  @Override
  public void addCheese() {
    burger.append("\nJuusto");
  }

  @Override
  public void printBurger() {
    System.out.println(burger);
  }

}