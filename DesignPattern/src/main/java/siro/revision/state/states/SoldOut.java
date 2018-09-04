package siro.revision.state.states;

import siro.revision.state.GlumballMachine;
import siro.revision.state.IState;

public class SoldOut implements IState {
    private GlumballMachine glumballMachine;

    public SoldOut(GlumballMachine glumballMachine) {
        this.glumballMachine = glumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
