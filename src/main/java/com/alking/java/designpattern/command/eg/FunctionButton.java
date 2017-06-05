package com.alking.java.designpattern.command.eg;

import com.alking.java.designpattern.command.Command;

public class FunctionButton<T> {

    private String name;

    private Command<T> command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCommand(Command<T> command) {
        this.command = command;
    }

    public void onClick() {
        System.out.print("onClick:  ");
        command.execute();
    }
}
