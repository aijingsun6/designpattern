package com.alking.java.designpattern.command.eg;

public class MinimizeHandler<T> implements Handler<T> {
    private T value;

    public MinimizeHandler(T value) {
        this.value = value;
    }
    @Override
    public void handle() {
        System.out.println("MinimizeHandler:" + this.value.toString());
    }
}
