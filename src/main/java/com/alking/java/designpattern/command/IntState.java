package com.alking.java.designpattern.command;

public class IntState implements State<Integer> {

    private Integer result;

    @Override
    public Integer getResult() {
        return result;
    }

    @Override
    public void setResult(Integer integer) {
        this.result = integer;
    }

    public IntState(Integer result) {
        this.result = result;
    }
}
