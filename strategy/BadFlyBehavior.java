package strategy;

/**
 * @author CJR
 * @create 2021-10-02-20:00
 */
public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("飞翔技术一般");
    }
}
