package com.epam.hw3strategy;

import com.epam.hw3strategy.interfaces.impl.NoFly;
import com.epam.hw3strategy.interfaces.impl.NoQuack;

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
