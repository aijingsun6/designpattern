package com.alking.java.designpattern.command.eg;

import com.alking.java.designpattern.command.Command;

public class MinimizeCommand<T> implements Command<T> {

    private MinimizeHandler<T> handler;

    public MinimizeHandler<T> getHandler() {
        return handler;
    }
    public void setHandler(MinimizeHandler<T> handler) {
        this.handler = handler;
    }

    public MinimizeCommand() {

    }

    @Override
    public void execute() {

        if(this.handler != null){
            this.handler.handle();
        }

    }
}
