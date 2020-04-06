package Tempate_Method;

import java.util.ArrayList;
import java.util.Random;

import util.Read;

public class RockPaperScissors extends Game {
  private ArrayList<Player> players;
  private String[] options = { "rock", "paper", "scissors" };
  private Player winner = null;

  @Override
  void initializeGame() {
    System.out.println("Starting game with " + playersCount + " players");
    players = new ArrayList<>();
    players.add(new Player("Elias", false));
    players.add(new Player("Skynet", true));
  }

  @Override
  void makePlay(int player) {
    int input;
    Player currentPlayer = players.get(player);
    System.out.println("Current player: " + currentPlayer.getName());

    if (currentPlayer.getChoice() == -1) {
      if (currentPlayer.isAI()) {
        int randomChoice = new Random().nextInt(options.length);
        currentPlayer.setChoice(randomChoice);
      } else {
        System.out.println("1) rock\t2) paper\t3) scissors\t4) (or anything else :D) random");
        input = Read.readInteger();
        if (1 <= input && input <= 3) {
          currentPlayer.setChoice(input - 1);
          System.out.println("Chosen: " + options[input - 1]);
        } else {
          int randomChoice = new Random().nextInt(options.length);
          currentPlayer.setChoice(randomChoice);
          System.out.println("Player chose random");
        }
      }
    }
  }

  /**
   * Tarkastellaan valintojen (vaihtoehtojen indeksi) erotusta. 0: Sama valinta,
   * tasapeli 1 tai -2: pelaaja voittaa 2 tai -1: AI voittaa Esim.: Pelaaja
   * valitsee kiven (indeksi 0) ja AI sakset (indeksi 2) 0 - 2 = -2 --> pelaaja
   * voittaa
   * @param choice1 Pelaajan valinnan indeksi
   * @param choice2 AI:n valinnan indeksi
   */
  void compareChoices(int choice1, int choice2) {
    System.out.println("Comparing choices");
    System.out.println(players.get(0).getName() + ": " + options[choice1] + " & " + players.get(1).getName() + ": "
        + options[choice2]);
    int diff = choice1 - choice2;
    if (diff == 0) {
      System.out.println("Draw, both players chose: " + options[choice1]);
      for (Player p : players) {
        p.setChoice(-1);
      }
    } else if (diff == 1 || diff == -2) {
      winner = players.get(0);
    } else if (diff == 2 || diff == -1) {
      winner = players.get(1);
    }
  }

  @Override
  boolean endOfGame() {
    int choice1 = players.get(0).getChoice();
    int choice2 = players.get(1).getChoice();
    if (choice1 != -1 && choice2 != -1)
      compareChoices(choice1, choice2);
    return winner != null;
  }

  @Override
  void printWinner() {
    System.out.println("\nGame over, winner: " + winner.getName());
  }
}