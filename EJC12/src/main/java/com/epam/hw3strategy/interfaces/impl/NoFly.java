package com.epam.hw3strategy.interfaces.impl;

import com.epam.hw3strategy.interfaces.FlyAbility;

public class NoFly implements FlyAbility {
    @Override
    public void fly() {
        System.out.println("This duck can't fly.");
    }
}
