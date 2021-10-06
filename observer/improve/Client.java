package observer.improve;

import observer.improve.WeatherData;

/**
 * @author CJR
 * @create 2021-10-06-22:10
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions();

        weatherData.registerObserver(currentConditions);

        weatherData.setData(10,100,30.3f);
    }
}
