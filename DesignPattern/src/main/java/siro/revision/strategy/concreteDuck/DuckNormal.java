package siro.revision.strategy.concreteDuck;

import siro.revision.strategy.Duck;
import siro.revision.strategy.behavior.FlyWithWings;
import siro.revision.strategy.behavior.Quack;

public class DuckNormal extends Duck {
    @Override
    protected void display() {
        System.out.println("I am a duck NORMAL");
    }
    //

    public DuckNormal() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }
}
