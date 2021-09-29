package command;

/**
 * @author CJR
 * @create 2021-09-29-12:38
 */

//没有任何命令，用于空执行
    //用于初始化每个按钮，当调用空命令时，对象什么都不做
        //这也是一种设计模式，可以省去对空的判断
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
