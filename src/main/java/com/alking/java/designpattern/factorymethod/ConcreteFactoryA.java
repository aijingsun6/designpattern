package com.alking.java.designpattern.factorymethod;

public class ConcreteFactoryA implements Factory {
    @Override
    public Product create() {
        return new ConcreteProductA();
    }
}
