package ChainOfResponsibility;

public abstract class Handler {
  protected Handler successor;

  public Handler(Handler s) {
    this.successor = s;
  }

  public void processRequest(double percent) {
    if (successor != null) {
      System.out.println(getRole() + ": " + percent + "%? I can't allow this much");
      System.out.println(getRole() + ": I need to ask from " + successor.getRole());
      successor.processRequest(percent);
    }
  }

  abstract public String getRole();
}