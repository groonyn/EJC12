package com.epam.hw3strategy;

import com.epam.hw3strategy.interfaces.impl.Fly;
import com.epam.hw3strategy.interfaces.impl.Quack;

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
