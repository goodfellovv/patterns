package commands;

public class ShellCommand implements Command {
    String command;

    public ShellCommand(String command) {
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println("Execute SH command: " + command);
    }
}
