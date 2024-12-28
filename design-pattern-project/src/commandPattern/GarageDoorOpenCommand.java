package commandPattern;

public class GarageDoorOpenCommand implements Command {
    Door door;

    public GarageDoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
