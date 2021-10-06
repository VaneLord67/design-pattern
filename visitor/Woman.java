package visitor;

/**
 * @author CJR
 * @create 2021-10-06-20:54
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
