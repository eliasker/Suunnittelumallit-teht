package State;

public abstract class EvolutionState {
  private Pokemon pokemon;

  public EvolutionState(Pokemon pokemon) {

  }

  public void checkXp() {
    if (pokemon.getXp() >= 100) {
      
    }
  }

  public abstract EvolutionState evolve();

  public abstract int attack();

  public abstract int getHp();
}