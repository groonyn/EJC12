package com.epam.hw3.strategy;

public class NoFly implements FlyAbility {
    @Override
    public void fly() {
        System.out.println("This duck can't fly.");
    }
}
