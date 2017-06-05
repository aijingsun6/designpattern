package com.alking.java.designpattern.command;

public class ConcreteCommand<T> implements Command<T> {

    private Receiver receiver;

    public void execute() {
        receiver.action();
    }

}