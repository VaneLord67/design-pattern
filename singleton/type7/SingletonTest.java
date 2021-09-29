package singleton.type7;


public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

//静态内部类
class Singleton{
    //1.私有化构造器
    private Singleton(){
    }
    //2.静态内部类
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    //3.提供静态公有方法
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
