package com.alking.java.designpattern.state;

/**
 * Created by sunaijing on 2017/6/5.
 */
public abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}
