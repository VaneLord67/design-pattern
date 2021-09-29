package bridge;

import java.sql.Ref;

/**
 * @author CJR
 * @create 2021-09-25-15:03
 */
public abstract class RefinedCar extends Car{

    public RefinedCar(Engine engine){
        super(engine);
    }
    @Override
    public void drive() {
        this.engine.start();
        System.out.println("Drive" + getBrand() + " car...");
    }
    public abstract String getBrand();
}
