package Command;

public class Receiver {
  private boolean raised;

  public Receiver() {
    raised = false;
  }

  public void raise() {
    if (raised)
      System.out.println("Valkokangas on jo ylhäällä");
    else {
      System.out.println("Valkokangas ylös");
      raised = !raised;
    }
  }

  public void lower() {
    if (!raised)
      System.out.println("Valkokangas on jo alhaalla");
    else {
      System.out.println("Valkokangas alas");
      raised = !raised;
    }
  }
}