package visitor;

/**
 * @author CJR
 * @create 2021-10-06-20:54
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
