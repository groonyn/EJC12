package com.epam.hw3strategy;

import com.epam.hw3strategy.interfaces.impl.NoFly;
import com.epam.hw3strategy.interfaces.impl.NoQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackAbility = new NoQuack();
        flyAbility = new NoFly();

    }
    public void appearance() {
        System.out.println("Model Duck!");
    }
}
