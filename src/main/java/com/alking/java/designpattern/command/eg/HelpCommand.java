package com.alking.java.designpattern.command.eg;

import com.alking.java.designpattern.command.Command;

public class HelpCommand implements Command {

    private HelpHandler handler;

    public HelpHandler getHandler() {
        return handler;
    }

    public void setHandler(HelpHandler handler) {
        this.handler = handler;
    }

    public HelpCommand() {
        this.handler = new HelpHandler();
    }

    @Override
    public void execute() {
        if(this.handler != null){
            this.handler.handle();
        }
    }
}
