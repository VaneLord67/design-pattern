package state;

/**
 * @author CJR
 * @create 2021-10-03-17:40
 */
public class RaffleActivity{
    //state表示活动当前的状态，是变化的
    State state = null;
    //奖品数量
    int count = 0;

    //表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    //构造器初始化当前状态（不能抽奖状态）和奖品数量
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    public void deductMoney(){
        state.deductMoney();
    }

    public void raffle(){
        if(state.raffle()){
            state.dispensePrize();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount = count;
        count--;
        return curCount;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

}
