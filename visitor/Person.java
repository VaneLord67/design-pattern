package visitor;

/**
 * @author CJR
 * @create 2021-10-06-20:56
 */
public abstract class Person {
    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
