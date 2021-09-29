package singleton.type1;


public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

//饿汉式（静态常量）
class Singleton{
    //1.私有化构造器
    private Singleton(){

    }
    //2.类内部创建对象
    private final static Singleton instance = new Singleton();
    //3.对外提供公有静态方法
    public static Singleton getInstance(){
        return instance;
    }
}
