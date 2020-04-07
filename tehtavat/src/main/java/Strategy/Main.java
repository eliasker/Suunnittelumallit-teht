package Strategy;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> data = Arrays.asList("eka", "toka", "kolmas", "neljäs", "viides", "kuudes", "seitsemäs", "kahdeksas");

    String str1 = new UseIterator().listToString(data);
    String str2 = new UseForLoop().listToString(data);
    String str3 = new UseArrayLoop().listToString(data);

    System.out.println("String from iterator:\n" + str1 + "\n");
    System.out.println("String from looping list:\n" + str2 + "\n");
    System.out.println("String from looping arraylist:\n" + str3);
  }
}