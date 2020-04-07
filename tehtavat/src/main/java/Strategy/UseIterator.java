package Strategy;

import java.util.List;
import java.util.ListIterator;

// Käy listan alkiot läpi hyödyntäen Javan Collections API:n ListIterator -rajapintaa
// Alkiot lisätään palautettavaan merkkijonoon ja
// jokaisen alkion perään lisätään rivinvaihtomerkki.
public class UseIterator implements ListConverter {

  @Override
  public String listToString(List<String> list) {
    String str = "";
    ListIterator<String> iterator = list.listIterator();
    while (iterator.hasNext()) {
      str += iterator.next() + "\n"; 
    }
    return str;
  }
}