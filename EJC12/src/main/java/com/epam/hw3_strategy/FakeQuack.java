package com.epam.hw3_strategy;

public class FakeQuack implements QuackAbility {
    @Override
    public void quack() {
        System.out.println("Fujackack!!!");
    }
}
