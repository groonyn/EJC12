package com.epam.hw3.strategy;

public abstract class Duck {
    QuackAbility quackAbility;
    FlyAbility flyAbility;

    public void toFly() {
        flyAbility.fly();
    }

    public void toQuack() {
        quackAbility.quack();
    }

    public abstract void appearance();
}
