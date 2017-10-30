package com.epam.hw3strategy.interfaces.impl;

import com.epam.hw3strategy.interfaces.FlyAbility;

public class Fly implements FlyAbility {
    @Override
    public void fly() {
        System.out.println("Duck fly high in the sky.");
    }
}
