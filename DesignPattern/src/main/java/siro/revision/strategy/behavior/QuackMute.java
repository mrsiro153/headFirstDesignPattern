package siro.revision.strategy.behavior;

public class QuackMute implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("CAN NOT QUACK!!!");
    }
}
