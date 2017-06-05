package com.alking.java.designpattern.command;

public interface StateCommand<T> {

    State<T> execute(State<T> stateIn);

    State<T> undo(State<T> stateIn);

}
