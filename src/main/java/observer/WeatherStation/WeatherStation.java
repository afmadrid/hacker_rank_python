package observer.WeatherStation;

import observer.WeatherStation.Displays.CurrentConditionsDisplay;
import observer.WeatherStation.Displays.ForecastDisplay;
import observer.WeatherStation.Displays.HeatIndexDisplay;
import observer.WeatherStation.Displays.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);
        weatherData.registerObserver(forecastDisplay);
        weatherData.registerObserver(heatIndexDisplay);
        weatherData.setMeasurements(80, 65, 30.4f);

        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(78, 90, 29.0f);

        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(87, 40, 28.0f);

    }
}
