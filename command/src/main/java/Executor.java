import commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    List<Command> commands;

    public Executor(List<Command> commands) {
        this.commands = commands;
    }

    public void executeAll(){
        commands.forEach(Command::execute);
    }
}
