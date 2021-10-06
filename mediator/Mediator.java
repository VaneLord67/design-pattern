package mediator;

/**
 * @author CJR
 * @create 2021-10-06-15:52
 */
public abstract class Mediator {
    //将中介者对象加入到集合中
    public abstract void register(String colleagueName,Colleague colleague);
    //接受消息，具体的同事对象发出
    public abstract void getMessage(int stateChange,String colleague);
    public abstract void sendMessage();
}
