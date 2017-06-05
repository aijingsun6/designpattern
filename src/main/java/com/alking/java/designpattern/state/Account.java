package com.alking.java.designpattern.state;

public class Account {
    private AccountState state;
    private String owner;
    private double balance = 0;

    public Account(String owner,double init) {
        this.owner = owner;
        this.balance = init;
        this.state = new NormalState(this);
        System.out.println(this.owner + ",init:" + init);
        System.out.println("---------------------------------------------");
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "deposit" + amount);
        state.deposit(amount);
        System.out.println("left"+ this.balance);
        System.out.println("state"+ this.state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "withdraw" + amount);
        state.withdraw(amount);
        System.out.println("balance"+ this.balance);
        System.out.println("state"+ this. state.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void computeInterest()
    {
        state.computeInterest();
    }
}
