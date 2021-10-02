package strategy;

/**
 * @author CJR
 * @create 2021-10-02-20:00
 */
public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void fly(){
        if(flyBehavior != null){
            flyBehavior.fly();
        }
    }
}
