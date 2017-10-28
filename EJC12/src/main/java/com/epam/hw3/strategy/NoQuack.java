package com.epam.hw3.strategy;

public class NoQuack implements QuackAbility {
    @Override
    public void quack() {
        System.out.println("...noiseless");
    }
}
