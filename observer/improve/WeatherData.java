package observer.improve;

import observer.CurrentConditions;

import java.util.ArrayList;

/**
 * @author CJR
 * @create 2021-10-06-21:52
 */
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;
    private ArrayList<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
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
        notifyObservers();
    }

    //当数据有更新时就调用setData
    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o))
            observers.remove(o);
    }

    //遍历所有的观察者
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(getTemperature(),getPressure(),getHumidity());
        }
    }
}
