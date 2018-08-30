package siro.revision.strategy.behavior;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack normal way");
    }
}
