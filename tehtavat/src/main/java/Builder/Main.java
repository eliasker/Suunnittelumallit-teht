package Builder;

public class Main {
  public static void main(String[] args) {
    // Luodaan konkreettinen builder
    BurgerBuilder builder = new Hesburger(); 

    // Toinen konkreettinen builderi
    //BurgerBuilder builder = new MikiDiis(); 

    // Director(ConcreteBuilder)
    Pikaruokala ruokala = new Pikaruokala(builder);

    ruokala.constructBurger();
    ruokala.printBurger();
  }
}