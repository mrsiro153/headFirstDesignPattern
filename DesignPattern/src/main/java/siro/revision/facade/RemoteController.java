package siro.revision.facade;

import siro.revision.facade.complexSystem.CoffeeMachine;
import siro.revision.facade.complexSystem.Computer;
import siro.revision.facade.complexSystem.Television;

public class RemoteController {
    //facade class
    private Television television;
    private Computer computer;
    private CoffeeMachine coffeeMachine;

    public RemoteController(Television television, Computer computer, CoffeeMachine coffeeMachine) {
        this.television = television;
        this.computer = computer;
        this.coffeeMachine = coffeeMachine;
    }
    //
    public void startWatchMovie(){
        //assume we need to turn on television, computer, coffee machine to watch movie
        television.turnOn();
        computer.turnOn();
        coffeeMachine.turnOn();
    }
    public void turnOffMovie(){
        //assume we will turn off all system component when movie end
        television.turnOff();
        computer.turnOff();
        coffeeMachine.turnOff();
    }
}
