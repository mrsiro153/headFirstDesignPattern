package siro.revision.observer.display;

import siro.revision.observer.IDisplayElement;
import siro.revision.observer.IObserver;

public class StatisticsDisplay implements IObserver,IDisplayElement {
    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        //what do you want to do after receiving data?

        display();
    }
}
