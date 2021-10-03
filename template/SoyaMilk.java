package template;

/**
 * @author CJR
 * @create 2021-10-03-18:47
 */
public abstract class SoyaMilk {
    //模板方法可以final，不让子类覆盖
    final void make(){
        select();
        add();
        soak();
        beat();
    }
    void select(){
        System.out.println("选材");
    }
    abstract void add();
    void soak(){
        System.out.println("浸泡");
    }
    void beat(){
        System.out.println("打碎");
    }
}
