package com.alking.java.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue<T> implements Command<T> {

    private List<Command<T>> commands = new ArrayList<>();

    public void addCommand(Command<T> command) {
        commands.add(command);
    }

    public void removeCommand(Command<T> command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        for(Command<T> cmd : commands){
            cmd.execute();
        }
    }
}
