package command;

/**
 * @author CJR
 * @create 2021-09-29-12:30
 */
public class LightOnCommand implements Command{

    //聚合Receiver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
