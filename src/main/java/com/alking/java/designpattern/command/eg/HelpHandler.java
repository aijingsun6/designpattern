package com.alking.java.designpattern.command.eg;

public class HelpHandler implements Handler {

    public HelpHandler() {

    }
    @Override
    public void handle() {
        System.out.println("HelpHandler");
    }
}
