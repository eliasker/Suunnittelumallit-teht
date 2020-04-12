package ChainOfResponsibility;

public class Main {
  public static void main(String[] args) {
    double askedRaise = 50.10000;
    // Luodaan ketju esimiehiä
    // konstruktori Esimies(seuraava esimies, roolin nimi, maksimikorotus-%)
    CEO ceo = new CEO(null, "CEO", 10.0);
    Boss boss = new Boss(ceo, "Boss", 5.0);
    TeamLead teamLead = new TeamLead(boss, "Team Lead", 2.0);
    teamLead.processRequest(askedRaise);
  }
}