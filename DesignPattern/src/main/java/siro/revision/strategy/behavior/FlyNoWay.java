package siro.revision.strategy.behavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("CAN NOT FLY!!");
    }
}
