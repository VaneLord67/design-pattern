package mediator;

/**
 * @author CJR
 * @create 2021-10-06-15:58
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator,String name){
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator(){
        return mediator;
    }

    public abstract void sendMessage(int stateChange);
}
