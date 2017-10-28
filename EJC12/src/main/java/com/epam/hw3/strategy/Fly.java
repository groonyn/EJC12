package com.epam.hw3.strategy;

public class Fly implements FlyAbility {
    @Override
    public void fly() {
        System.out.println("Duck fly high in the sky.");
    }
}
