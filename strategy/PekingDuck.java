package strategy;

/**
 * @author CJR
 * @create 2021-10-02-20:00
 */
public class PekingDuck extends Duck{
    public PekingDuck() {
        flyBehavior = new NoFlyBehavior();
    }
}
