package Tempate_Method;

import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors extends Game {
  private ArrayList<Player> players;
  private String[] options = { "rock", "paper", "scissors" };

  @Override
  void initializeGame() {
    System.out.println("Starting game with " + playersCount + " players");
    players = new ArrayList<>();
    players.add(new Player("Elias", false));
    players.add(new Player("AI", true));
  }

  @Override
  void makePlay(int player) {
    Player currentPlayer = players.get(player);
    System.out.println("Current: " + currentPlayer.getName());
    if (currentPlayer.getChoice() == null) {
      if (currentPlayer.isAI()) {
        String randomChoice = options[new Random().nextInt(options.length)];
        currentPlayer.setChoice(randomChoice);
      } else {
        // TODO valinta
        String randomChoice = options[new Random().nextInt(options.length)];
        System.out.println("Player chose randomly: " + randomChoice);
        currentPlayer.setChoice(randomChoice);
      }
    } else {
      for (Player p : players)
        p.setChoice(null);
    }
  }

  void compareChoices() {
    System.out.println("Comparing choices");
    String choice1 = players.get(0).getChoice();
    String choice2 = players.get(1).getChoice();
    if (choice1.equals(choice2)) {
      System.out.println("Draw, both players chose: " + choice1);
    } else {
      System.out.println("Choices: " + choice1 + " & " + choice2);
    }
  }

  @Override
  boolean endOfGame() {
    for (Player p : players) {
      if (p.getChoice() == null) {
        return false;
      } else {
        compareChoices();
      }
    }
    return true;
  }

  @Override
  void printWinner() {
    // TODO print winner
    System.out.println("Game over");
  }
}