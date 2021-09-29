package adapter.objectadapter;

/**
 * @author CJR
 * @create 2021-09-24-11:39
 */

//适配器类
public class VoltageAdapter implements IVoltage5V {
    Voltage220V voltage220V;
    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5V() {
        int dest = 0;
        if(voltage220V != null){
            int src = voltage220V.output220V();
            dest = src / 44;
        }
        return dest;
    }
}
