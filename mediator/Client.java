package mediator;

/**
 * @author CJR
 * @create 2021-10-06-15:49
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator,"alarm");
        alarm.sendAlarm(0);

    }
}
