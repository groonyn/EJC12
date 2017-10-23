package com.epam.hw3_strategy;

public class NoQuack implements QuackAbility {
    @Override
    public void quack() {
        System.out.println("...noiseless");
    }
}
