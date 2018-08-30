package siro.revision.strategy.concreteDuck;

import siro.revision.strategy.Duck;
import siro.revision.strategy.behavior.FlyNoWay;
import siro.revision.strategy.behavior.QuackMute;

public class DuckFake extends Duck {
    @Override
    public void display() {
        System.out.println("I am a duck FAKE");
    }
    //

    public DuckFake() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new QuackMute());
    }
}
