package AbstractFactory;

public class Main {
  public static void main(String[] args) {
    Programmer jasper = new Programmer("Jasper");
    System.out.println("Jasperille vaatteet");

    AbstractClothesFactory gopnik = new GopnikFactory();
    AbstractClothesFactory boss = new BossFactory();
    
    System.out.println("Addyfullit");
    jasper.wear(gopnik);
    jasper.flex();

    System.out.println("Bossin kledjut");
    jasper.wear(boss);
    jasper.flex();
  }
}