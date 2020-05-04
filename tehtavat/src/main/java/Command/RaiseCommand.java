package Command;

public class RaiseCommand implements Command {
  private Receiver screen;

  public RaiseCommand(Receiver screen) {
    this.screen = screen;
  }

  @Override
  public void execute() {
    screen.raise();
  }
}