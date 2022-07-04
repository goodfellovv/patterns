import commands.Command;

import java.util.List;

public class Executor {
    List<Command> commands;

    public Executor(List<Command> commands) {
        this.commands = commands;
    }

    public void execute(int index) {
        if (commands.size() >= index) {
            commands.get(0).execute();
        }
    }

    public void executeAll() {
        commands.forEach(Command::execute);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Commands:");
        stringBuilder.append("\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append("[");
            stringBuilder.append(commands.get(i).getCommandName());
            stringBuilder.append(":");
            stringBuilder.append(i);
            stringBuilder.append("]");
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
