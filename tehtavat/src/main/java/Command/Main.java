package Command;

public class Main {
  public static void main(String[] args) {
    Receiver screen = new Receiver();
    Command raiseCommand = new RaiseCommand(screen);
    Command lowerCommand = new LowerCommand(screen);
    WallButton raiseButton = new WallButton(raiseCommand);
    WallButton lowerButton = new WallButton(lowerCommand);

    raiseButton.push();
    raiseButton.push();
    raiseButton.push();
    lowerButton.push();
    lowerButton.push();
    raiseButton.push();
    raiseButton.push();
    lowerButton.push();
    lowerButton.push();
  }
}