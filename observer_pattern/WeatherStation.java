package observer_pattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData inshallah = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(inshallah);

        inshallah.setMeasurements(80,65 , 30.4f);
        inshallah.setMeasurements(82, 70, 29.2f);
        inshallah.setMeasurements(78, 90, 29.2f);

    }
}
