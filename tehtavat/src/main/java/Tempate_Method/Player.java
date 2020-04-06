package Tempate_Method;

public class Player {
  private String name;
  private boolean isAI;
  private int choice;

  public Player(String name, boolean isAI) {
    this.name = name;
    this.isAI = isAI;
    this.choice = -1;
  }

  public boolean isAI() {
    return isAI;
  }

  public int getChoice() {
    return choice;
  }

  public void setChoice(int choice) {
    this.choice = choice;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}