package observerPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
        System.out.println("CurrentConditionsDisplay 등록");
        display();
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();

        System.out.println("CurrentConditionsDisplay 업데이트");
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format(">> [CurrentConditionsDisplay Status] 온도: %f , 습도: %f", this.temperature, this.humidity));
    }
}
