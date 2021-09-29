package proxy;

/**
 * @author CJR
 * @create 2021-09-25-16:11
 */
public class Client {
    public static void main(String[] args) {
        A a = new AProxy(new ARealized());
        a.a();
    }
}
