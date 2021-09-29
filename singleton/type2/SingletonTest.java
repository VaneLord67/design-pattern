package singleton.type2;


public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

//饿汉式（静态代码块）
class Singleton{
    //1.私有化构造器
    private Singleton(){
    }
    //2.类内部创建对象
    private static Singleton instance;
    //3.在静态代码块中创建单例对象
    static {
        instance = new Singleton();
    }
    //4.对外提供公有静态方法
    public static Singleton getInstance(){
        return instance;
    }
}
