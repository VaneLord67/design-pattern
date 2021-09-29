package singleton.type8;


public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
    }
}

//枚举
enum Singleton{
    INSTANCE;
}
