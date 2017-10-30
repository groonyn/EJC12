package com.epam.hw3strategy;
import com.epam.hw3strategy.interfaces.impl.FlyRocketPowered;
/**
* Shows the pattern Strategy abilities
* @author Grunin Nikolay, excersise from Design Patterns book
*/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.toFly();
        mallard.toQuack();
        Duck model = new ModelDuck();
        model.toFly();
        model.toQuack();
        model.setFlyAbility(new FlyRocketPowered());
        model.toFly();
    }
}
