package com.alking.java.designpattern.command;

public class IntStateCommand implements StateCommand<Integer>{

    private Integer value = 0;

    public IntStateCommand(Integer value) {
        this.value = value;
    }

    @Override
    public State<Integer> execute(State<Integer> stateIn) {
        Integer state = stateIn.getResult();
        stateIn.setResult(state + this.value);
        return  stateIn;
    }
}
