package commandPattern;

public class NoCommand implements Command {
    public void execute() {
        System.out.println("No command");
    }

    public void undo() {
        System.out.println("No command");
    }
}
