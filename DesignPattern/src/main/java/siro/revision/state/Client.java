package siro.revision.state;

public class Client {
    public static void main(String[] args) {
        GlumballMachine g =new GlumballMachine(3);
        g.ejectQuarter();
    }
    /**
     * @state pattern: define a glumBallMachine with 4 states: HasQuarter, NoQuarter, Sold and SoldOut
     * By default, state of glumBallMachine is SoldOut, and we keep the state in @currentState param
     * Each state implement IState and override methods by itself. By overriding method, states can change
     * current state and internal component of GlumBallMachine
     */
}
