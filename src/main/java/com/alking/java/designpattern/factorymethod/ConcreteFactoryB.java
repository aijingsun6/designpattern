package com.alking.java.designpattern.factorymethod;

/**
 * Created by sunaijing on 2017/6/3.
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product create() {
        return new ConcreteProductB();
    }
}
