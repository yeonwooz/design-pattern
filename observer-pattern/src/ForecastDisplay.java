public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
        System.out.println("ForecastDisplay 등록");
        display();
    }

    @Override
    public void update() {
        lastPressure = this.currentPressure;
        this.currentPressure = weatherData.getPressure();

        System.out.println("ForecastDisplay 업데이트");
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format(">> [ForecastDisplay Status] 이전 기압 : %f, 현재 기압: %f", this.lastPressure, this.currentPressure));
    }
}
