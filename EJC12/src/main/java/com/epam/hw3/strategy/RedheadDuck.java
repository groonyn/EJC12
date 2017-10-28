package com.epam.hw3.strategy;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyAbility = new Fly();
        quackAbility = new Quack();
    }

    @Override
    public void appearance() {
        System.out.println("It is the Redhead Duck.");
    }
}
