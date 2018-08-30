package siro.revision.observer;

import java.util.ArrayList;

public class WeatherData implements ISubject {
    //
    private ArrayList<IObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int i = this.observers.indexOf(observer);
        if (i > 0) this.observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for (IObserver iObserver : observers) {
            iObserver.update(this.temperature, this.humidity, this.pressure);
        }
    }
    //
    public void changeWeatherData(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //
        notifyObserver();
    }
}
