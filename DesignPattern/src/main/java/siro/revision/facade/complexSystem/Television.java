package siro.revision.facade.complexSystem;

public class Television {
    //
    public void turnOn(){
        System.out.println(this.getClass().getName()+" turn on");
    }
    public void turnOff(){
        System.out.println(this.getClass().getName()+" turn off");
    }
}
