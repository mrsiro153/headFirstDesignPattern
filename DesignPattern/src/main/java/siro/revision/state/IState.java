package siro.revision.state;

public interface IState {
    abstract void insertQuarter();
    abstract void ejectQuarter();
    abstract void turnCrank();
    abstract void dispense();
}
