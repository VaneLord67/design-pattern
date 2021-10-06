package memento.atguigu;

/**
 * @author CJR
 * @create 2021-10-06-15:24
 */
public class Originator {
    private String state;
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }

    public Memento saveStateMemento(){
        return new Memento(state);
    }

    //通过备忘录对象，恢复状态
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

}
