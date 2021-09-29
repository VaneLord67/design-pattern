package command;

/**
 * @author CJR
 * @create 2021-09-29-12:30
 */
public interface Command {
    void execute();
    void undo();
}
