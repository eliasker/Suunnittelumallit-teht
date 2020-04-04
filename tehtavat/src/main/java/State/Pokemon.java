package State;

public class Pokemon {
  private int hp;
  private int xp;
  //private Move attack;
  //private EvolutionState evolution;

  public Pokemon() {
    this.hp = 10;
    this.xp = 0;
  }

  public int getHp() {
    return hp;
  }

  public int getXp() {
    return xp;
  }

  public void setHp(int damage) {
    hp -= damage;
  }
}