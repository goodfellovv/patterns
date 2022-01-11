package commands;

public class CmdCommand implements Command {
    String command;

    public CmdCommand(String command) {
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println("Execute CMD command: " + command);
    }
}
