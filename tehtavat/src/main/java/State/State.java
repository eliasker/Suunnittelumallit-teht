package State;

public abstract class State {
  Character character;

  State(Character character) {
    this.character = character;
  }

  public abstract void onOutOfCombat();

  public abstract void onTurn();

  public abstract void onWait();
}