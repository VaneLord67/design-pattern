package bridge;

/**
 * @author CJR
 * @create 2021-09-25-15:05
 */
public class BossCar extends RefinedCar{

    public BossCar(Engine engine){
        super(engine);
    }
    @Override
    public String getBrand() {
        return "Boss";
    }
}
