package state;

/**
 * @author CJR
 * @create 2021-10-02-20:27
 */
public interface State {
    void deductMoney();
    boolean raffle();
    void dispensePrize();
}
