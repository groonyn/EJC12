package com.epam.hw3strategy;

import com.epam.hw3strategy.interfaces.impl.Fly;
import com.epam.hw3strategy.interfaces.impl.Quack;

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
