package siro.revision.state.states;

import siro.revision.state.GlumballMachine;
import siro.revision.state.IState;

public class HasQuarter implements IState {
    //
    private GlumballMachine glumballMachine;

    public HasQuarter(GlumballMachine glumballMachine) {
        this.glumballMachine = glumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println(this.getClass().getName()+"");
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
