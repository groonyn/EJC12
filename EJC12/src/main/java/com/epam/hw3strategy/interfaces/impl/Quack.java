package com.epam.hw3strategy.interfaces.impl;

import com.epam.hw3strategy.interfaces.QuackAbility;

public class Quack implements QuackAbility {
    @Override
    public void quack() {
        System.out.println("Quack, Quack!!!");
    }
}
