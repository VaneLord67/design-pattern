package state;

/**
 * @author CJR
 * @create 2021-10-02-20:27
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0; i < 30; i++) {
            System.out.println("--------第" + (i+1) + "次抽奖------------");
            activity.deductMoney();
            activity.raffle();
        }
    }
}
