package commands;

public class ShellCommand implements Command {
    String command;

    public ShellCommand(String command) {
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println("Execute Shell command: " + command);
    }

    @Override
    public String getCommandName() {
        return "Shell command";
    }
}
