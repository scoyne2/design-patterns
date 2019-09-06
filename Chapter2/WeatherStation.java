public class WeatherStation{
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StaticDisplay staticDisplay = new StaticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurments(80,65,30.4f);
        weatherData.setMeasurments(82,70,29.2f);
        weatherData.setMeasurments(78,90,29.2f);


    }
}