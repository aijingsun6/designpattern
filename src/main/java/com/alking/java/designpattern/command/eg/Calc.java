package com.alking.java.designpattern.command.eg;

import com.alking.java.designpattern.command.IntState;
import com.alking.java.designpattern.command.IntStateCommand;
import com.alking.java.designpattern.command.State;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    private Integer origin = 0;

    private List<IntStateCommand> cmds = new ArrayList<>();

    public void addCmd(IntStateCommand cmd){
        this.cmds.add(cmd);
    }

    public void undo(){
        int size = cmds.size();
        if(size > 0){
            this.cmds.remove(size-1);
        }
    }

    public  void displayResult(){

        IntState state = new IntState(origin);

        for (IntStateCommand cmd: cmds){
            state = (IntState) cmd.execute(state);
        }
        System.out.println("result:" + state.getResult());
    }

}
