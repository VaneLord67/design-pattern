package memento.atguigu;

/**
 * @author CJR
 * @create 2021-10-06-15:24
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        //保存状态
        originator.setState("状态1");
        careTaker.add(originator.saveStateMemento());
        originator.setState("状态2");
        careTaker.add(originator.saveStateMemento());

        System.out.println("当前状态：" + originator.getState());

        //恢复状态
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("恢复到状态：" + originator.getState());

    }
}
