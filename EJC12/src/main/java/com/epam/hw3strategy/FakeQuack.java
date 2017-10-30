package com.epam.hw3strategy;

import com.epam.hw3strategy.interfaces.QuackAbility;

public class FakeQuack implements QuackAbility {
    @Override
    public void quack() {
        System.out.println("Fujackack!!!");
    }
}
