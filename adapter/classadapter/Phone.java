package adapter.classadapter;

/**
 * @author CJR
 * @create 2021-09-24-11:40
 */

public class Phone {
    public void charge(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        } else {
            System.out.println("电压不匹配，无法充电");
        }
    }
}
