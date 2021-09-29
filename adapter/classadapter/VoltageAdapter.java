package adapter.classadapter;

/**
 * @author CJR
 * @create 2021-09-24-11:39
 */

//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        int dest = src / 44;
        return dest;
    }
}
