package siro.revision.observer.display;

import siro.revision.observer.IDisplayElement;
import siro.revision.observer.IObserver;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private float temp;
    private float humidity;

    //
    @Override
    public void display() {
        System.out.println("I am: " + this.getClass().getName() + " with temp: " + temp + " and humidity: " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();

    }
}
