package com.alking.java.designpattern;

import com.alking.java.designpattern.command.IntStateCommand;
import com.alking.java.designpattern.command.eg.*;

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
        FBSettingWindow<String> win = new FBSettingWindow<>("window");
        FunctionButton<String> fb1 =  new FunctionButton<>("fb1");

        HelpCommand<String> helpCommand = new HelpCommand<>();
        helpCommand.setHandler(new HelpHandler<String>("help handler"));

        fb1.setCommand(helpCommand);



        FunctionButton<String> fb2 =  new FunctionButton<>("fb2");
        MinimizeCommand<String> minimizeCommand = new MinimizeCommand<>();
        minimizeCommand.setHandler(new MinimizeHandler<String>("min handler"));
        fb2.setCommand(minimizeCommand);

        win.addFunctionButton(fb1);
        win.addFunctionButton(fb2);

        win.display();
        fb1.onClick();
        fb2.onClick();

        Calc calc = new Calc();
        calc.addCmd(new IntStateCommand(1));
        calc.addCmd(new IntStateCommand(2));
        calc.addCmd(new IntStateCommand(3));

        calc.displayResult();
        calc.undo();
        calc.displayResult();


        System.out.println("end command...");
    }
}
