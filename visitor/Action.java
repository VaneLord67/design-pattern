package visitor;

/**
 * @author CJR
 * @create 2021-10-06-20:53
 */
public abstract class Action {
    //得到男性 的测评
    public abstract void getManResult(Man man);
    //得到女性 的测评
    public abstract void getWomanResult(Woman woman);
}
