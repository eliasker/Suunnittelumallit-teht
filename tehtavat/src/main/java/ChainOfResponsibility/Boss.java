package ChainOfResponsibility;

public class Boss extends Handler {
  private double allowedPercent;
  private String role;

  public Boss(Handler s, String role, double percent) {
    super(s);
    this.role = role;
    this.allowedPercent = percent;
  }

  @Override
  public void processRequest(double percent) {
    if (percent <= allowedPercent) {
      System.out.println(getRole() + ": Pay raised by " + percent + "%");
    } else {
      super.processRequest(percent);
    }
  }

  @Override
  public String getRole() {
    return role;
  }

}