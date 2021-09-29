package factory.simple;

import java.util.Scanner;

/**
 * @author CJR
 * @create 2021-09-22-13:17
 */
public class OrderPizza {
    Pizza pizza = null;
    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if(pizza != null){
                System.out.println("制作披萨...");
            } else {
                System.out.println("订购披萨失败!");
                break;
            }
        } while (true);
    }

    private String getType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("要订购的披萨种类：");
        String orderType = scanner.next();
        return orderType;
    }
}
