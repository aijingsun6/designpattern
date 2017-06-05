package com.alking.java.designpattern;

import com.alking.java.designpattern.command.eg.FBSettingWindow;
import com.alking.java.designpattern.command.eg.FunctionButton;
import com.alking.java.designpattern.command.eg.HelpCommand;
import com.alking.java.designpattern.command.eg.MinimizeCommand;

public class Main {

    public static void main(String[] args) {

        if(args != null){
            for (String arg: args){
                exec(arg);
            }
        }
    }

    private static void exec(String s){
        switch (s){
            case "command" :
                command();
                break;
            default:
                break;
        }
    }

    private static void command(){
        System.out.println("begin command...");
        FBSettingWindow win = new FBSettingWindow("window");
        FunctionButton fb1 =  new FunctionButton("fb1");
        fb1.setCommand(new HelpCommand());

        FunctionButton fb2 =  new FunctionButton("fb2");
        fb2.setCommand(new MinimizeCommand());

        win.addFunctionButton(fb1);
        win.addFunctionButton(fb2);

        win.display();
        fb1.onClick();
        fb2.onClick();

        System.out.println("end command...");
    }
}
