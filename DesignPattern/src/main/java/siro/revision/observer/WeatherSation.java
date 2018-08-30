package siro.revision.observer;

import siro.revision.observer.display.CurrentConditionsDisplay;

public class WeatherSation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        //
        IObserver currentConditionsDisplay = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.changeWeatherData(5f,4f,55f);
        //

    }
}
