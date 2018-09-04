package siro.revision.state;

import siro.revision.state.states.HasQuarter;
import siro.revision.state.states.NoQuarter;
import siro.revision.state.states.Sold;
import siro.revision.state.states.SoldOut;

public class GlumballMachine {
    private IState hasQuarter;
    private IState noQuarter;
    private IState sold;
    private IState soldOut;
    /**
     * each state can change current state of GlumballMachine through @setSate
     */

    //
    private IState currentState = soldOut;
    private int count = 0;

    public GlumballMachine(int count) {
        this.count = count;
        this.hasQuarter = new HasQuarter(this);
        this.noQuarter = new NoQuarter(this);
        this.sold = new Sold(this);
        this.soldOut = new SoldOut(this);
        if (count > 0)
            currentState = noQuarter;
    }

    //
    public void insertQuarter() {
        currentState.insertQuarter();
    }

    //
    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    //
    void setState(IState state) {
        this.currentState = state;
    }

    //
    void releaseBall() {
        System.out.println("Release ball....");
        if (this.count != 0) {
            count -= 1;
        }
    }
}
