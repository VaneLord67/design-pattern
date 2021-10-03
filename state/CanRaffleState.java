package state;

import java.util.Random;

/**
 * @author CJR
 * @create 2021-10-02-20:27
 */
public class CanRaffleState implements State{

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖...");
        Random r = new Random();
        int num = r.nextInt(10);
        if(num == 0){
            System.out.println("中奖了");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("没有抽中奖品");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
