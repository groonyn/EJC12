package com.epam.hw3_strategy;

public class FakeDuck extends Duck {
    public FakeDuck() {
        quackAbility = new NoQuack();
        flyAbility = new NoFly();
    }

    @Override
    public void appearance() {
        System.out.println("This is the Fake Duck, it's not real.");
    }
}
