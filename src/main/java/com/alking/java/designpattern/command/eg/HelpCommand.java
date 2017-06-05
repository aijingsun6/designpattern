package com.alking.java.designpattern.command.eg;

import com.alking.java.designpattern.command.Command;

public class HelpCommand<T> implements Command<T> {

    private HelpHandler handler;

    public HelpHandler getHandler() {
        return handler;
    }

    public void setHandler(HelpHandler handler) {
        this.handler = handler;
    }

    public HelpCommand() {
    }

    @Override
    public void execute() {
        if(this.handler != null){
            this.handler.handle();
        }
    }
}
