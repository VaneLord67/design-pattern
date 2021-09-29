package adapter.interfaceadapter;

/**
 * @author CJR
 * @create 2021-09-24-12:10
 */
public class Client {
    public static void main(String[] args) {
        new AbsAdapter() {
            @Override
            public void o1() {
                System.out.println("匿名内部类中只进行o1方法实现");
                ;
            }
        }.o1();
    }
}
