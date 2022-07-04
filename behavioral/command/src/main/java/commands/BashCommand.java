package commands;

public class BashCommand implements Command {
    String command;

    public BashCommand(String command) {
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println("Execute Bash command: " + command);
    }

    @Override
    public String getCommandName() {
        return "Bash command";
    }
}
