package com.alking.java.designpattern.command;

public interface State<T> {

    T getResult();

    void setResult(T t);
}
