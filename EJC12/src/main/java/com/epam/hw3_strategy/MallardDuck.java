package com.epam.hw3_strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackAbility = new Quack();
        flyAbility = new Fly();
    }

    @Override
    public void appearance() {
        System.out.println("This is the Mallard Duck.");
    }
}
