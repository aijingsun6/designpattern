package com.alking.java.designpattern.command;

public interface StateCommand<T> {

    State<T> execute(State<T> stateIn);

}
