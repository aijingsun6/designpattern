package com.alking.java.designpattern.state;

public class RestrictedState extends AccountState {

    private String name = "RestrictedState";

    public RestrictedState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println(name + "account is restricted");
    }

    public void computeInterest() {
        System.out.println(name + "computeInterest");
    }
    public void stateCheck() {
        if(acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        }
        else if(acc.getBalance() > -2000) {
            acc.setState(new OverdraftState(this));
        }
    }
}
