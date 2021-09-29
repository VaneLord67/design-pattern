package factory.simple;

/**
 * @author CJR
 * @create 2021-09-22-13:24
 */
public class PizzaTest {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
