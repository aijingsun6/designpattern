package com.alking.java.designpattern.command.eg;

public class MinimizeHandler implements Handler {

    public MinimizeHandler() {

    }

    @Override
    public void handle() {
        System.out.println("MinimizeHandler");
    }
}
