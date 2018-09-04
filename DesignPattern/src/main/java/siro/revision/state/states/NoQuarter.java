package siro.revision.state.states;

import siro.revision.state.GlumballMachine;
import siro.revision.state.IState;

public class NoQuarter implements IState {
    private GlumballMachine glumballMachine;

    public NoQuarter(GlumballMachine glumballMachine) {
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
