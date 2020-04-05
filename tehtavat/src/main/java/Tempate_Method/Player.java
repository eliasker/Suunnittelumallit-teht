package Tempate_Method;

public class Player {
  private String name;
  private boolean isAI;
  private String choice;

  public Player(String name, boolean isAI) {
    this.name = name;
    this.isAI = isAI;
    this.choice = null;
  }

  public boolean isAI() {
    return isAI;
  }

  public String getChoice() {
    return choice;
  }

  public void setChoice(String choice) {
    this.choice = choice;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}