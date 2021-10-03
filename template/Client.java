package template;

/**
 * @author CJR
 * @create 2021-10-03-18:40
 */
public class Client {
    public static void main(String[] args) {
        BlackBeanSoyaMilk blackBeanSoyaMilk = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
    }
}
