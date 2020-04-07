9.	Strategy: Määrittele  Strategy-mallin mukaisesti ListConverter-rajapinta, jossa määritellään listToString-metodi, joka saa parametrikseen List-tietorakenteen ja palauttaa listan merkkijonona, jossa 

1) strategia kirjoittaa rivinvaihtomerkin jokaisen alkion jälkeen 
2) strategia tulostaa rivinvaihtomerkin joka toisen alkion jälkeen
3) strategia tulostaa rivinvaihtomerkin joka kolmannen alkion jälkeen

Toteuta eri strategioissa listan läpikäynti eri tavoin. 
Eri tapoja:
- iteraattorin käyttö 
- lista taulukoksi ennen läpikäyntiä, joka toteutetaan for-silmukassa
- listan läpikäynti for-silmukassa käyttäen List-rajapinnan get-metodia.

Testiohjelmassa luodaan lista ja tulostetaan eri strategioilla aikaansaatu lopputulos. 