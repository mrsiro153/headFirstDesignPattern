package siro.revision.strategy.concreteDuck;

import siro.revision.strategy.Duck;
import siro.revision.strategy.behavior.FlyWithWings;
import siro.revision.strategy.behavior.QuackSpecialWay;

public class DuckSpecial extends Duck {
    @Override
    protected void display() {
        System.out.println("I am a duck SPECIAL");
    }

    public DuckSpecial() {
        setQuackBehavior(new QuackSpecialWay());
        setFlyBehavior(new FlyWithWings());
    }
}
