package adapter.classadapter;

/**
 * @author CJR
 * @create 2021-09-24-11:41
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }
}
