//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.registerObserver(currentDisplay);

//        currentDisplay.display();

        weatherData.setMeasurements(80,65, 30.4f);

//        currentDisplay.display();
    }
}