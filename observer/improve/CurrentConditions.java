package observer.improve;

/**
 * @author CJR
 * @create 2021-10-06-21:49
 */
public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    //推送模式
    public void update(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Today Temperature: " + temperature);
        System.out.println("Today Pressure: " + pressure);
        System.out.println("Today Humidity: " + humidity);
    }
}
