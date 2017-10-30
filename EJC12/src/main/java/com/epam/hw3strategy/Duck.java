package com.epam.hw3strategy;

import com.epam.hw3strategy.interfaces.FlyAbility;
import com.epam.hw3strategy.interfaces.QuackAbility;

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

    public void setFlyAbility(FlyAbility fa) {
        flyAbility = fa;
    }

    public void setQuackAbility(QuackAbility qa) {
        quackAbility = qa;
    }
}
