package com.alking.java.designpattern.command;

public class ConcreteCommand implements Command {

    private Receiver receiver;

    public void execute() {
        receiver.action();
    }

}