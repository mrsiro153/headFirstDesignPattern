package siro.revision.adapter;

public class ChickenAdapter implements IChicken {
    private IDuck duck;

    public ChickenAdapter(IDuck duck) {
        this.duck = duck;
    }

    @Override
    public void talk() {
        duck.say();
    }

    @Override
    public void walk() {
        duck.go();
    }
}
