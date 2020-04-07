package Strategy;

import java.util.ArrayList;
import java.util.List;

// Muuttaa saadun listan taulukoksi
// Alkiot käydään läpi silmukassa ja jokaisen alkion perään lisätään välilyönti
// Lisäksi joka kolmannen alkion perään lisätään rivinvaihtomerkki
// Indksit alkavat nollasta, joten joka kolmannen alkion jako jäännös kolmesta on 2
public class UseArrayLoop implements ListConverter {

  @Override
  public String listToString(List<String> list) {
    String str = ""; 
    ArrayList<String> arr = new ArrayList<>(list);
    for (String listItem : arr) {
      str += listItem + " ";
      if (arr.indexOf(listItem) % 3 == 2) str += "\n";
    }
    return str;
  }

}