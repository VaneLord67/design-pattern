package chain;

import java.math.BigDecimal;

/**
 * @author CJR
 * @create 2021-09-25-16:28
 */
public class Client {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new ManagerHandler());
        chain.addHandler(new DirectorHandler());
        chain.addHandler(new CEOHandler());

        chain.process(new Request("Bob",new BigDecimal(123.45)));
    }
}
