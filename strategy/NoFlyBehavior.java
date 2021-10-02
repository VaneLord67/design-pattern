package strategy;

/**
 * @author CJR
 * @create 2021-10-02-20:00
 */
public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
