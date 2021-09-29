package bridge;

/**
 * @author CJR
 * @create 2021-09-25-15:02
 */
public abstract class Car {
    protected Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    public abstract void drive();
}
