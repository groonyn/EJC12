package com.epam.hw3.strategy;

public class FakeQuack implements QuackAbility {
    @Override
    public void quack() {
        System.out.println("Fujackack!!!");
    }
}
