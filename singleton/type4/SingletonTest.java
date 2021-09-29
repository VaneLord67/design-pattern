package singleton.type4;


public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

//懒汉式（线程安全，同步方法）
class Singleton{
    //1.私有化构造器
    private Singleton(){
    }
    //2.类内部创建对象
    private static Singleton instance;
    //3.对外提供公有静态方法,当使用到instance时才去创建对象
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
