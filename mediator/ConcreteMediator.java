package mediator;

import java.util.HashMap;

/**
 * @author CJR
 * @create 2021-10-06-16:03
 */
public class ConcreteMediator extends Mediator{
    //集合，放入了所有的同事对象
    private HashMap<String,Colleague> colleagueMap;
    private HashMap<String,String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<String,Colleague>();
        interMap = new HashMap<String,String>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName,colleague);
        if(colleague instanceof Alarm){
            interMap.put("Alarm",colleagueName);
        }
    }

    //具体中介者的核心方法
    //根据得到消息，完成对应任务
    //中介者在这个方法，协调各个具体的同事对象，完成任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if(colleagueMap.get(colleagueName) instanceof Alarm){
            if(stateChange == 0){
                //TODO 接收消息，做出处理
                System.out.println("处理闹钟");
            }
        }
    }

    @Override
    public void sendMessage() {
        //TODO
    }
}
