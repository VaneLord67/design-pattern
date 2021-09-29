package prototype;

/**
 * @author CJR
 * @create 2021-09-23-16:36
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep clone = sheep.clone();
        System.out.println(clone);
    }
}
