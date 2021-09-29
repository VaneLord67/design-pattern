package singleton.type6;


public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

//双重检查
class Singleton{
    //1.私有化构造器
    private Singleton(){
    }
    //2.类内部创建对象,volatile保证一个线程创建实例后，另一个线程立马可见
    private static volatile Singleton instance;
    //3.提供静态公有方法，双重检查，解决线程安全以及懒加载问题
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
