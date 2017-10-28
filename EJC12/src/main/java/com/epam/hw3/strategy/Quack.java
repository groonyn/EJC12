package com.epam.hw3.strategy;

public class Quack implements QuackAbility {
    @Override
    public void quack() {
        System.out.println("Quack, Quack!!!");
    }
}
