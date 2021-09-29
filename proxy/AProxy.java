package proxy;

/**
 * @author CJR
 * @create 2021-09-25-16:08
 */
public class AProxy implements A{
    private A a;
    private User user;
    public AProxy(A a){
        this.a = a;
    }
    @Override
    public void a() {
        user = new User();
        System.out.println("代理a方法");
        if(user.getRoot()){
            this.a.a();
        } else {
            System.out.println("not root!");
        }
    }
}
