package adapter.classadapter;

/**
 * @author CJR
 * @create 2021-09-24-11:37
 */

//被适配的类
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("电压：" + src + "伏");
        return src;
    }
}
