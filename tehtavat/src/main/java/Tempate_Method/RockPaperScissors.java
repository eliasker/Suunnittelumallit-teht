package Tempate_Method;

import java.util.ArrayList;

public class RockPaperScissors extends Game {
  private int turnCount;
  private ArrayList<String> choices;
  private ArrayList<String> players;

  @Override
  void initializeGame() {
    System.out.println("Starting game with " + playersCount + " players");
    turnCount = 1;
  }

  @Override
  void makePlay(int player) {
    System.out.println("Player No." + player + " turn, count: " + turnCount);
    turnCount++;

    // Choice
    if (choices.size() < playersCount) {

      // choices.push(option)
    }
    // Compare
    else {

    }
  }

  @Override
  boolean endOfGame() {
    return turnCount > 10;
  }

  @Override
  void printWinner() {
    System.out.println("Game over");
  }
}