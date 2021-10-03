package state;

/**
 * @author CJR
 * @create 2021-10-02-20:27
 */
public class NoRaffleState implements State{

    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    //当前状态可以扣积分，扣除后将状态设置成可以抽奖状态。
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    //当前状态不能抽奖。
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("当前状态不能发放奖品");
    }
}
