package strategy;

/**
 * @author CJR
 * @create 2021-10-02-20:01
 */
public class ToyDuck extends Duck{
    public ToyDuck() {
        flyBehavior = new BadFlyBehavior();
    }
}
