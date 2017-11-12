package com.epam.hw4;
public class Player {

    private String name;
    private int balance;

    public Player(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void increaseBalance(int count) {
        this.balance = balance + count;
    }

    public void decreaseBalance(int count) {
        this.balance = balance - count;
    }

    public int getBalance(){
        return this.balance;
    }
}