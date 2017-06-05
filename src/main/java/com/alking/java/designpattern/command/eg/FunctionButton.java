package com.alking.java.designpattern.command.eg;

import com.alking.java.designpattern.command.Command;

public class FunctionButton {

    private String name;

    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        System.out.print("onClick:  ");
        command.execute();
    }
}
