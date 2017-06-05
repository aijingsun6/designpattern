package com.alking.java.designpattern.command.eg;

import com.alking.java.designpattern.command.Command;

/**
 * 帮助命令类：具体命令类
 */
public class HelpCommand implements Command {

    private HelpHandler handler; //维持对请求接收者的引用

    public HelpHandler getHandler() {
        return handler;
    }

    public void setHandler(HelpHandler handler) {
        this.handler = handler;
    }

    public HelpCommand() {
    }
    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        if(this.handler != null){
            this.handler.handle();
        }
    }
}
