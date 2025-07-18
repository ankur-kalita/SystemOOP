package observer_pattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temeperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temeperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temeperature + "F degrees and " + humidity + "% humidity");
    }
}
