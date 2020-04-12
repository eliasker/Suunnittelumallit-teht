package ChainOfResponsibility;

public class CEO extends Handler {
  private String role;
  private double allowedPercent;

  public CEO(Handler s, String role, double percent) {
    super(s);
    this.role = role;
    this.allowedPercent = percent;
  }

  @Override
  public void processRequest(double percent) {
    if (percent <= allowedPercent) {
      System.out.println(getRole() + ": Pay raised by " + percent + "%");
    } else {
      System.out.println(getRole() + ": No, get out of my office.");
    }
  }

  @Override
  public String getRole() {
    return role;
  }

}