package bridge;

/**
 * @author CJR
 * @create 2021-09-25-15:06
 */
public class Client {
    public static void main(String[] args) {
        RefinedCar car = new BossCar(new HybridEngine());
        car.drive();
    }
}
