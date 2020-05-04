package Command;

public class LowerCommand implements Command {
  private Receiver screen;

  public LowerCommand(Receiver screen) {
    this.screen = screen;
  }

  @Override
  public void execute() {
    screen.lower();
  }
}