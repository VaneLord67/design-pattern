package exer;

/**
 * @author CJR
 * @create 2021-09-25-19:34
 */
public class Singleton {
    private Singleton(){
    }
    private static volatile Singleton instance;
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
