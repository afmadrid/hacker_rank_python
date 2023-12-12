package observer.WeatherStation.Displays;

import observer.WeatherStation.DisplayElement;
import observer.WeatherStation.Observer;
import observer.WeatherStation.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.removeObserver(this);
    }

    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    public void display() {
        System.out.println("Forecast: Current pressure -> " + currentPressure);
    }
}
