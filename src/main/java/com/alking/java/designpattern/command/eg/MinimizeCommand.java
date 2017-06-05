package com.alking.java.designpattern.command.eg;

import com.alking.java.designpattern.command.Command;

/**
 * Created by sunaijing on 2017/6/5.
 */
public class MinimizeCommand extends Command {

    private MinimizeHandler handler;

    public MinimizeHandler getHandler() {
        return handler;
    }

    public void setHandler(MinimizeHandler handler) {
        this.handler = handler;
    }

    public MinimizeCommand() {

    }




    @Override
    public void execute() {

    }
}
