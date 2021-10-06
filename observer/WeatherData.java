package observer;

/**
 * @author CJR
 * @create 2021-10-06-21:52
 */
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions){
        this.currentConditions = currentConditions;
    }

    public float getTemperature(){
        return temperature;
    }

    public float getPressure(){
        return pressure;
    }

    public float getHumidity(){
        return humidity;
    }

    public void dataChange(){
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    //当数据有更新时就调用setData
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
}
