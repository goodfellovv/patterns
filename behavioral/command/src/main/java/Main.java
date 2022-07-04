import commands.BashCommand;
import commands.Command;
import commands.ShellCommand;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor(initCommands());
        System.out.println("============Print list of commands=========");
        System.out.println(executor);
        System.out.println("============Execute command 4 =========");
        executor.execute(4);

        System.out.println("============Execute all commands by executor=========");
        executor.executeAll();
        System.out.println("============Executor proceeded all commands=========");

    }

    public static List<Command> initCommands() {
        List<Command> commandList = new ArrayList<>();
        commandList.add(new BashCommand("cd C://dabramov"));
        commandList.add(new BashCommand("dir"));
        commandList.add(new BashCommand("cls"));
        commandList.add(new ShellCommand("cd /home/dabramov"));
        commandList.add(new ShellCommand("ls"));
        commandList.add(new ShellCommand("clear"));
        return commandList;
    }
}
