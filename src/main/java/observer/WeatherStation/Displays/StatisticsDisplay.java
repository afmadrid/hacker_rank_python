package observer.WeatherStation.Displays;

import observer.WeatherStation.DisplayElement;
import observer.WeatherStation.Observer;
import observer.WeatherStation.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("Statistics: " + temperature + " F degrees and " + humidity + "% humidity");
    }
}
