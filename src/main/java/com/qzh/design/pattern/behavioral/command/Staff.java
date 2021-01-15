package com.qzh.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Staff
 * @Author DiangD
 * @Date 2021/1/15
 * @Version 1.0
 * @Description
 **/
public class Staff {
    private final List<Command> commands = new ArrayList<>();

    public Staff addCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
