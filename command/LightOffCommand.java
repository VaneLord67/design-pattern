package command;

/**
 * @author CJR
 * @create 2021-09-29-12:31
 */
public class LightOffCommand implements Command{

    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
