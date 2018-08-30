package siro.revision.strategy;

import siro.revision.strategy.behavior.IFlyBehavior;
import siro.revision.strategy.behavior.IQuackBehavior;

abstract public class Duck {
    private IQuackBehavior quackBehavior;
    private IFlyBehavior flyBehavior;
    //
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    //
    protected void swim(){
        System.out.println("All duck can swim");
    }

    protected abstract void display();

    public Duck setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        return this;
    }

    public Duck setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
        return this;
    }
}
