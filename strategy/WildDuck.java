package strategy;

/**
 * @author CJR
 * @create 2021-10-02-20:00
 */
public class WildDuck extends Duck{
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }
}
