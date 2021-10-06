package visitor;

/**
 * @author CJR
 * @create 2021-10-06-20:55
 */
public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价：很成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价：很成功");
    }
}
