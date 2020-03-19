package AbstractFactory;

import java.util.ArrayList;

public class Programmer {
  private String name;
  private ArrayList<Cloth> clothes;

  public Programmer(String name) {
    this.name = name;
    this.clothes = new ArrayList<>();
  }

  public String getName() {
    return this.name;
  }

  public void flex() {
    String outfit = "I'm currently wearing (flex flex):\n";
    for (Cloth c : clothes)
      outfit += c.toString() + " ";
    System.out.println(outfit + "\n");
  }

  public void wear(AbstractClothesFactory factory) {
    clothes.clear();
    clothes.add(factory.getCloth("hat"));
    clothes.add(factory.getCloth("shirt"));
    clothes.add(factory.getCloth("pants"));
    clothes.add(factory.getCloth("shoes"));
  }
}