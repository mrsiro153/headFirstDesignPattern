package siro.revision.facade;

import siro.revision.facade.complexSystem.CoffeeMachine;
import siro.revision.facade.complexSystem.Computer;
import siro.revision.facade.complexSystem.Television;

public class Client {
    public static void main(String[] args) {
        Television t = new Television();
        Computer c = new Computer();
        CoffeeMachine cm = new CoffeeMachine();
        //
        RemoteController rm = new RemoteController(t,c,cm);
        rm.startWatchMovie();
        System.out.println("---------------------------Movie end ---------------");
        rm.turnOffMovie();
    }
}
