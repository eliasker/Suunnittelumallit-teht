package Strategy;

import java.util.List;

// Kotipolttoinen for-silmukka listan alkioiden läpikäymiseksi
// Jokaisen alkion perään lisätään välilyönti 
// Lisäksi joka toisen alkion jälkeen lisätään rivinvaihtomerkki
public class UseForLoop implements ListConverter {

  // Silmukka käy listan indeksit läpi ja lisää get -metodilla saadun alkion merkkijonoon
  // Joka toisen alkion indeksi on pariton luku, eli silloin kun jakojäännös kahdesta on yksi (i%2==1)
  // Oneliner -loopista tyylibonus :P
  @Override
  public String listToString(List<String> list) {
    String str = "";
    for (int i = 0; i < list.size(); i++) str += (i % 2 == 1) ? list.get(i) + " \n" : list.get(i) + " ";
    return str;
  }

}