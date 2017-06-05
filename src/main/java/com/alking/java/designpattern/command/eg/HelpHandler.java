package com.alking.java.designpattern.command.eg;

public class HelpHandler<T> implements Handler<T> {

    private T value;

    public HelpHandler(T v) {
        this.value = v;

    }
    @Override
    public void handle() {
        System.out.println("HelpHandler:" + value.toString());
    }
}
